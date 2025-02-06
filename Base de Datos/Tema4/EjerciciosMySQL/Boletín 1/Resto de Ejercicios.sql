use boletin1;
-- Ejercicio 2 --

-- Empleados --
insert into empleado(DNI, Nombre, Apellido1, Apellido2, Direccion, ciudad, Municipio, Cod_Postal, Sexo, Fecha_Nacimiento)
values("14480143X", "Arturo", "Pérez", "Reverte", "Calle Estrella, 9", "Madrid", "Madarcos", "28755", "H", "1951-11-25");

insert into empleado(DNI, Nombre, Apellido1, Apellido2, Direccion, ciudad, Municipio, Cod_Postal, Sexo, Fecha_Nacimiento)
values("29891575Q", "Jose Antonio", "Domínguez", "Banderas", "Calle Nueva, 12", "Sevilla", "Bormujos", "41930", "H", "1960-8-10");

insert into empleado(DNI, Nombre, Apellido1, Apellido2, Direccion, ciudad, Municipio, Cod_Postal, Sexo, Fecha_Nacimiento)
values("15990056L", "Williard", "Carroll", "Smith II", "Calle Blanchard, 1", "Pensilvania", "Filadelfia", "52135", "H", "1968-9-25");

-- Historial Salarial --
insert into historial_salarial(DNI_Empleado, Salario, Fecha_Inicio, Fecha_Fin)
values("14480143X", 2025.00, "2006-06-30", "2012-7-25");

insert into historial_salarial(DNI_Empleado, Salario, Fecha_Inicio, Fecha_Fin)
values("29891575Q", 8500.9, "2023-9-15", "2024-12-17");

insert into historial_salarial(DNI_Empleado, Salario, Fecha_Inicio, Fecha_Fin)
values("15990056L", 9531.05, "2022-2-14", "2023-3-15");

-- Universidad --

insert into Universidad(Cod_Universidad, Nombre, Ciudad, Cod_Postal)
values(1, "Universidad de Sevilla", "Sevilla", "41004");

insert into Universidad(Cod_Universidad, Nombre, Ciudad, Cod_Postal)
values(2, "Universidad de Madrid", "Madrid", "28040");

insert into Universidad(Cod_Universidad, Nombre, Ciudad, Cod_Postal)
values(3, "Universidad de Cataluña", "Barcelona", "08034");

-- Estudio --

insert into Estudio(DNI_Empleado, Cod_Universidad, Fecha_Fin, Título, Especialidad)
values("14480143X", 1, "2012-7-25", "Artes Escénicas", "Actor Profesional");

insert into Estudio(DNI_Empleado, Cod_Universidad, Fecha_Fin, Título, Especialidad)
values("29891575Q", 2, "2024-12-17", "Artes Escénicas", "Actor Profesional");

insert into Estudio(DNI_Empleado, Cod_Universidad, Fecha_Fin, Título, Especialidad)
values("15990056L", 3, "2023-3-15", "Artes Escénicas", "Actor Profesional");

-- Departamento --

insert into Departamento(Cod_Departamento, Nombre, DNI_Jefe, Presupuesto)
values(1, "Departamento de Biología", "14480143X", "9539");

insert into Departamento(Cod_Departamento, Nombre, DNI_Jefe, Presupuesto)
values(2, "Departamento de Geología", "29891575Q", "8957");

insert into Departamento(Cod_Departamento, Nombre, DNI_Jefe, Presupuesto)
values(3, "Departamento de Física Teórica", "15990056L", "9472");

-- Trabajo --
insert into Trabajo(Cod_Trabajo, Nombre, Salario_Max, Salario_Min)
values(1, "Actor de Hollywood", 15, 8);

insert into Trabajo(Cod_Trabajo, Nombre, Salario_Max, Salario_Min)
values(2, "Actor de Marvel", 14, 9);

insert into Trabajo(Cod_Trabajo, Nombre, Salario_Max, Salario_Min)
values(3, "Actor Español", 14, 6);

-- Historial Laboral --

insert into Historial_Laboral(DNI_Empleado, Cod_Trabajo, Cod_Departamento, Fecha_Inicio, Fecha_Fin, DNI_Superior)
values("14480143X", 1, 1, "2006-06-30", "2012-7-25", "86356763C");

insert into Historial_Laboral(DNI_Empleado, Cod_Trabajo, Cod_Departamento, Fecha_Inicio, Fecha_Fin, DNI_Superior)
values("29891575Q", 2, 2, "2023-9-15", "2024-12-17", "48802629X");

insert into Historial_Laboral(DNI_Empleado, Cod_Trabajo, Cod_Departamento, Fecha_Inicio, Fecha_Fin, DNI_Superior)
values("15990056L", 3, 3, "2022-2-14", "2023-3-15", "41420410D");

-- Ejercicio 3 --
alter table Trabajo
add column Dificultad int;

alter table Trabajo
add constraint ch_Dificultad check(Dificultad <=5 and Dificultad > 0);


alter table Departamento
add column Planta int not null default 0;

alter table Departamento
add column Puerta int not null default 1;


alter table Empleado
add constraint ch_fecha_nacimiento_sevilla check ((Ciudad = 'Sevilla' and Fecha_Nacimiento is not null) or (Ciudad <> 'Sevilla'));


alter table Empleado
rename column Municipio to Localidad;


alter table Historial_Salarial
add constraint ch_HS_salario_no_neg check(Salario >= 0);

alter table Trabajo
add constraint ch_T_Sal_no_neg check((Salario_Max >= 0) and (Salario_Min >= 0));

alter table Departamento
add constraint ch_D_Sal_no_Neg check(Presupuesto >= 0);


alter table Empleado
modify Nombre varchar(30);


alter table Empleado
modify Direccion varchar(50);


-- Ejercicio 4 --