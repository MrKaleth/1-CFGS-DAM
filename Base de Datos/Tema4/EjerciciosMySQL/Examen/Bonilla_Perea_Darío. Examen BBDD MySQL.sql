create database bonilla_Darío;
use bonilla_darío;

-- Parte 1 --

create table Pista(
id int auto_increment,
letra char(1),
tipo varchar(50),
tipo_iluminacion enum("500LM", "1000LM"),
constraint pk_pista primary key (id)
);

create table estado_Pista(
id int auto_increment,
operativa enum("Disponible", "No disponible") default("No disponible"),
fecha_ult_revision date,
pista int default("null"),
constraint pk_estado_pista primary key (id),
constraint fk_estado_pista foreign key (pista) references Pista(id) on delete cascade
);

create table Jugador(
id int auto_increment,
dni char(9),
nombre varchar(300) not null,
apellidos varchar(300),
telefono varchar(50),
entrenador varchar(300),
constraint pk_jugador primary key (id)
);

create table reserva(
pista int,
jugador int,
fecha date,
precio decimal(10, 2),
observaciones text,
constraint pk_reserva primary key (fecha),
constraint fk1_reserva foreign key (pista) references Pista(id) on delete cascade,
constraint fk2_reserva foreign key (jugador) references Jugador(id) on delete cascade,
constraint ch_reserva check(precio < 100)
);

create table Pareja(
id int auto_increment,
jugador1 int not null unique,
jugador2 int not null unique,
fecha_creacion date,
nombre varchar(300) not null unique,
constraint pk_pareja primary key (id),
constraint fk1_pareja foreign key (jugador1) references Jugador(id) on delete cascade,
constraint fk2_pareja foreign key (jugador2) references Jugador(id) on delete cascade

);

create table Partido(
pareja1 int not null unique,
pareja2 int not null unique,
fecha date,
puntos_pareja1 int,
puntos_pareja2 int,
valoracion text,
constraint pk_partido primary key (fecha),
constraint fk1_partido foreign key (pareja1) references Pareja(id) on delete cascade,
constraint fk2_partido foreign key (pareja2) references Pareja(id) on delete cascade,
constraint ch1_partido check(puntos_pareja1 >=1),
constraint ch2_partido check(puntos_pareja2 >=1)
);

-- Parte 2 --

-- Ejercicio 2 --

insert into Jugador(dni, nombre, apellidos, telefono, entrenador)
values
("47568789M", "Enrique", "Pérez de la Fuente", "+34 627797910", "Rafael"),
("28488404Y", "Pablo", "López Carbonell", "+34 620603311", "Carolina"),
("58476502Z", "Estefanía", "Salas Rodriguez", "+34 635435614", "Afonso"),
("78485651P", "Susana", "Mayas Copón", "+34 954654147", "Maite");

insert into Pareja(jugador1, jugador2, fecha_creacion, nombre)
values
(1, 2, "2025-01-28", "Viso Team"),
(3, 4, "2025-01-28", "Mairena Team");

insert into Partido(pareja1, pareja2, fecha, puntos_pareja1, puntos_pareja2, valoracion)
values
(1, 2, "2025-01-30", 12, 15, "Mairena Team ha resultado vencedor con un resultado de 12-15 a favor");

-- Ejercicio 3 --

insert into Jugador(dni, nombre, apellidos, telefono, entrenador)
values("25632114L", "Gloria", "Ríos de la Plaza", "+34 9555555", "Hugo");

insert into Pista(letra, tipo, tipo_iluminacion)
values("A", "Tierra Batida", "1000LM");

insert into Reserva(pista, jugador, fecha, precio, observaciones)
values(1, 5, "2025-02-28", "50.99", "Reserva realizada para la ejecución de un torneo juvenil de pádel" );

-- Ejercicio 4 --

alter table estado_pista
add column url_imagen_pista varchar(150) default "www.url.com/pista_default";

insert into estado_pista(fecha_ult_revision, pista)
values ("2025-01-02", 1);


-- Ejercicio 6 --
update jugador set id = '6' where (id = '2');

/*
Si cambio el identificador de Pablo y creo una nueva entrada de datos en la tabla jugadores, el valor de id que esta nueva entrada tomará no será el antiguo id de Pablo (2), 
sino que tomará el siguiente valor correspondiente siguiendo el autoincremento. Así, si creamos una nueva entrada el valor de su id será 7 pues si bien tocaría ser id 6, este ya está 
ocupado por Pablo. El id 2 seguirá sin ocupar a menos que nosotros añadamos manualmente una entrada a la tabla jugadores cuyo valor de id será 2.
*/

-- Drop de la Base de datos --

drop database bonilla_darío;
