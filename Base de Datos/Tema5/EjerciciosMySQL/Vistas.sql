-- Crear la base de datos
CREATE DATABASE academia;
USE academia;
-- Crear la tabla de alumnos
CREATE TABLE alumnos (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nombre VARCHAR(50),
 apellido VARCHAR(50)
);
-- Crear la tabla de asignaturas
CREATE TABLE asignaturas (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nombre VARCHAR(100)
);
-- Crear la tabla de profesores
CREATE TABLE profesores (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nombre VARCHAR(50),
 apellido VARCHAR(50)
);
-- Crear la tabla de matrículas
CREATE TABLE matriculas (
 id INT AUTO_INCREMENT PRIMARY KEY,
 alumno_id INT,
 asignatura_id INT,
 horas INT,
 FOREIGN KEY (alumno_id) REFERENCES alumnos(id),
 FOREIGN KEY (asignatura_id) REFERENCES asignaturas(id)
);
-- Crear la tabla de asignaturas_profesores
CREATE TABLE asignaturas_profesores (
 id INT AUTO_INCREMENT PRIMARY KEY,
 asignatura_id INT,
 profesor_id INT,
 FOREIGN KEY (asignatura_id) REFERENCES asignaturas(id),
 FOREIGN KEY (profesor_id) REFERENCES profesores(id)
);
-- Insertar datos de prueba
INSERT INTO alumnos (nombre, apellido) VALUES
('Juan', 'Pérez'),
('María', 'López'),
('Carlos', 'Gómez');
INSERT INTO asignaturas (nombre) VALUES
('Matemáticas'),
('Historia'),
('Física');
INSERT INTO profesores (nombre, apellido) VALUES
('Ana', 'Martínez'),
('Luis', 'Fernández');
INSERT INTO matriculas (alumno_id, asignatura_id, horas) VALUES
(1, 1, 120),
(2, 2, 90),
(3, 3, 110);
INSERT INTO asignaturas_profesores (asignatura_id, profesor_id) VALUES
(1, 1),
(2, 2),
(3, 1);



-- Ejercicio 1 --
/*Realiza una vista que muestre el nombre y el apellido de todos los alumnos.*/

create view vista_alumnos as 
select nombre, apellido 
from alumnos;

select * from vista_alumnos;

-- Ejercicio 2 --
/*Realiza una vista que muestre el nombre del alumno junto a la 
asignatura que está matriculada*/

create view vista_alumnos_asignatura as
select a.nombre as alumno_nombre, a.apellido as alumno_apellido, 
asig.nombre as asignatura
from alumnos a 
join matriculas m on m.alumno_id = a.id
join asignaturas asig on m.asignatura_id = asig.id;

select * from vista_alumnos_asignatura;


-- Ejercicio 3 --
/*Realiza una vista que muestre todas las matrículas con más de 100 horas*/

create view mostrar_horas as
select a.nombre as alumno_nombre, a.apellido as alumno_apellido, 
asig.nombre as asignatura, m.horas
from alumnos a 
join matriculas m on m.alumno_id = a.id
join asignaturas asig on m.asignatura_id = asig.id
where m.horas > 100;

select * from mostrar_horas;


-- Ejercicio 4 --
/*Realiza una vista que muestre el nombre de la asignatura 
y el profesor que la imparte*/

create view vista_asignaturas_profesores as
select asig.nombre as asignatura, p.nombre as profesor_nombre, p.apellido as profesor_apellido
from asignaturas_profesores ap
join asignaturas asig on ap.asignatura_id = asig.id
join profesores p on ap.profesor_id = p.id;

select * from vista_asignaturas_profesores;

-- Ejercicio 5 --
/*Por último crea un usuario en base de datos que tenga acceso de colsulta 
a todas las vistas creadas anteriormente*/