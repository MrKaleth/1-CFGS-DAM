create database simulacro;
use simulacro;

create table jugadores(
codigo int primary key,
Nombre varchar(30),
Procedencia varchar(20),
Altura varchar(4),
Peso int,
Posicion varchar(5),
Nombre_equipo varchar(20)
);
create table estadisticas(
temporada varchar(5) primary key,
jugador int,
puntos_por_partido Float,
Asistencias_por_partido float,
Tapones_por_partido float,
Rebotes_por_partido float,
FOREIGN KEY (jugador) REFERENCES jugadores(codigo)
);
create table equipos (
Nombre varchar(20) primary key,
ciudad varchar(20),
conferencia varchar(4),
division varchar (9)
);
create table partidos (
codigo int primary key,
equipo_local varchar(20),
equipo_visitante varchar(20),
puntos_local int,
puntos_visitante int,
temporada varchar(5),
FOREIGN KEY (equipo_local) REFERENCES equipos(Nombre),
FOREIGN KEY (equipo_visitante) REFERENCES equipos(Nombre)
);
ALTER TABLE jugadores
ADD CONSTRAINT nombre_equipos FOREIGN KEY (Nombre_equipo) REFERENCES equipos(Nombre);

ALTER TABLE estadisticas
DROP PRIMARY KEY;

ALTER TABLE estadisticas
ADD PRIMARY KEY (temporada, jugador);

INSERT INTO equipos (Nombre, ciudad, conferencia, division)
VALUES
    ('Arsenal', 'Londres', 'EPL', 'Premier'),
    ('Barcelona', 'Barcelona', 'LG', '1º'),
    ('Real Madrid', 'Madrid', 'LG', '1º'),
    ('Paris Saint-Germain', 'París', 'B1', 'Ligue 1'),
    ('Bayern Munich', 'Múnich', 'BL', 'Bundeslig'),
    ('Juventus', 'Turín', 'SA', 'Serie A');

INSERT INTO jugadores (codigo, Nombre, Procedencia, Altura, Peso, Posicion, Nombre_equipo)
VALUES
    (1, 'André', 'Ghana', '1.80', 78, 'DEL', 'Arsenal'),
    (2, 'Alfredo', 'Argentina', '1.78', 75, 'DEL', 'Real Madrid'),
    (3, 'Arsène', 'Francia', '1.82', 74, 'ENT', 'Arsenal'),
    (4, 'Lionel', 'Argentina', '1.70', 72, 'DEL', 'Paris Saint-Germain'),
    (5, 'Cristiano', 'Portugal', '1.87', 85, 'DEL', 'Juventus'),
    (6, 'Neymar Jr.', 'Brasil', '1.75', 68, 'DEL', 'Paris Saint-Germain'),
    (7, 'Sergio', 'España', '1.83', 82, 'DEF', 'Paris Saint-Germain'),
    (8, 'Kylian', 'Francia', '1.78', 73, 'DEL', 'Paris Saint-Germain'),
    (9, 'Alexandre', 'Francia', '1.75', 73, 'DEL', 'Arsenal'),
    (10, 'Aaron', 'Gales', '1.78', 72, 'MED', 'Juventus');

INSERT INTO estadisticas (temporada, jugador, puntos_por_partido, Asistencias_por_partido, Tapones_por_partido, Rebotes_por_partido)
VALUES
    ('2024', 1, 20.5, 5.1, 0.7, 8.2),
    ('2024', 2, 15.2, 3.4, 1.2, 6.1),
    ('2024', 3, 10.8, 4.0, 0.3, 4.5),
    ('2024', 4, 25.1, 6.3, 0.5, 5.9),
    ('2024', 5, 28.3, 3.1, 0.8, 6.7);
    
    
INSERT INTO partidos (codigo, equipo_local, equipo_visitante, puntos_local, puntos_visitante, temporada)
VALUES
    (1, 'Arsenal', 'Barcelona', 95, 88, '2025'),
    (2, 'Real Madrid', 'Paris Saint-Germain', 100, 90, '2025'),
    (3, 'Bayern Munich', 'Juventus', 110, 99, '2025'),
    (4, 'Arsenal', 'Bayern Munich', 85, 94, '2025'),
    (5, 'Barcelona', 'Real Madrid', 92, 98, '2025');
    
/*Ejercicio 1 Muestra todos los datos de los jugadores, cuyo nombre empieza por A 
y termina por e, juegan en la división central y su peso está por encima de la media. */

-- Mio --
select *
from jugadores
join equipos on equipos.nombre = jugadores.nombre_equipo
where jugadores.nombre like 'A%e'
and jugadores.peso > (
	select avg(peso) 
    from jugadores
)
and equipos.division = 'Premier';

-- Cristina --
select * from jugadores 
join equipos on equipos.nombre=jugadores.Nombre_equipo
where jugadores.Nombre like'A%e' 
and equipos.division='Premier' 
and jugadores.peso > (select avg (peso) from jugadores);

/*Ejercicio 2 Muestra la mayor y menor asistencia por partido total 
de entre aquellos jugadores cuyo equipo juega en la conferencia East. */

-- Mio --
select max(asistencias_por_partido), min(asistencias_por_partido)
from estadisticas
join jugadores on estadisticas.jugador = jugadores.codigo
join equipos on jugadores.nombre_equipo = equipos.nombre
where equipos.conferencia = 'EPL';


-- Cristina --
select max(Asistencias_por_partido),min(asistencias_por_partido) 
from estadisticas
join jugadores on estadisticas.jugador=jugadores.codigo
join equipos on jugadores.nombre_equipo=equipos.nombre
where equipos.conferencia='EPL';

/*Ejercicio 3 Muestra los datos de los partidos de aquellos equipos en el que juega 
el jugador con mayor peso de la liga. */
select p.*,el.nombre as equipo_local,ev.nombre as equipo_visitante
from partidos p
join equipos el on p.equipo_local=el.nombre
join equipos ev on p.equipo_visitante=ev.nombre
join jugadores jl on el.nombre=jl.nombre_equipo
join jugadores jv on ev.nombre=jv.nombre_equipo
where (jl.peso = (select max(peso) from jugadores) 
or jv.peso=(select max(peso) from jugadores));

/*Segunda parte */
/*Ejercicio 1 Muestra todos los datos de los equipos de aquellos 
que nunca han jugado un partido, ni como local ni como visitante.*/

select * from equipos
WHERE NOT EXISTS (
  SELECT 1 FROM partidos
  where partidos.equipo_local=equipos.nombre
  or partidos.equipo_visitante=equipos.nombre
  );

/*Ejercicio 2  Muestra el nombre del jugador, la posición que ocupa y la media de rebotes
 por partido a lo largo de la historia, para cada jugador siempre y cuando dicha media 
 sea superior a 8 puntos. Redondea el valor de la media.*/
 
 select j.nombre,j.posicion,
 round(avg(e.rebotes_por_partido)) as media_rebotes
 from jugadores j
 join estadisticas e on j.codigo=e.jugador
 group by j.nombre, j.posicion
 having avg(e.rebotes_por_partido)>8;
 
 /*Ejercicio 3  Cuenta el número de jugadores que tiene cada equipo y 
 ordena el listado de mayor a menor. No olvides que en dicho listado, 
 si el equipo tiene 0 jugadores también debe aparecer. 
 En caso de empate en la ordenación por número de jugadores, 
 ordena por el nombre del equipo.*/
 
 select equipos.nombre,
 count(jugadores.codigo) as numero_jugadores from equipos 
 left join jugadores on  equipos.nombre=jugadores.nombre_equipo
 group by
 equipos.nombre
 order by numero_jugadores desc,
 equipos.nombre asc;