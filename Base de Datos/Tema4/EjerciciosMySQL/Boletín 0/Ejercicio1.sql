create database boletin0;
use boletin0;

create table Alumnos(
DNI char(9),
Nombre varchar(50),
Apellido1 varchar(50),
Apellido2 varchar(50),
Dirección varchar(100),
Sexo char(1) check(Sexo in ('M','H')),
Fecha_Nacimiento date,
curso varchar(50) not null,
constraint pk_Alumnos primary key(DNI)
);

create table Cursos(
Nombre_Curso varchar(50) unique not null,
Cod_Curso char(5) ,
DNI_profesor char(9),
Max_Alumnos int,
Fecha_Inicio date,
Fecha_Fin date,
Num_Horas int not null,
constraint pk_Cursos primary key(Cod_Curso)
);

create table Profesores(
Nombre varchar(50),
Apellido1 varchar(50),
Apellido2 varchar(50),
DNI char(9),
Dirección varchar(100),
Título varchar(50),
Gana int not null,
constraint pk_Profesores primary key(DNI)
);
