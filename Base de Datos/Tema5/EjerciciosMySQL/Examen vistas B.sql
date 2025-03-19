use banco;

-- Ejercicio 1 --
-- Como root --
CREATE USER 'cajero'@'localhost' IDENTIFIED BY 'pass';
GRANT CREATE VIEW, SELECT ON banco.* TO 'cajero'@'localhost' WITH GRANT OPTION;

-- Ejercicio 2 --
-- a partir de ahora todo se realizará como cajero
create view nombre_AP_dir as (
select nombre, apellidos, direccion from cliente
);

select * from nombre_AP_dir;

-- Ejercicio 3 --
create view nombre_AP_SU4 as (
select nombre, apellidos from cliente
where DIRECCION = 'C/ Lepanto, 17'
);

select * from nombre_AP_SU4;

-- Ejercicio 4 --
/*create view nombre_Interes as (
select cliente.nombre, cliente.APELLIDOS from cliente
where 
);*/

-- Ejercicio 5 --
create view saldo_Me as (
select cod_cliente from cuenta
where saldo < 5000
);

select * from saldo_Me;

-- Ejercicio 6 --
create user 'usuario_vistas'@'localhost' identified by 'pass';
grant select on banco.nombre_AP_dir to 'usuario_vistas'@'localhost';
grant select on banco.nombre_AP_SU4 to 'usuario_vistas'@'localhost';
grant select on banco.nombre_Interes to 'usuario_vistas'@'localhost';
grant select on banco.saldo_Me to 'usuario_vistas'@'localhost';