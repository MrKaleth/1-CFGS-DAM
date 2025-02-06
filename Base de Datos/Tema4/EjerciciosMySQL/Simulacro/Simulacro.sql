-- Simulacro --
CREATE DATABASE simulacro;
USE simulacro;

CREATE TABLE Proveedor (
    ID INT AUTO_INCREMENT,
    CIF VARCHAR(9) UNIQUE NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    País VARCHAR(100),
    URL VARCHAR(255) DEFAULT 'www.default.es',
    CONSTRAINT PK_Proveedor PRIMARY KEY (ID)
);

CREATE TABLE Agente (
    cod_agente INT,
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100),
    Teléfono VARCHAR(15),
    Tipo CHAR(1) CHECK (Tipo IN ('C', 'N')) NOT NULL,
    CONSTRAINT PK_Agente PRIMARY KEY (cod_agente)
);

CREATE TABLE Booking (
    Localizador CHAR(6),
    Fecha_chekin DATE NOT NULL,
    Precio_coste DECIMAL(10, 2) CHECK (Precio_coste <= 1000 AND Precio_coste >= 0) NOT NULL,
    Precio_venta DECIMAL(10, 2) CHECK (Precio_venta >= 0) NOT NULL,
    ID_proveedor INT,
    cod_agente INT,
    CONSTRAINT PK_Booking PRIMARY KEY (Localizador),
    CONSTRAINT FK_Booking_Proveedor FOREIGN KEY (ID_proveedor) REFERENCES Proveedor(ID),
    CONSTRAINT FK_Booking_Agente FOREIGN KEY (cod_agente) REFERENCES Agente(cod_agente)
);

insert into Proveedor(ID, CIF, Nombre, País, URL)
values
("1", "R5502108C", "Jet2Travel", "España"),
("2", "D76506849", "Corendon", "Turquía");

insert into Agente(cod_agente, Nombre, Apellidos, Teléfono, Tipo)
values
("1", "Eduardo", "Ruiz Salvador", "953639337", "C"),
("2", "Elisa", "Cáceres Pulido", "971408799", "N");

insert into Booking(Localizador, Fecha_chekin, precio_coste, Precio_venta, ID_proveedor, cod_agente)
values
(




