use banco;
-- Ejercicio 1 --
/*crea el usuario practica_vistas y otorga los permisos
exclusivamente necesarios para poder trabajar con la base de
datos empresa y pueda crear y consultar vistas. 
Ten en cuenta que este usuario posteriormente deberá otorgar 
dichos permisos a otros.*/

create user 'practica_vistas'@'localhost' identified by 'dam';
grant select, create view, show view on banco.* to 'practica_vistas'@'localhost' with grant option;

-- Ejercicio 2 --
/*Realiza una vista que muestre el nombre y los apellidos de los clientes cuyo
Cod_Cliente tiene 5 letras o menos*/
create view vista_cliente_Cod_Corto as
select nombre, apellidos from cliente
where length(Cod_Cliente) <= 7;

select * from vista_cliente_Cod_Corto;

-- Ejercicio 3 --
/*Realiza una vista que muestre aquellas cuentas cuyo saldo sea mayor 10.000 de
euros.*/
create view vista_Saldo as
select cod_cuenta, saldo, cod_cliente from cuenta
where saldo > 10000;

select * from vista_Saldo;

-- Ejercicio 4 --

-- Ejercicio 5 --
/*Muestra un listado con el nombre y los apellidos de los clientes 
junto al código de la cuenta*/
create view vista_clientes_cuentas as
select c.nombre, c.apellidos, cu.Cod_Cuenta
from cliente c
join cuenta cu on c.Cod_Cliente = cu.Cod_Cliente;

select * from vista_clientes_cuentas;

-- Ejercicio 6 --
/*Realiza un usuario llamado usuario_vistas que pueda exclusivamente consultar los
datos para las vistas anteriores y pruébalo.*/
create user 'user_vista'@'localhost' identified by 'dam';

grant select on banco.vista_cliente_Cod_Corto to 'user_vista'@'localhost';
grant select on banco.vista_Saldo to 'user_vista'@'localhost';
grant select on banco.vista_clientes_cuentas to 'user_vista'@'localhost';

/*use banco;

select * from vista_cliente_Cod_Corto;
select * from banco.vista_Saldo;
select * from banco.vista_clientes_cuentas;
*/
