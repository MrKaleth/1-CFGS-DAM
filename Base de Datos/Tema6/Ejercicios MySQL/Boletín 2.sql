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

-- Ejercicio 22 --
/*Construir una lista ordenada de todas las ciudades en las que al menos resida
un proveedor o suministrador, una pieza o un proyecto*/
select ciudad from proveedor
union
select ciudad from pieza
union
select ciudad from proyecto
order by ciudad;

-- Ejercicio 23 --
/*Obtener todas las posibles combinaciones entre piezas y
proveedores*/
select proveedor.codpro, proveedor.nompro, pieza.codpie, pieza.nompie
from proveedor
cross join pieza;

-- Ejercicio 24 --
/*Obtener todos los posibles trios de código de proveedor,
codigo de pieza y codigo de proyecto en los que el proveedor,
pieza y proyecto estén en la misma ciudad*/
select proveedor.codpro, pieza.codpie, proyecto.codpj, proveedor.ciudad
from proveedor
join pieza on proveedor.ciudad = pieza.ciudad
join proyecto on proveedor.ciudad = proyecto.ciudad;

-- Ejercicio 25 --
/*Obtener los códigos de proveedor, de pieza y de proyecto
de aquellos cargamentos en los que proveedor, pieza y proyecto
esten en la misma ciudad*/
select ventas.codpro, ventas.codpie, ventas.codpj, proveedor.ciudad
from ventas
join proveedor on ventas.codpro = proveedor.codpro
join pieza on ventas.codpie = pieza.codpie
join proyecto on ventas.codpj = proyecto.codpj
where proveedor.ciudad = pieza.ciudad
and proveedor.ciudad = proyecto.ciudad;

-- Ejercicio 26 --
/*Obtener todos los posibles tríos de código de proveedor, 
código de pieza y código de proyecto en los que el proveedor, 
pieza y proyecto no estén todos en la misma ciudad.*/
select proveedor.codpro, pieza.codpie, proyecto.codpj, 
       proveedor.ciudad as ciudad_proveedor, 
       pieza.ciudad as ciudad_pieza, 
       proyecto.ciudad as ciudad_proyecto
from proveedor
join pieza on proveedor.codpro is not null  
join proyecto on proveedor.codpro is not null 
where proveedor.ciudad != pieza.ciudad 
   or proveedor.ciudad != proyecto.ciudad 
   or pieza.ciudad != proyecto.ciudad;

-- Ejercicio 27 --
/*Obtener todos los posibles tríos de código de proveedor, 
código de pieza y código de proyecto en los que el proveedor, 
pieza y proyecto no están ninguno en la misma ciudad*/
select proveedor.codpro, pieza.codpie, proyecto.codpj, 
       proveedor.ciudad as ciudad_proveedor, 
       pieza.ciudad as ciudad_pieza, 
       proyecto.ciudad as ciudad_proyecto
from proveedor
join pieza on proveedor.codpro is not null 
join proyecto on proveedor.codpro is not null  
where proveedor.ciudad != pieza.ciudad 
   and proveedor.ciudad != proyecto.ciudad 
   and pieza.ciudad != proyecto.ciudad;

-- Ejercicio 28 --
/*Obtener los códigos de las piezas suministradas por 
proveedores de Londres.*/
select distinct ventas.codpie, proveedor.ciudad
from ventas
join proveedor on ventas.codpro = proveedor.codpro
where proveedor.ciudad = 'Londres';

-- Ejercicio 29 --
/*Obtener los códigos de las piezas suministradas por 
proveedores de Londres a proyectos en Londres.*/
select distinct ventas.codpie, 
proveedor.ciudad as ciudad_proveedor, 
proyecto.ciudad as ciudad_proyecto
from ventas
join proveedor on ventas.codpro = proveedor.codpro
join proyecto on ventas.codpj = proyecto.codpj
where proveedor.ciudad = 'Londres'
and proyecto.ciudad = 'Londres';
 
-- Ejercicio 30 --
/*Obtener todos los pares de nombres de ciudades en las que un 
proveedor de la primera sirva a un proyecto de la segunda.*/
select distinct proveedor.ciudad as ciudad_proveedor, 
                proyecto.ciudad as ciudad_proyecto
from ventas
join proveedor on ventas.codpro = proveedor.codpro
join proyecto on ventas.codpj = proyecto.codpj
where proveedor.ciudad != proyecto.ciudad;

-- Ejercicio 31 --
/*Obtener códigos de piezas que sean suministradas a un 
proyecto por un proveedor de la misma ciudad del proyecto.*/
select distinct ventas.codpie
from ventas
join proveedor on ventas.codpro = proveedor.codpro
join proyecto on ventas.codpj = proyecto.codpj
where proveedor.ciudad = proyecto.ciudad;

-- Ejercicio 32 --
/*Obtener códigos de proyectos que sean suministrados por un 
proveedor de una ciudad distinta a la del proyecto. Visualizar
el código de proveedor y el del proyecto*/
select distinct ventas.codpro, ventas.codpj
from ventas
join proveedor on ventas.codpro = proveedor.codpro
join proyecto on ventas.codpj = proyecto.codpj
where proveedor.ciudad != proyecto.ciudad;

-- Ejercicio 33 --
/*Obtener todos los pares de códigos de piezas suministradas por el mismo
proveedor*/
select v1.codpie as pieza1, 
v2.codpie as pieza2, 
v1.codpro as proveedor
from ventas v1
join ventas v2 on v1.codpro = v2.codpro and v1.codpie < v2.codpie
order by v1.codpro, v1.codpie, v2.codpie;

-- Ejercicio 34 --
/*Obtener todos los pares distintos de códigos de piezas suministradas por el mismo
proveedor*/
select distinct v1.codpie as pieza1, 
v2.codpie as pieza2, 
v1.codpro as proveedor
from ventas v1
join ventas v2 on v1.codpro = v2.codpro and v1.codpie < v2.codpie
order by v1.codpro, v1.codpie, v2.codpie;

-- Ejercicio 35 --
/*Obtener para cada pieza suministrada a un proyecto, el código de pieza,
el código de proyecto y la cantidad total correspondiente.*/
select codpie, codpj, sum(cantidad) as cantidad_total
from ventas
group by codpie, codpj
order by codpie, codpj;

-- Ejercicio 36 --
/*Obtener los códigos de proyectos y los códigos de piezas en los que la
cantidad media suministrada a algún proyecto sea superior a 320*/
select v.codpj, v.codpie
from (
    select codpj, codpie, sum(cantidad) / count(*) as cantidad_media
    from ventas
    group by codpj, codpie
) as v
join proyecto p on v.codpj = p.codpj and v.cantidad_media > 320;

-- Ejercicio 37 --
/*Obtener un listado ascendente de los nombres de todos los proveedores que hayan
suministrado una cantidad superior a 100 de la pieza p1. Los nombres deben
aparecer en mayúsculas.*/
select distinct upper(proveedor.nompro) as nombre_proveedor
from ventas
join proveedor on ventas.codpro = proveedor.codpro
where ventas.codpie = "p1" and ventas.cantidad > 100
order by nombre_proveedor asc;

-- Ejercicio 38 --
/*Obtener los nombres de los proyectos a los que suministra s1*/
select distinct proyecto.nompj  
from ventas  
join proyecto on ventas.codpj = proyecto.codpj  
where ventas.codpro = 'S1';  

-- Ejercicio 39 --
/*Obtener los colores de las piezas suministradas por s1.*/
select distinct pieza.color
from ventas
join pieza on ventas.codpie = pieza.codpie
where ventas.codpro = 'S1';

-- Ejercicio 40 --
/*Obtener los códigos de las piezas suministradas a cualquier proyecto de Londres*/
select ventas.codpie, proyecto.ciudad
from ventas
join proyecto on ventas.codpj = proyecto.codpj
where proyecto.ciudad = 'Londres';

-- Ejercicio 41 --
/*Obtener los códigos de los proveedores con status menor que el proveedor con
código s1.*/
select proveedor.codpro as codiguito
from proveedor
where status < (
select proveedor.status 
from proveedor 
where proveedor.codpro = 'S1'
); 

-- Ejercicio 42 --
/*Obtener los códigos de los proyectos que usen la pieza p1 en una cantidad media mayor
que la mayor cantidad en la que cualquier pieza sea suministrada al proyecto J1*/
select v1.codpj
from ventas v1
where v1.codpie = 'P1' and (
select avg(v2.cantidad)
from ventas v2
where v2.codpj = v1.codpj and v2.codpie = 'P1')
>
(select max(ventas.cantidad)
from ventas
where ventas.codpj = 'J1'
);