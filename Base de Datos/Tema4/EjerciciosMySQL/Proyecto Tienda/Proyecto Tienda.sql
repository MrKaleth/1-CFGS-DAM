-- creación de la base de datos --
create database Tienda;
use Tienda;

-- tabla proveedor --
create table Proveedor (
    ID_Proveedor int auto_increment,
    Nombre_Comercial varchar(200) not null,
    Razón_Social varchar(250) not null,
    Dirección varchar(355),
    Fecha_Inicio_Operaciones date,
    Nombre_Contacto varchar(200),
    constraint pk_Proveedor primary key (ID_Proveedor)
);

-- tabla empleado_proveedor --
create table Empleado_Proveedor (
    ID_Empleado int auto_increment,
    Nombre_Completo varchar(200) not null,
    Cargo varchar(150),
    Teléfono varchar(70),
    ID_Proveedor int,
    constraint pk_Empleado_Proveedor primary key (ID_Empleado),
    constraint fk_Empleado_Proveedor foreign key (ID_Proveedor) references Proveedor(ID_Proveedor) on delete cascade
);

-- tabla producto --
create table Producto (
    ID_Producto int auto_increment,
    Nombre varchar(200) not null,
    Descripción text,
    Tipo enum('Juego de Mesa', 'Juego de Rol', 'Juego de Cartas', 'Accesorio') not null,
    Precio decimal(10, 2) not null,
    Stock int not null,
    ID_Proveedor int,
    constraint pk_Producto primary key (ID_Producto),
    constraint fk_Producto foreign key (ID_Proveedor) references Proveedor(ID_Proveedor) on delete set null
);

-- tabla cliente --
create table Cliente (
    ID_Cliente int auto_increment,
    Nombre_Completo varchar(200) not null,
    Correo_Electrónico varchar(200) unique,
    Teléfono varchar(70),
    Dirección varchar(355),
    constraint pk_Cliente primary key (ID_Cliente)
);

-- tabla pedido --
create table Pedido (
    ID_Pedido int auto_increment,
    Fecha date not null,
    ID_Empleado int,
    constraint pk_Pedido primary key (ID_Pedido),
    constraint fk_Pedido foreign key (ID_Empleado) references Empleado_Proveedor(ID_Empleado) on delete set null
);

-- tabla línea_pedido --
create table Línea_Pedido (
    ID_Línea_Pedido int auto_increment,
    Cantidad int not null,
    ID_Pedido int,
    ID_Producto int,
    constraint pk_Línea_Pedido primary key (ID_Línea_Pedido),
    constraint fk_Línea_Pedido_Pedido foreign key (ID_Pedido) references Pedido(ID_Pedido) on delete cascade,
    constraint fk_Línea_Pedido_Producto foreign key (ID_Producto) references Producto(ID_Producto) on delete cascade
);

-- tabla venta --
create table Venta (
    ID_Venta int auto_increment,
    Fecha date not null,
    Total decimal(10, 2) not null,
    ID_Cliente int,
    Año_Fiscal year not null,
    Número_Secuencia int not null,
    unique (Año_Fiscal, Número_Secuencia),
    constraint pk_Venta primary key (ID_Venta),
    constraint fk_Venta_Cliente foreign key (ID_Cliente) references Cliente(ID_Cliente) on delete set null
);

-- tabla línea_venta --
create table Línea_Venta (
    ID_Línea_Venta int auto_increment,
    Cantidad int not null,
    Precio_Unitario decimal(10, 2) not null,
    Subtotal decimal(10, 2) not null,
    ID_Venta int,
    ID_Producto int,
    constraint pk_Línea_Venta primary key (ID_Línea_Venta),
    constraint fk_Línea_Venta_Venta foreign key (ID_Venta) references Venta(ID_Venta) on delete cascade,
    constraint fk_Línea_Venta_Producto foreign key (ID_Producto) references Producto(ID_Producto) on delete cascade
);

-- tabla devolución --
create table Devolución (
    ID_Devolución int auto_increment,
    Motivo text not null,
    Estado_Producto enum('Nuevo', 'Defectuoso', 'Incompleto') not null,
    ID_Línea_Venta int,
    constraint pk_Devolución primary key (ID_Devolución),
    constraint fk_Devolución_Línea_Venta foreign key (ID_Línea_Venta) references Línea_Venta(ID_Línea_Venta) on delete cascade
);

-- tabla evento --
create table Evento (
    ID_Evento int auto_increment,
    Nombre varchar(200) not null,
    Descripción text,
    Fecha date not null,
    Hora time not null,
    Capacidad_Máxima int not null,
    constraint pk_Evento primary key (ID_Evento)
);

-- tabla participación_evento --
create table Participación_Evento (
    ID_Participación int auto_increment,
    ID_Evento int,
    ID_Cliente int,
    constraint pk_Participación_Evento primary key (ID_Participación),
    constraint fk_Participación_Evento_Evento foreign key (ID_Evento) references Evento(ID_Evento) on delete cascade,
    constraint fk_Participación_Evento_Cliente foreign key (ID_Cliente) references Cliente(ID_Cliente) on delete cascade
);

-- Tabla Proveedor
insert into Proveedor (Nombre_Comercial, Razón_Social, Dirección, Fecha_Inicio_Operaciones, Nombre_Contacto)
values 
('Devir', 'Devir Iberia S.L.', 'Calle Mallorca 279, Barcelona', '1999-06-15', 'Carlos Martínez'),
('Edge Entertainment', 'Edge Entertainment S.L.', 'Calle Acueducto 23, Sevilla', '2002-09-10', 'Marta Jiménez'),
('Asmodee', 'Asmodee España S.L.', 'Avenida de Europa 6, Madrid', '2010-03-15', 'Lucía Gómez'),
('Hasbro', 'Hasbro Iberia S.L.', 'Calle Santiago Apóstol 12, Valencia', '2005-11-25', 'Juan Torres'),
('HobbyWorld', 'HobbyWorld S.A.', 'Avenida del Juego 45, Zaragoza', '2012-05-20', 'Ana Pérez'),
('Fantasy Flight Games', 'Fantasy Flight Games España', 'Calle Dragón 8, Málaga', '2018-07-30', 'Roberto Díaz'),
('Ludonauta', 'Ludonauta Distribuciones S.L.', 'Calle Aventura 19, Bilbao', '2015-02-10', 'Isabel Ramírez'),
('Rebel', 'Rebel Games S.L.', 'Calle Juguete 34, Granada', '2016-09-05', 'Tomás González'),
('Zacatrus', 'Zacatrus S.L.', 'Calle Diversión 11, Cádiz', '2017-01-18', 'Laura Moreno'),
('Mercurio', 'Mercurio Distribuciones S.L.', 'Calle Cómic 27, Alicante', '2013-04-22', 'Carla Vega');

-- Tabla Empleado_Proveedor
insert into Empleado_Proveedor (Nombre_Completo, Cargo, Teléfono, ID_Proveedor)
values 
('Javier García', 'Gerente', '+34 600123456', 1),
('Lucía Ramírez', 'Vendedor', '+34 610234567', 2),
('Carlos Núñez', 'Supervisor', '+34 620345678', 3),
('Sara Herrera', 'Atención al cliente', '+34 630456789', 4),
('Fernando Pérez', 'Gerente', '+34 640567890', 5),
('Andrea Silva', 'Vendedor', '+34 650678901', 6),
('Juan García', 'Supervisor', '+34 660789012', 7),
('Carmen López', 'Asistente', '+34 670890123', 8),
('Laura Díaz', 'Vendedor', '+34 680901234', 9),
('Santiago Gómez', 'Gerente', '+34 690012345', 10);

-- Tabla Producto
insert into Producto (Nombre, Descripción, Tipo, Precio, Stock, ID_Proveedor)
values 
('Dungeons & Dragons: Starter Set', 'Kit de inicio para aprender a jugar a D&D, incluye una aventura y dados', 'Juego de Rol', 19.99, 30, 1),
('Catan', 'Juego de mesa estratégico', 'Juego de Mesa', 39.99, 20, 2),
('Magic: The Gathering: Set Booster', 'Sobre de cartas coleccionables Magic', 'Juego de Cartas', 12.99, 50, 3),
('Dados Poliedros', 'Set de 7 dados de colores variados', 'Accesorio', 8.99, 100, 4),
('Carcassonne', 'Juego de mesa de colocación de losetas', 'Juego de Mesa', 29.99, 25, 5),
('Star Wars: X-Wing', 'Miniaturas para combates espaciales', 'Juego de Cartas', 79.99, 10, 6),
('Tapete de Juego', 'Tapete antideslizante para cartas', 'Accesorio', 19.99, 30, 7),
('Pandemic', 'Juego de mesa cooperativo', 'Juego de Mesa', 34.99, 15, 8),
('Fichas de Rol', 'Pack de 50 fichas para personajes', 'Accesorio', 5.99, 80, 9),
('Runewars', 'Juego de estrategia en un mundo fantástico', 'Juego de Mesa', 89.99, 5, 10);

-- Tabla Cliente
insert into Cliente (Nombre_Completo, Correo_Electrónico, Teléfono, Dirección)
values 
('María López', 'maria.lopez@gmail.com', '+34 611123456', 'Calle Sol 12, Madrid'),
('Antonio García', 'antonio.garcia@yahoo.com', '+34 612234567', 'Calle Luna 23, Sevilla'),
('Lucía Fernández', 'lucia.fernandez@hotmail.com', '+34 613345678', 'Calle Estrella 45, Valencia'),
('Carlos Martínez', 'carlos.martinez@gmail.com', '+34 614456789', 'Calle Aurora 67, Barcelona'),
('Ana Sánchez', 'ana.sanchez@outlook.com', '+34 615567890', 'Calle Viento 89, Bilbao'),
('David Gómez', 'david.gomez@gmail.com', '+34 616678901', 'Calle Nieve 101, Zaragoza'),
('Laura Ruiz', 'laura.ruiz@hotmail.com', '+34 617789012', 'Calle Agua 121, Málaga'),
('José Herrera', 'jose.herrera@gmail.com', '+34 618890123', 'Calle Fuego 143, Granada'),
('Paula Torres', 'paula.torres@yahoo.com', '+34 619901234', 'Calle Tierra 165, Cádiz'),
('Raúl Jiménez', 'raul.jimenez@outlook.com', '+34 620012345', 'Calle Árbol 187, Alicante');

-- Tabla Pedido
insert into Pedido (Fecha, ID_Empleado)
values 
('2025-01-10', 1),
('2025-01-11', 2),
('2025-01-12', 3),
('2025-01-13', 4),
('2025-01-14', 5),
('2025-01-15', 6),
('2025-01-16', 7),
('2025-01-17', 8),
('2025-01-18', 9),
('2025-01-19', 10);

-- Tabla Línea_Pedido
insert into Línea_Pedido (Cantidad, ID_Pedido, ID_Producto)
values 
(10, 1, 1),
(5, 2, 2),
(20, 3, 3),
(15, 4, 4),
(8, 5, 5),
(12, 6, 6),
(25, 7, 7),
(10, 8, 8),
(30, 9, 9),
(6, 10, 10);

-- Tabla Venta
insert into Venta (Fecha, Total, ID_Cliente, Año_Fiscal, Número_Secuencia)
values 
('2025-01-05', 99.95, 1, 2025, 1),
('2025-01-06', 49.98, 2, 2025, 2),
('2025-01-07', 129.97, 3, 2025, 3),
('2025-01-08', 19.99, 4, 2025, 4),
('2025-01-09', 34.99, 5, 2025, 5),
('2025-01-10', 79.99, 6, 2025, 6),
('2025-01-11', 89.98, 7, 2025, 7),
('2025-01-12', 12.99, 8, 2025, 8),
('2025-01-13', 179.98, 9, 2025, 9),
('2025-01-14', 25.99, 10, 2025, 10);

-- Tabla Línea_Venta
insert into Línea_Venta (Cantidad, Precio_Unitario, Subtotal, ID_Venta, ID_Producto)
values 
(5, 19.99, 99.95, 1, 1),
(1, 49.98, 49.98, 2, 2),
(2, 64.99, 129.97, 3, 3),
(1, 19.99, 19.99, 4, 1),
(1, 34.99, 34.99, 5, 5),
(1, 79.99, 79.99, 6, 6),
(2, 44.99, 89.98, 7, 7),
(1, 12.99, 12.99, 8, 3),
(2, 89.99, 179.98, 9, 10),
(1, 25.99, 25.99, 10, 4);

-- Tabla Devolución
insert into Devolución (Motivo, Estado_Producto, ID_Línea_Venta)
values 
('Defecto en el producto', 'Defectuoso', 1),
('Faltan piezas', 'Incompleto', 3),
('Producto dañado', 'Defectuoso', 5),
('Error en el pedido', 'Nuevo', 7),
('No cumple expectativas', 'Nuevo', 9);

-- Tabla Evento
insert into Evento (Nombre, Descripción, Fecha, Hora, Capacidad_Máxima)
values 
('Torneo de Magic', 'Competición de cartas Magic: The Gathering', '2025-02-10', '17:00:00', 50),
('Sesión de D&D', 'Aventura introductoria de Dungeons & Dragons', '2025-02-15', '15:00:00', 20),
('Noche de Catan', 'Partida abierta al público de Catan', '2025-02-20', '18:00:00', 30),
('Taller de pintura', 'Clase práctica para pintar miniaturas', '2025-02-25', '16:00:00', 15),
('Demostración de Carcassonne', 'Explicación y partida de Carcassonne', '2025-03-01', '12:00:00', 25),
('Torneo de X-Wing', 'Combate entre flotas del universo Star Wars', '2025-03-05', '14:00:00', 16),
('Introducción a los juegos de rol', 'Charla y partida para nuevos jugadores', '2025-03-10', '10:00:00', 40),
('Partida de Pandemic', 'Juego cooperativo en vivo', '2025-03-15', '19:00:00', 10),
('Noche de juegos de mesa', 'Variedad de juegos abiertos al público', '2025-03-20', '20:00:00', 50),
('Presentación de Runewars', 'Evento especial de demostración de Runewars', '2025-03-25', '13:00:00', 20);

-- Tabla Participación_Evento
insert into Participación_Evento (ID_Evento, ID_Cliente)
values 
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);