DROP DATABASE IF EXISTS Centro_educativo;
CREATE DATABASE Centro_educativo;
USE Centro_educativo;

CREATE TABLE PROVINCIA 
(
	ID_PROV INT(5), 
	NOMBRE VARCHAR(100) NOT NULL,
	CONSTRAINT PK_PROVINCIA PRIMARY KEY(ID_PROV)
);
  
CREATE TABLE PROFESOR 
(	
	ID_PROF INT(5), 
	NOMBRE VARCHAR(100) NOT NULL , 
	APELLIDOS VARCHAR(100) NOT NULL , 
	DNI VARCHAR(9) NOT NULL,
	NACIDO_EN INT(5), 
	CONSTRAINT PK_PROFESOR PRIMARY KEY (ID_PROF),
    CONSTRAINT FK_PROFESOR_PROVINCIA FOREIGN KEY (NACIDO_EN) REFERENCES PROVINCIA (ID_PROV) 
);
  

CREATE TABLE ALUMNO 
(	
	ID_ALUM INT(5), 
	DNI VARCHAR(9) NOT NULL , 
	NOMBRE VARCHAR(100) NOT NULL , 
	APELLIDOS VARCHAR(100) NOT NULL , 
	FECHA_NAC DATE, 
	NACIDO_EN INT(5), 
	CONSTRAINT PK_ALUMNO PRIMARY KEY (ID_ALUM),
	CONSTRAINT FK_ALUMNO_PROVICIA FOREIGN KEY (NACIDO_EN) REFERENCES PROVINCIA (ID_PROV) 
);


CREATE TABLE ASIGNATURA 
(
	ID_ASIG INT(5), 
	NOMBRE VARCHAR(100) NOT NULL , 
	CONSTRAINT PK_ASIGNATURA PRIMARY KEY (ID_ASIG)
);
  

CREATE TABLE IMPARTE 
(	
	ID_PROF INT(5) NOT NULL , 
	ID_ASIG INT(5) NOT NULL , 
	CONSTRAINT PK_IMPARTE PRIMARY KEY (ID_PROF, ID_ASIG), 
	CONSTRAINT FK_IMPARTE_PROFESOR FOREIGN KEY (ID_PROF) REFERENCES PROFESOR (ID_PROF) ON DELETE CASCADE , 
	CONSTRAINT FK_IMPARTE_ASIGNATURA FOREIGN KEY (ID_ASIG) REFERENCES ASIGNATURA (ID_ASIG) ON DELETE CASCADE 
);

CREATE TABLE MATRICULADO
(
	ID_ALUM INT(5) NOT NULL, 
	ID_ASIG INT(5) NOT NULL, 
	NOTA1 DECIMAL(4,2), 
	NOTA2 DECIMAL(4,2), 
	NOTA3 DECIMAL(4,2), 
	CONSTRAINT PK_MATRICULADO PRIMARY KEY (ID_ALUM, ID_ASIG),
	CONSTRAINT FK_MATRICULADO_ASIGNATURA FOREIGN KEY (ID_ASIG) REFERENCES ASIGNATURA (ID_ASIG) ON DELETE CASCADE , 
	CONSTRAINT FK_MATRICULADO_ALUMNO FOREIGN KEY (ID_ALUM) REFERENCES ALUMNO (ID_ALUM) ON DELETE CASCADE
);

INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (1, 'Almeria');
INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (2, 'Cadiz');
INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (3, 'Cordoba');
INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (4, 'Granada');
INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (5, 'Huelva');
INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (6, 'Jaen');
INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (7, 'Malaga');
INSERT INTO PROVINCIA (ID_PROV, Nombre) VALUES (8, 'Sevilla');

INSERT INTO PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni) VALUES (1, 'Alvaro', 'Acebedo', 8, '78293485F');
INSERT INTO PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni) VALUES (2, 'Manuel', 'Gutierrez', 2, '69298485J');
INSERT INTO PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni) VALUES (3, 'Celia', 'Villa', 8, '23293465L');
INSERT INTO PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni) VALUES (4, 'Maria', 'Munioz', 3, '19298885N');

INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (1, '28756358V', 'Juan', 'Veloso', '1977/02/11', 8);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (2, '28956157L', 'Sonia', 'Sanchez', '1981/08/24', 8);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (3, '27568011D', 'Cristina', 'Abascal', '1980/06/08', 2);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (4, '28754685C', 'Manuel', 'Perez', '1974/06/04', 8);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (5, '28546821Y', 'Manuel', 'Bueno', '1985/12/19', 2);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (6, '27656981Y', 'Jose Antonio', 'Montero', '1990/07/25', 3);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (7, '58324542B', 'Juan Jose', 'Sanchez', '1992/11/01', 2);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (8, '56846315M', 'Sandra', 'Valles', '1985/01/05', 3);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (9, '28468215X', 'Sara', 'Merida', '1986/09/09', 8);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (10, '27684214Z', 'Laura', 'Gutierrez', '1987/04/09', 8);
INSERT INTO ALUMNO (ID_ALUM, DNI, Nombre, Apellidos, FECHA_NAC, Nacido_en) VALUES (11, '28896443S', 'Inmaculada', 'Garcia', '1989/03/21', 8);

INSERT INTO ASIGNATURA (ID_ASIG, Nombre) VALUES (1, 'Redes');
INSERT INTO ASIGNATURA (ID_ASIG, Nombre) VALUES (2, 'Sistemas');
INSERT INTO ASIGNATURA (ID_ASIG, Nombre) VALUES (3, 'Ingles');

INSERT INTO IMPARTE (ID_PROF, ID_ASIG) VALUES (1, 1);
INSERT INTO IMPARTE (ID_PROF, ID_ASIG) VALUES (2, 1);
INSERT INTO IMPARTE (ID_PROF, ID_ASIG) VALUES (3, 2);

INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (1, 1, 4, 6, 8);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (2, 1, 5, 5, 5);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (2, 3, 10, 9, 7);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (3, 1, 10, 8, 9);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (4, 1, 3, 3, 4);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (4, 3, 0, 0, 0);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (5, 1, 1, 4, 8);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (5, 3, 8, 4, 4);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (6, 1, 5, 2, 7);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (7, 1, 5, 5, 5);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (7, 2, 7, 5, 6);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (7, 3, 6, 7, 7);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (8, 1, 4, 6, 5);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (8, 2, 4, 5, 6);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (9, 2, 7, 7, 7);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (9, 3, 6, 7, 8);
INSERT INTO MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3) VALUES (10, 2, 9, 5, 5);

-- Ejercicio 1 --
/*Muestra la información de aquellas matrículas cuya nota1 
es igual a la suma del resto de notas.*/
select * from matriculado
where NOTA1 = (NOTA2 + NOTA3);

-- Ejercicio 2 --
/*Muestra la información de aquellas matrículas cuya media
es superior a 8*/
select * from matriculado
where (nota1 + nota2 + nota3)/3 >= 8;

-- Ejercicio 3 --
/*Muestra la informacion de todos los alumnos nacidos en el
mes de febrero*/
select * from alumno
where month(fecha_nac) = 2;

-- Ejercicio 4 --
/*Muestra la informacion de los alumnos junto a un campo que indique
"Quedan X_DIAS días para el cumpleaños de NOMBRE_ALUMNO*/
/*SELECT *, 
    DATEDIFF(
        DATE(CONCAT(YEAR(CURDATE()), '-', DATE_FORMAT(fecha_nac, '%m-%d'))), 
        CURDATE()
    ) AS dias_para_cumple,
    CONCAT('Quedan ', 
           DATEDIFF(
               DATE(CONCAT(YEAR(CURDATE()), '-', DATE_FORMAT(fecha_nac, '%m-%d'))), 
               CURDATE()
           ), 
           ' días para el cumpleaños de ', nombre) AS mensaje
FROM alumno;*/

SELECT *, CONCAT('Quedan ',
DATEDIFF(CONCAT('2025-', MONTH(fecha_nac), '-', DAY(fecha_nac)), CURDATE()),
' días para el cumpleaños de ', nombre) AS recordatorio FROM alumno;

-- Ejercicio 5 --
/*Muestra el nombre y los apellidos de aquellos profesores con DNI par*/
select nombre, apellidos
from alumno
where right(left(dni, length(dni) - 1), 1) in ('0', '2', '4', '6', '8');


-- Ejercicio 6 --
/*Muestra el nombre de los apellidos junto a su identificador en séneca (ID_Prof),
sabiendo que está formado por la primera letra de su nombre, y las tres primeras
letras de cada uno de los apellidos, junto a las 3 últimas letras de su DNI (sin
contar la letra)*/
select concat(
        left(nombre, 1), 
        left(apellidos, 3), 
        right(substring(DNI, 1, length(DNI) - 1), 3)
    ) as identificador
from profesor;

-- Ejercicio 7 --
/*Muestra la información de los profesores que nacieron en la pronuncia 1 y
además contengan la letra a en el nombre o en los apellidos*/
select * from profesor
where nacido_en = 1
and (nombre like '%A%' or apellidos like '%A%');

-- Ejercicio 8 --
/*Muestra el identificador de aquellas asignaturas que son impartidas por
algún profesor cuyo código es par*/
select distinct i.id_asig
from imparte i
join profesor p on i.id_prof = p.id_prof
where p.id_prof % 2 = 0;

-- Ejercicio 9 --
/*Muestra el nombre de la ultima provincia por orden alfabetico*/
select nombre
from provincia
order by nombre desc
limit 1;

-- Ejercicio 10 --
/*Muestra la media de notas para cada matriculado junto al valor nominal
de la misma en función de si se trata de insuficiente(0-5), Suficiente(5), Bien(6),
Notable(7-8) y Sobresaliente(9-10)*/
select ID_ALUM, ID_ASIG, 
       (NOTA1 + NOTA2 + NOTA3) / 3 AS MEDIA,
       case 
           when (NOTA1 + NOTA2 + NOTA3) / 3 < 5 then 'Insuficiente'
           when (NOTA1 + NOTA2 + NOTA3) / 3 = 5 then 'Suficiente'
           when (NOTA1 + NOTA2 + NOTA3) / 3 = 6 then 'Bien'
           when (NOTA1 + NOTA2 + NOTA3) / 3 between 7 and 8 then 'Notable'
           else 'Sobresaliente'
       end as VALOR_NOMINAL
from MATRICULADO;

-- Ejercicio 11 --
select max((NOTA1 + NOTA2 + NOTA3) / 3) as Record_de_calificaciones
from MATRICULADO;

