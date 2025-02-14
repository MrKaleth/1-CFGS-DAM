-- Ejercicio 1 --
show grants for 'root'@'localhost';

-- Ejercicio 2 --
create user 'Administrador'@'localhost' identified by 'pass_admin';
create role 'Admin_C';
grant all privileges on *.* to 'Admin_C' with grant option;
grant 'Admin_C' to 'Administrador'@'localhost';
show grants for 'Administrador'@'localhost';

create role 'Admin_D';
grant all privileges on *.* to 'Admin_D' with grant option;
create user 'Administrador2'@'localhost' identified by 'pass_admin';
grant 'Admin_D' to 'Administrador2'@'localhost';
SET DEFAULT ROLE 'Admin_D' TO 'Administrador2'@'localhost';
show grants for 'Administrador2'@'localhost';

-- Ejercicio 3 --
/* Hecho */

-- Ejercicio 4 --
select user from mysql. user;
select user();

-- Ejercicio 5 --
show grants;

-- Ejercicio 6 --
create table Alumno (
    Identificador int primary key auto_increment,
    Nombre varchar(100) not null
);

insert into Alumno (Nombre) values
('Juan Pérez'),
('María Gómez'),
('Carlos López'),
('Ana Torres'),
('Luis Fernández');
