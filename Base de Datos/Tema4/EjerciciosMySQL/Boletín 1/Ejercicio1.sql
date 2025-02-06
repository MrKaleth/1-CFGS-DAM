-- Ejercicio 1 --
create database boletin1;
use boletin1;

create table Empleado(
DNI char(9),
Nombre varchar(20) not null,
Apellido1 varchar(20),
Apellido2 varchar(20),
Direccion varchar(20),
Ciudad varchar(20),
Municipio varchar(20),
Cod_Postal char(5),
Sexo char(1),
Fecha_Nacimiento date,
constraint pk_dni primary key(DNI),
constraint ch_sexo check(Sexo in ("H", "M", "h", "m"))
);

create table Historial_Salarial(
DNI_Empleado char(9),
Salario decimal(6,2) not null unique,
Fecha_Inicio date not null,
Fecha_Fin date,
constraint ck_Fecha_Salarial check(Fecha_Inicio < Fecha_Fin),
constraint fk_dni1 foreign key (DNI_Empleado) references Empleado(DNI),
constraint pk_HistoSal primary key (Dni_Empleado, Salario, Fecha_Inicio)
);

Create table Universidad(
Cod_Universidad int,
Nombre varchar(30) not null,
Ciudad varchar(20),
Cod_Postal char(5),
constraint pk_codUni primary key(Cod_Universidad)
);

create table Estudio(
DNI_Empleado char(9),
Cod_Universidad int,
Fecha_Fin date,
Título varchar(30) not null,
Especialidad varchar(30),
constraint fk_dni2 foreign key (Dni_Empleado) references Empleado(DNI),
constraint fk_CodUni1 foreign key(Cod_Universidad) references Universidad(Cod_Universidad),
constraint pk_Estudio primary key(Dni_Empleado, Cod_Universidad)
);

create table Departamento(
Cod_Departamento int unique auto_increment,
Nombre varchar(30) not null unique,
DNI_Jefe char(9),
Presupuesto decimal(6,2) not null,
constraint fk_dniJefe foreign key(DNI_Jefe) references Empleado(DNI),
constraint pk_CodDepa1 primary key(Cod_Departamento)
);

create table Trabajo(
Cod_Trabajo int unique auto_increment,
Nombre varchar(30) not null unique,
Salario_Max decimal(6,2) not null,
Salario_Min decimal(6,2) not null,
constraint pk_CodTrab primary key(Cod_trabajo)
);

create table Historial_Laboral(
DNI_Empleado char(9),
Cod_Trabajo int unique,
Cod_Departamento int,
Fecha_Inicio date not null,
Fecha_Fin date,
DNI_Superior char(9),
constraint ck_Fecha_Laboral check(Fecha_Inicio < Fecha_Fin),
constraint fk_DniEmp3 foreign key(DNI_Empleado) references Empleado(DNI),
constraint fk_CodTrab1 foreign key(Cod_Trabajo) references Trabajo(Cod_Trabajo),
constraint cd_CodDepa2 foreign key(Cod_Departamento) references Departamento(Cod_Departamento),
constraint pk_HistoLab primary key(DNI_Empleado, Cod_Trabajo, Cod_Departamento)
);