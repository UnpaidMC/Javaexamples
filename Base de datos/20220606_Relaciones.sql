CREATE TABLE cursos (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    curso varchar (30),
    descripcion varchar (50)
);
CREATE TABLE registros (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    cod_reg varchar (10),
    rut varchar (10)
);
CREATE TABLE direcciones (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    calle varchar (30),
    num int,
    ciudad varchar (20),
    region int,
    pais int
);

CREATE TABLE regiones (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre_region varchar(100),
    num_provincias varchar (100),
    cod_ciudad int
);

CREATE TABLE paises (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre_pais varchar(100),
    ciudad varchar(100)
);

CREATE TABLE ciudades (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(30),
    cod_prov int,
    cod_region int
);

CREATE TABLE provincias (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre_provincia varchar (30),
    num_region int
);

CREATE TABLE alumnos (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar (30),
    apellido varchar (50),
    edad int,
    direccion_id int,
    curso_id int,
    registro_id int,
    ciudad_id int,
    region_id int,
    pais_id int
);

ALTER TABLE alumnos ADD CONSTRAINT FK_direccionID FOREIGN KEY (direccion_id) REFERENCES direcciones(id),
ADD CONSTRAINT FK_cursoID FOREIGN KEY (curso_id) REFERENCES cursos(id),
ADD CONSTRAINT FK_regionID FOREIGN KEY (region_id) REFERENCES regiones(id),
ADD CONSTRAINT FK_paisesID FOREIGN KEY (pais_id) REFERENCES paises(id),
ADD CONSTRAINT FK_ciudadID FOREIGN KEY (ciudad_id) REFERENCES ciudades(id),
ADD CONSTRAINT FK_registroID FOREIGN KEY (registro_id) REFERENCES registros(id);

ALTER TABLE regiones ADD CONSTRAINT FK_regiones2ID FOREIGN KEY (cod_ciudad) REFERENCES ciudades(id);

ALTER TABLE ciudades ADD CONSTRAINT FK_provinciaID FOREIGN KEY (cod_prov) REFERENCES provincias(id);