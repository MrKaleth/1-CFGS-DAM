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

/*  1. Obtener todos los atributos de todos los proyectos.
Indicamos que nos muestre todos los atributos mediante el asterisco, de la tabla de proyecto*/
SELECT * FROM proyecto;

/*  2. Obtener todos los atributos de todos los proyectos desarrollados en Londres.
La consulta es identica a la anterior pero solo queremos que nos muestre donde la ciudad sea londres*/
SELECT * FROM proyecto WHERE ciudad = 'Londres';

/*  3. Obtener los códigos de las piezas suministradas por el proveedor s2, ordenados.
No se especifica que existan duplicados, podría tener dos soluciones. Con o sin duplicados, se debe usar la tabla de ventas porque es donde vemos las piezas suministradas */
SELECT DISTINCT codpie FROM ventas 
WHERE codpro = 'S2'
ORDER BY codpie;

SELECT codpie FROM ventas 
WHERE codpro = 'S2'
ORDER BY codpie;

/*  4. Obtener los códigos de los proveedores del proyecto j1, ordenados.
idem del anterior, dos respuesta validas*/
SELECT DISTINCT codpro 
FROM ventas
WHERE codpj = 'J1'
ORDER BY codpro;

SELECT codpro 
FROM ventas
WHERE codpj = 'J1'
ORDER BY codpro;

/*  5. Obtener todas las ocurrencias pieza.color, pieza.ciudad eliminando los pares duplicados.
Nos está pidiendo los atributos color y ciudad de la tabla de piezas, pero sin que se dupliquen. Sino se pone el distinct da el mismo resultado pero no sería correcto*/
SELECT DISTINCT color, ciudad 
FROM pieza;

/*  6. Obtener los códigos de las ventas en los que la cantidad no sea nula.
La tabla venta es donde se relaciona todos los codigos, pieza, proyecto, proveedor y debemos indicar la condicion que la cantidad tiene que ser no nulo. Aunque no existe diferencia en la consulta porque no existen valores no nulos */
SELECT codpro, codpie, codpj 
FROM ventas
WHERE cantidad IS NOT NULL;

/*  7. Obtener códigos de los proyectos y ciudades en las que la ciudad del proyecto tenga una 'o' en la segunda letra.
Existen distintas soluciones una usando LIKE y otra */
SELECT codpj, ciudad
FROM proyecto
WHERE ciudad LIKE '_o%';

SELECT codpj, ciudad
FROM proyecto
WHERE POSITION('o' IN ciudad) = 2;

SELECT codpj, ciudad
FROM proyecto
WHERE SUBSTRING(ciudad FROM 2 FOR 1) = 'o';

/*  8. Obtener un listado ascendente de los nombres de las piezas con más de 5 letras.*/
SELECT nompie 
FROM pieza
WHERE LENGTH(nompie) > 5
ORDER BY nompie ASC;

/*  9. Obtener nombres abreviados de proyectos tomando sus primeras 3 letras.
Vamos a realizar una consulta donde queremos que nos devuelva solo las tres PRIMERAS letras de cada nombre del proyecto indicando una columna que llamaremos abreviatura*/
SELECT LEFT(nompj, 3) AS abreviatura
FROM proyecto;

/* 10. Obtener los tres últimos caracteres de los nombres de proveedores por orden alfabético.
Este caso es parecido al anterior, pero en lugar del comienzo son el final*/
SELECT RIGHT(nompro, 3) AS ultimos_caracteres
FROM proveedor
ORDER BY nompro ASC;

/* 11. Hallar cuántas piezas distintas existen. Nos pide contar el número de piezas existentes por eso la conslta debemos indicar que se cuente el codigo de piezas, pero para que sean las piezas que existen debemos quitar las que esten repetidas. 
*/
SELECT COUNT(DISTINCT codpie) AS total_piezas
FROM pieza;

/* 12. Hallar cuántas piezas distintas existen dando nombre a la columna resultante “Número”
Identica a la consulta anterior, pero me indica que la consulta muestre la consulta en una columna que se llame número.*/
SELECT COUNT(DISTINCT codpie) AS Número
FROM pieza;

/* 13. Obtener el número total de proyectos suministrados por el proveedor sl.
En la tabla de ventas podemos ver que proyecto está asociado a proveedor S1. Por ello consultamos los codigos de proyecto que están unidos a proveedor S1*/

SELECT COUNT(DISTINCT codpj) AS total_proyectos
FROM ventas
WHERE codpro = 'S1';

/* 14. Obtener la cantidad total de piezas p1 suministrada por s1.
Identico al anterior pero consultamos las piezas en lugar de proyectos*/
SELECT SUM(cantidad) AS total_suministrado
FROM ventas
WHERE codpro = 'S1' AND codpie = 'P1';

/* 15. Obtener la cantidad media de piezas suministradas, cantidad máxima y mínima suministrada.*/
SELECT AVG(cantidad) AS cantidad_media,
       MAX(cantidad) AS cantidad_maxima,
       MIN(cantidad) AS cantidad_minima
FROM ventas;

/* 16. Obtener las ventas en las que la cantidad de piezas esté entre 300 y 750 inclusive.*/
SELECT * FROM ventas
WHERE cantidad BETWEEN 300 AND 750;

/* 17. Construir una consulta que devuelva codpie y VERDADERO si en la tabla piezas el color de la pieza no es ni azul ni gris.*/
SELECT codpie, 
       CASE WHEN color NOT IN ('Azul', 'Gris') THEN 'VERDADERO' 
       ELSE 'FALSO' END AS condicion
FROM pieza;

/* 18. Añade una nueva columna llamada fecha que indique la fecha de adquisición de una pieza por proveedor y proyecto.*/
ALTER TABLE ventas ADD COLUMN fecha DATE;
/* 19. Modificar la fecha de adquisición de todas las piezas p2 a la fecha actual.*/
UPDATE ventas
SET fecha = CURDATE()
WHERE codpie = 'P2';
/* 20. Se desea visualizar la fecha con formato del ejemplo ’11-NOV-2002’.*/
SELECT DATE_FORMAT(fecha, '%d-%b-%Y') AS fecha_formateada
FROM ventas;
/* 21. Modificar la fecha de adquisición en los que participan los proyectos j1 y j2 a la fecha 12-11-2001 .*/
UPDATE ventas
SET fecha = '2001-11-12'
WHERE codpj IN ('J1', 'J2');
/* 22. Construir una lista ordenada de todas las ciudades en las que al menos resida un proveedor o suministrador, una pieza o un proyecto.*/
SELECT DISTINCT ciudad 
FROM (
    SELECT ciudad FROM proveedor
    UNION 
    SELECT ciudad FROM pieza
    UNION 
    SELECT ciudad FROM proyecto
) AS ciudades
ORDER BY ciudad ASC;
/* 23. Obtener todas las posibles combinaciones entre piezas y proveedores.*/
SELECT P.codpie, PR.codpro
FROM pieza P, proveedor PR;

/* 24. Obtener todos los posibles tríos de código de proveedor, código de pieza y código de proyecto en los que el proveedor, pieza y proyecto estén en la misma ciudad.*/
SELECT V.codpro, V.codpie, V.codpj
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
JOIN pieza PI ON V.codpie = PI.codpie
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE P.ciudad = PI.ciudad AND PI.ciudad = PR.ciudad;

/* 25. Obtener los códigos de proveedor, de pieza y de proyecto de aquellos cargamentos en los que proveedor, pieza y proyecto estén en la misma ciudad.*/
select ventas.codpro, ventas.codpie, ventas.codpj, proveedor.ciudad
from ventas
join proveedor on ventas.codpro = proveedor.codpro
join pieza on ventas.codpie = pieza.codpie
join proyecto on ventas.codpj = proyecto.codpj
where proveedor.ciudad = pieza.ciudad
and proveedor.ciudad = proyecto.ciudad;

/* 26. Obtener todos los posibles tríos de código de proveedor, código de pieza y código de proyecto en los que el proveedor, pieza y proyecto no estén todos en la misma ciudad.*/
SELECT V.codpro, V.codpie, V.codpj
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
JOIN pieza PI ON V.codpie = PI.codpie
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE NOT (P.ciudad = PI.ciudad AND PI.ciudad = PR.ciudad);

/* 27. Obtener todos los posibles tríos de código de proveedor, código de pieza y código de proyecto en los que el proveedor, pieza y proyecto no están ninguno en la misma ciudad.*/
SELECT V.codpro, V.codpie, V.codpj
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
JOIN pieza PI ON V.codpie = PI.codpie
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE P.ciudad <> PI.ciudad AND PI.ciudad <> PR.ciudad AND P.ciudad =! PR.ciudad;

/* 28. Obtener los códigos de las piezas suministradas por proveedores de Londres.*/
SELECT DISTINCT V.codpie
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
WHERE P.ciudad = 'Londres';

/* 29. Obtener los códigos de las piezas suministradas por proveedores de Londres a proyectos en Londres.*/
SELECT DISTINCT V.codpie
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE P.ciudad = 'Londres' AND PR.ciudad = 'Londres';

/* 30. Obtener todos los pares de nombres de ciudades en las que un proveedor de la primera sirva a un proyecto de la segunda.*/
SELECT DISTINCT P.ciudad AS ciudad_proveedor, PR.ciudad AS ciudad_proyecto
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
JOIN proyecto PR ON V.codpj = PR.codpj;

/* 31. Obtener códigos de piezas que sean suministradas a un proyecto por un proveedor de la misma ciudad del proyecto.*/
SELECT DISTINCT V.codpie
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE P.ciudad = PR.ciudad;

/* 32. Obtener códigos de proyectos que sean suministrados por un proveedor de una ciudad distinta a la del proyecto. Visualizar el código de proveedor y el del proyecto.*/
SELECT DISTINCT V.codpro, V.codpj
FROM ventas V
JOIN proveedor P ON V.codpro = P.codpro
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE P.ciudad <> PR.ciudad;

/* 33. Obtener todos los pares de códigos de piezas suministradas por el mismo proveedor.*/
SELECT V1.codpie, V2.codpie
FROM ventas V1
JOIN ventas V2 ON V1.codpro = V2.codpro AND V1.codpie < V2.codpie;

/* 34. Obtener todos los pares de códigos de piezas suministradas por el mismo proveedor (eliminar pares repetidos).*/
SELECT DISTINCT LEAST(V1.codpie, V2.codpie) AS pieza1, 
                GREATEST(V1.codpie, V2.codpie) AS pieza2
FROM ventas V1
JOIN ventas V2 ON V1.codpro = V2.codpro AND V1.codpie < V2.codpie;

/* 35. Obtener para cada pieza suministrada a un proyecto, el código de pieza, el código de proyecto y la cantidad total correspondiente.*/
SELECT codpie, codpj, SUM(cantidad) AS cantidad_total
FROM ventas
GROUP BY codpie, codpj;

/* 36. Obtener los códigos de proyectos y los códigos de piezas en los que la cantidad media suministrada a algún proyecto sea superior a 320.
where y having se usa para agrupar pero where agrupa antes de filtrar y having filtra y luego agrupa*/
SELECT codpj, codpie
FROM ventas
GROUP BY codpj, codpie
HAVING AVG(cantidad) > 320;

/* 37. Obtener un listado ascendente de los nombres de todos los proveedores que hayan suministrado una cantidad superior a 100 de la pieza p1. Los nombres deben aparecer en mayúsculas.*/
SELECT P.nompro AS nombre_proveedor
FROM proveedor P
JOIN ventas V ON P.codpro = V.codpro
WHERE V.codpie = 'P1' AND V.cantidad > 100
ORDER BY nombre_proveedor ASC;

/* 38. Obtener los nombres de los proyectos a los que suministra s1.*/
SELECT DISTINCT PR.nompj
FROM ventas V
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE V.codpro = 'S1';

/* 39. Obtener los colores de las piezas suministradas por s1.*/
SELECT DISTINCT P.color
FROM ventas V
JOIN pieza P ON V.codpie = P.codpie
WHERE V.codpro = 'S1';

/* 40. Obtener los códigos de las piezas suministradas a cualquier proyecto de Londres.*/
SELECT DISTINCT V.codpie
FROM ventas V
JOIN proyecto PR ON V.codpj = PR.codpj
WHERE PR.ciudad = 'Londres';

/* 41. Obtener los códigos de los proveedores con estado menor que el proveedor con código s1.*/
SELECT codpro
FROM proveedor
WHERE status < (SELECT status FROM proveedor WHERE codpro = 'S1');

/* 42. Obtener los códigos de los proyectos que usen la pieza pl en una cantidad media mayor que la mayor cantidad en la que cualquier pieza sea suministrada al proyecto j1.*/
SELECT codpj
FROM ventas
WHERE codpie = 'P1'
GROUP BY codpj
HAVING AVG(cantidad) > (SELECT MAX(cantidad) FROM ventas WHERE codpj = 'J1');

/* 43. Obtener códigos de proveedores que suministren a algún proyecto la pieza p1 en una cantidad mayor que la cantidad media en la que se suministra la pieza p1 a dicho proyecto.*/
SELECT DISTINCT V.codpro
FROM ventas V
WHERE V.codpie = 'P1'
AND V.cantidad > (SELECT AVG(V2.cantidad) FROM ventas V2 WHERE V2.codpie = 'P1' AND V2.codpj = V.codpj);

/* 44. Obtener los códigos de los proyectos que usen al menos una pieza suministrada por s1.*/
SELECT DISTINCT codpj
FROM ventas
WHERE codpro = 'S1';

/* 45. Obtener los códigos de los proveedores que suministren al menos una pieza suministrada al menos por un proveedor que suministre al menos una pieza roja.*/
SELECT DISTINCT V1.codpro
FROM ventas V1
WHERE V1.codpie IN (
    SELECT DISTINCT V2.codpie
    FROM ventas V2
    JOIN pieza P ON V2.codpie = P.codpie
    WHERE P.color = 'Rojo'
);

/* 46. Obtener los códigos de las piezas suministradas a cualquier proyecto de Londres usando EXISTS.*/
SELECT DISTINCT V.codpie
FROM ventas V
WHERE EXISTS (
    SELECT 1 FROM proyecto PR
    WHERE V.codpj = PR.codpj AND PR.ciudad = 'Londres'
);

/* 47. Obtener los códigos de los proyectos que usen al menos una pieza suministrada por s1 usando EXISTS.*/
SELECT DISTINCT V.codpj
FROM ventas V
WHERE EXISTS (
    SELECT 1 FROM ventas V2 WHERE V2.codpro = 'S1' AND V2.codpj = V.codpj
);

/* 48. Obtener los códigos de los proyectos que no reciban ninguna pieza roja suministrada por algún proveedor de Londres.*/
SELECT DISTINCT PR.codpj
FROM proyecto PR
WHERE NOT EXISTS (
    SELECT 1 FROM ventas V
    JOIN proveedor P ON V.codpro = P.codpro
    JOIN pieza PI ON V.codpie = PI.codpie
    WHERE PR.codpj = V.codpj AND P.ciudad = 'Londres' AND PI.color = 'Rojo'
);

/* 49. Obtener los códigos de los proyectos suministrados únicamente por s1.*/
SELECT codpj
FROM ventas
GROUP BY codpj
HAVING COUNT(DISTINCT codpro) = 1 AND MAX(codpro) = 'S1';

/* 50. Obtener los códigos de las piezas suministradas a todos los proyectos en Londres.*/
SELECT codpie
FROM ventas
WHERE codpj IN (SELECT codpj FROM proyecto WHERE ciudad = 'Londres')
GROUP BY codpie
HAVING COUNT(DISTINCT codpj) = (SELECT COUNT(*) FROM proyecto WHERE ciudad = 'Londres');

/* 51. Obtener los códigos de los proveedores que suministren la misma pieza a todos los proyectos.*/
SELECT codpro
FROM ventas
GROUP BY codpro, codpie
HAVING COUNT(DISTINCT codpj) = (SELECT COUNT(*) FROM proyecto);

/* 52. Obtener los códigos de los proyectos que reciban al menos todas las piezas que suministran s1.*/
SELECT codpj
FROM ventas
WHERE codpro = 'S1'
GROUP BY codpj
HAVING COUNT(DISTINCT codpie) = (SELECT COUNT(DISTINCT codpie) FROM ventas WHERE codpro = 'S1');

/* 53. Cambiar el color de todas las piezas rojas a naranja.*/
UPDATE pieza
SET color = 'Naranja'
WHERE color = 'Rojo';

/* 54. Borrar todos los proyectos para los que no haya cargamentos.*/
DELETE FROM proyecto
WHERE codpj NOT IN (SELECT DISTINCT codpj FROM ventas);

/* 55. Borrar todos los proyectos en Roma y sus correspondientes cargamentos.*/
DELETE FROM ventas
WHERE codpj IN (SELECT codpj FROM proyecto WHERE ciudad = 'Roma');

DELETE FROM proyecto
WHERE ciudad = 'Roma';

/* 56. Insertar un nuevo suministrador s lo en la tabla S. El nombre y la ciudad son 'White' y ‘New York' respectivamente. El estado no se conoce todavía.*/
INSERT INTO proveedor (codpro, nompro, ciudad, status)
VALUES ('SLO', 'White', 'New York', NULL);

/* 57. Construir una tabla conteniendo una lista de los códigos de las piezas suministrada.s a proyectos en Londres o suministradas por un suministrador de Londres.*/
CREATE TABLE piezas_londres AS
SELECT DISTINCT codpie
FROM ventas
WHERE codpj IN (SELECT codpj FROM proyecto WHERE ciudad = 'Londres')
   OR codpro IN (SELECT codpro FROM proveedor WHERE ciudad = 'Londres');
   
/* 58. Construir una tabla conteniendo una lista de los códigos de los proyectos de Londres o que tengan algún suministrador de Londres.*/
CREATE TABLE proyectos_londres AS
SELECT DISTINCT codpj
FROM proyecto
WHERE ciudad = 'Londres'
   OR codpj IN (SELECT DISTINCT codpj FROM ventas WHERE codpro IN (SELECT codpro FROM proveedor WHERE ciudad = 'Londres'));


