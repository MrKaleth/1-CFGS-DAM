-- Ejercicio 1 --
show grants for 'root'@'localhost';

-- Ejercicio 2 --
create user 'Administrador'@'localhost' identified by 'pass_admin';
create role 'Admin_C';
grant all privileges on *.* to 'Admin_C' with grant option;
grant 'Admin_C' to 'Administrador'@'localhost';
show grants for 'Administrador'@'localhost';

create role 'Admin_D';
grant create on *.* to 'Admin_D' with grant option;
create user 'Administrador2'@'localhost' identified by 'pass_admin';
grant 'Admin_D' to 'Administrador2'@'localhost';
show grants for 'Administrador2'@'localhost';

-- Ejercicio 3 --
