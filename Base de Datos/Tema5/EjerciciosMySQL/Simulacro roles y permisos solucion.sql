-- 1. Crear un usuario con nombre 'chatgpt' e inactivarlo por defecto
CREATE USER 'chatgpt'@'localhost' IDENTIFIED BY 'contraseña123';
ALTER USER 'chatgpt'@'localhost' ACCOUNT LOCK;

-- 2. Iniciar sesión y cambiar la contraseña (hazlo en tu cliente MySQL)
ALTER USER 'chatgpt'@'localhost' IDENTIFIED BY 'nuevaContraseña123';

-- 3. Crear la base de datos y las tablas
CREATE DATABASE prueba_practica;
USE prueba_practica;

CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(100) NOT NULL,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

-- 4. Insertar registros de ejemplo
INSERT INTO cliente (nombre) VALUES ('Juan Pérez'), ('María López');

INSERT INTO producto (nombre_producto, id_cliente) VALUES 
('Laptop', 1),
('Teléfono', 2);

-- 5. Crear una vista con información cruzada
CREATE VIEW vista_cliente_producto AS
SELECT cliente.nombre AS Cliente, producto.nombre_producto AS Producto
FROM cliente
JOIN producto ON cliente.id_cliente = producto.id_cliente;

-- 6. Crear usuario 'becario' y darle permisos sobre la vista
CREATE USER 'becario'@'localhost' IDENTIFIED BY 'becario123';
GRANT SELECT ON prueba_practica.vista_cliente_producto TO 'becario'@'localhost';

-- 7. Eliminar el usuario 'becario'
DROP USER 'becario'@'localhost';