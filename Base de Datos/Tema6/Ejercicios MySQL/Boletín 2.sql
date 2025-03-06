DROP DATABASE IF EXISTS TALLER;
CREATE DATABASE TALLER;
USE TALLER;

CREATE TABLE proveedor (
	codpro VARCHAR(3),
	nompro VARCHAR(30) NOT NULL,
	status INT,
	ciudad VARCHAR(15),
	constraint codpro_pk PRIMARY KEY (codpro),
	CONSTRAINT status_chk CHECK (status >=1 AND status <=10)
);

CREATE TABLE pieza (
	codpie VARCHAR(3),
	nompie VARCHAR(10) NOT NULL,
	color VARCHAR(10),
	peso DECIMAL(5,2),
	ciudad VARCHAR(15),
	CONSTRAINT codpie_pk PRIMARY KEY (codpie),
	CONSTRAINT peso_chk CHECK (peso > 0 AND peso <= 100)
); 

CREATE TABLE proyecto (
codpj VARCHAR(3),
nompj VARCHAR(20) NOT NULL,
ciudad VARCHAR(15),
CONSTRAINT codpj_pk PRIMARY KEY (codpj)
);

CREATE TABLE ventas (
codpro VARCHAR(3),
codpie VARCHAR(3),
codpj VARCHAR(3),
cantidad INT(4),
CONSTRAINT clave_pk PRIMARY KEY (codpro,codpie,codpj),
CONSTRAINT codpro_fk FOREIGN KEY (codpro) REFERENCES proveedor(codpro),
CONSTRAINT codpie_fk FOREIGN KEY (codpie) REFERENCES pieza(codpie),
CONSTRAINT codpj_fk FOREIGN KEY (codpj) REFERENCES proyecto(codpj)
);

INSERT INTO proveedor 
VALUES ('S1', 'Jose Fernandez', 2, 'Madrid');

INSERT INTO proveedor 
VALUES ('S2', 'Manuel Vidal', 1, 'Londres');

INSERT INTO proveedor 
VALUES ('S3', 'Luisa Gomez', 3, 'Lisboa');

INSERT INTO proveedor 
VALUES ('S4', 'Pedro Sanchez', 4, 'Paris');

INSERT INTO proveedor 
VALUES ('S5', 'Maria Reyes', 5, 'Roma');

INSERT INTO pieza
VALUES ('P1', 'Tuerca', 'Gris', 2.5, 'Madrid');

INSERT INTO pieza
VALUES ('P2', 'Tornillo', 'Rojo', 1.25, 'Paris');

INSERT INTO pieza
VALUES ('P3', 'Arandela', 'Blanco', 3, 'Londres');

INSERT INTO pieza
VALUES ('P4', 'Clavo', 'Gris', 5.5, 'Lisboa');

INSERT INTO pieza
VALUES ('P5', 'Alcataya', 'Blanco', 10, 'Roma');

INSERT INTO proyecto
VALUES ('J1', 'Proyecto 1', 'Londres');

INSERT INTO proyecto
VALUES ('J2', 'Proyecto 2', 'Londres');

INSERT INTO proyecto
VALUES ('J3', 'Proyecto 3', 'Paris');

INSERT INTO proyecto
VALUES ('J4', 'Proyecto 4', 'Roma');


INSERT INTO ventas
VALUES ('S1', 'P1', 'J2', 100);

INSERT INTO ventas
VALUES ('S1', 'P1', 'J3', 500);

INSERT INTO ventas
VALUES ('S1', 'P2', 'J1', 200);

INSERT INTO ventas
VALUES ('S2', 'P2', 'J2', 15);

INSERT INTO ventas
VALUES ('S4', 'P2', 'J3', 1700);

INSERT INTO ventas
VALUES ('S1', 'P3', 'J1', 800);

INSERT INTO ventas
VALUES ('S5', 'P3', 'J2', 30);

INSERT INTO ventas
VALUES ('S1', 'P4', 'J1', 10);

INSERT INTO ventas
VALUES ('S1', 'P4', 'J3', 250);

INSERT INTO ventas
VALUES ('S2', 'P5', 'J2', 300);

INSERT INTO ventas
VALUES ('S2', 'P2', 'J1', 4500);

INSERT INTO ventas
VALUES ('S3', 'P1', 'J1', 90);

INSERT INTO ventas
VALUES ('S3', 'P2', 'J1', 190);

INSERT INTO ventas
VALUES ('S3', 'P5', 'J3', 20);

INSERT INTO ventas
VALUES ('S4', 'P5', 'J1', 15);

INSERT INTO ventas
VALUES ('S4', 'P1', 'J3', 1500);

INSERT INTO ventas
VALUES ('S1', 'P1', 'J1', 150);

INSERT INTO ventas
VALUES ('S1', 'P4', 'J4', 290);

INSERT INTO ventas
VALUES ('S1', 'P2', 'J4', 175);


-- Ejercicio 1 --
/*Obtener todos los atributos de todos los proyectos*/
select * 
from proyecto;

-- Ejercicio 2 --
/*Obtener todos los atributos de todos los proyectos desarrollados en
londres*/
select * 
from proyecto
where ciudad = "Londres";

-- Ejercicio 3 --
/*Obtener los códigos de las piezas suministradas por el proveedor s2,
ordenados.*/
select codpie, codpro
from ventas
where codpro = "S2"
order by codpie;

-- Ejercicio 4 --
/*Obtener los códigos de los proveedores del proyecto j1, ordenados*/
select codpro
from ventas
where codpj = "J1"
order by codpro;

-- Ejercicio 5 --
/*Obtener todas las ocurrencias pieza.color, pieza.ciudad eliminando los
pares duplicados*/
select distinct color, ciudad
from pieza;

-- Ejercicio 6 --
/*Obtener los códigos de las ventas en las que la cantidad no sea nula*/
select codpro, codpie, codpj
from ventas
where cantidad is not null;

-- Ejercicio 7 --
/*Obtener códigos de los proyectos y ciudades en las que la ciudad
del proyecto tenga una 'o' en la segunda letra*/
select codpj, ciudad
from proyecto
where ciudad like '_o%';

-- Ejercicio 8 --
/*Obtener un listado ascendente de los nombres de las piezas con más de 
5 letras*/
select nompie
from pieza
where length(nompie) > 5
order by nompie asc;

-- Ejercicio 9 --
/*Obtener nombres abreviados de proyectos tomando sus 3 primeras letras*/
select left(nompj, 3) as nombre_abreviado
from proyecto;

-- Ejercicio 10 --
/*Obtener los tres últimos caracteres de los nombres de los proveedores por 
orden alfabético*/
select right(nompro, 3) as ultimos_3
from proveedor
order by ultimos_3 asc;

-- Ejercicio 11 --
/*Hallar cuantas piezas distintas existen*/
select count(distinct codpie)
from pieza;

-- Ejercicio 12 --
/*Hallar cuantas piezas distintas existen dando nombre a la columna
resultante como "número"*/
select count(distinct codpie) as numero
from pieza;

-- Ejercicio 13 --
/*Obtener el número total de proyectos suministrados por el 
proveedor s1*/
select count(distinct codpj) as total_proyectos
from ventas
where codpro = 'S1';

-- Ejercicio 14 --
/*Obtener la cantidad total de piezas p1 suministradas por s1*/
select sum(cantidad) as total
from ventas
where codpro = 'S1' and codpie = 'P1';

-- Ejercicio 15 --
/*Obtener la cantidad media de piezas suministradas, cantidad máxima
y mínima suministrada*/
select
avg(cantidad) as cantidad_media,
max(cantidad) as cantidad_máxima,
min(cantidad) as cantidad_mínima
from ventas;

-- Ejercicio 16 --
/*Obtener las ventas en las que la cantidad de piezas esté entre 
300 y 750 inclusive.*/
select *
from ventas
where cantidad between 300 and 750;

-- Ejercicio 17 --
/*Construir una consulta que devuelva codpie y VERDADERO si en la 
tabla piezas el color de la pieza no es ni azul ni gris.*/
select codpie,
case
when color not in ('Azul', 'Gris') then 'Verdadero'
else 'Falso'
end as condicion
from pieza;

-- Ejercicio 18 --
/*Añade una nueva columna llamada fecha que indique la fecha de adquisición
de una pieza por proveedor y proyecto*/
alter table ventas add column fecha date;

-- Ejercicio 19 --
/*Modificar la fecha de adquisición de todas las piezas 'p2' a 
la fecha actual*/
update ventas
set fecha = '2025-03-05'
where codpie = 'p2';

-- Ejercicio 20 --
/*Se desea visualizar la fecha con formato del ejemplo ’11-NOV-2002’.*/
select date_format(fecha, '%d-%b-%Y') AS fecha from ventas;

-- Ejercicio 21 --
/*Modificar la fecha de adquisición en los que participan los 
proyectos j1 y j2 a la fecha 12-11-2001 .*/
update ventas
set fecha = '2001-11-12'
where codpj in ('J1', 'J2');



