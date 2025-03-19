-- Ejercicio 1 --
create user 'Dario'@'localhost' identified by 'pass';
alter user 'Dario'@'localhost' account unlock;

-- Ejercicio 2 --
alter user 'Dario'@'localhost' identified by 'DaM1234';

-- Ejercicio 3 --
create database examen;
use examen;

create table Persona (
id int auto_increment primary key,
nombre varchar(50)
);

create table cuenta (
id_Cuenta int auto_increment primary key,
id_Usuario int,
nombre_Cuenta varchar(100),
constraint foreign key (id_Usuario) references Persona(id)
);

-- Ejercicio 4 --
insert into persona (nombre)
values ('Pepe');
insert into persona (nombre)
values ('Zoe');
insert into persona (nombre)
values ('Ana');
insert into persona (nombre)
values ('Parrado');


insert into cuenta(id_Usuario, nombre_Cuenta)
values(1, 'aa');
insert into cuenta(id_Usuario, nombre_Cuenta)
values(2, 'bb');
insert into cuenta(id_Usuario, nombre_Cuenta)
values(3, 'cc');
insert into cuenta(id_Usuario, nombre_Cuenta)
values(4, 'dd');

-- Ejercicio 5 --
drop view vista_AA;
create view vista_AA as(
select id_Usuario, nombre_Cuenta from cuenta
union
select * from persona
);

select * from vista_AA;

-- Ejercicio 6 --
create user 'Testing'@'localhost' identified by 'pass';
grant select on examen.vista_AA to 'Testing'@'localhost';

-- Ejercicio 7 --
drop user 'Testing'@'localhost';