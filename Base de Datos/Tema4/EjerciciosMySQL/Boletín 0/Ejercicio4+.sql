use boletin0;

-- Ejercicio 4 --
alter table profesores
add column Edad int;

-- Ejercicio 5 --
alter table profesores
add check (Edad between 18 and 65);

alter table cursos
add check (Max_alumnos > 10);

/* Debido a que dentro de Num_Horas había un valor menor 
a 100, de error. Así que debemos cambiar ese valor a 100 */

update cursos
set Num_Horas = 100
where Num_Horas <100;

alter table cursos
add check (Num_Horas >= 100);

-- Ejercicio 6 --
alter table alumnos
add check (Sexo in ('H','M'));

alter table alumnos
drop check sexo;

-- Ejercicio 7 --
/* Dado que en nuestro caso la columna en cuestión tiene
valores duplicados no se podría introducir el check, pero la
afirmación presentada en el ejercicio es correcta */

-- Ejercicio 8 --
alter table profesores
modify column Gana int;

-- Ejercicio 9 --
alter table cursos
modify column Fecha_Inicio date not null;

-- Ejercicio 10 --
alter table profesores
drop constraint pk_Profesores;

alter table Profesores
add constrain         t pk_Profesores primary key (Nombre, Apellido1, Apellido2);
/*Esta sería la forma correcta, sin embargo, no es posible 
establecer más de una clave primaria en una única tabla */

-- Ejercicio 11 --
insert into Profesores(Nombre, Apellido1, Apellido2, DNI, Dirección, Título, Edad)
values('Laura', 'Jimenez', 'Sanz', '12345678A', 'Real, 13', 'Ing. Industrial', "19");

insert into Alumnos(DNI, Nombre, Apellido1, Apellido2, Dirección, Sexo, Fecha_Nacimiento, Curso)
values("33139426Z", "Estanislao", "Torres", "Cacho", "Calle, 8", "H", "93-12-12", "2");

-- Ejercicio 12 --
update Alumnos
set Fecha_Nacimiento = '76-12-23'
where DNI = "33139426Z";

-- Ejercicio 13 --
update Alumnos
set Curso = "1"
where DNI = "33139426Z";

-- Ejercicio 14 --
update Alumnos
set Curso = "7"
where DNI = "33139426Z";

-- Ejercicio 15 --
delete from profesores
where (Nombre = 'Laura') and (Apellido1 = 'Jimenez');

-- Ejercicio 16 --
delete from profesores
where(Nombre = "María") and (Apellido1 = "Oliva");

-- Ejercicio 17 --


-- Ejercicio 18 --
create table Nombre_De_Alumnos(
Nombre_Completo varchar(300)
);

insert into Nombre_De_Alumnos(Nombre_Completo)
select concat(Nombre, " ", Apellido1, " ", Apellido2)
from Alumnos;

-- Ejercicio 19 --
drop table Profesores;
drop table Alumnos;
drop table Cursos;
drop table Nombre_De_Alumnos;