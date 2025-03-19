/* 1. Antes de comenzar crea el usuario practica_vistas y otorga los permisos
exclusivamente necesarios para poder trabajar con la base de datos empresa y
pueda crear y consultar vistas. Ten en cuenta que este usuario posteriormente
deberá otorgar dichos permisos a otros. */
CREATE USER practica_vistas IDENTIFIED BY 'pass'; -- Como ROOT
GRANT CREATE VIEW, SELECT ON practica.* TO practica_vistas WITH GRANT OPTION; --
-- Como ROOT


-- 2. Realiza una vista que muestre el nombre y los apellidos de los empleados
cuyo código postal es 41510
CREATE VIEW empleados_mairena AS (
 SELECT nombre, apellidos FROM empleado WHERE cod_postal = '41510'
); -- Como practica_vistas


-- 3. Realiza una vista que muestre aquellos trabajos cuyo salario máximo sea
10.000 euros.
CREATE VIEW salarios_max AS (
 SELECT * FROM trabajo WHERE salario > 10000
); -- Como practica_vistas

-- 4. Muestra los DNI de los Jefes de Departamento
CREATE VIEW jefes AS (
 SELECT DISTINCT jefe FROM empleados
); -- Como practica_vistas

-- 5. Muestra un listado con el nombre y los apellidos de los empleados junto al
nombre de la universidad donde estudiaron.
CREATE VIEW estudios_empleado AS (
 SELECT e.nombre as nombre_empleado , e.apellidos as apellidos_empleado ,
u.nombre as universidad
 FROM empelado e JOIN estudios es ON es.id_empleado = e.id JOIN universidad u
ON u.id = es.id_universidad
); -- Como practica_vistas

-- 6. Realiza un usuario llamado usuario_vistas que pueda exclusivamente
consultar los datos para las vistas anteriores y pruébalo.
GRANT CREATE ON practica.* TO practica_vistas; -- Como ROOT
CREATE USER usuario_vistas IDENTIFIED BY 'pass'; -- Como practica_vistas
GRANT SELECT ON practica.empleados_mairena TO usuario_vistas; -- Como
practica_vistas
GRANT SELECT ON practica.salarios_max TO usuario_vistas; -- Como practica_vistas
GRANT SELECT ON practica.jefe TO usuario_vistas; -- Como practica_vistas
GRANT SELECT ON practica.estudios_empleado TO usuario_vistas; -- Como
practica_vistas
SELECT * FROM empleados_mairena; -- Como usuario_vistas
SELECT * FROM salarios_max; -- Como usuario_vistas
SELECT * FROM jefe; -- Como usuario_vistas
SELECT * FROM estudios_empleado; -- Como usuario_vistas