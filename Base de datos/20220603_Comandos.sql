
--creacion de base de datos--
create database "nombre_baseDatos";


INSERT INTO clientes

--actualizar registro en tabla---

UPDATE nombre_tabla
SET columna_amodificar = valor_insertar, columna2_amodificar = valor2_insertar, 
WHERE *Condicion*

UPDATE clientes
SET nombre = 'Lukas', correo = 'lukas@lukas.cl'
Where id = 1;

CREATE TABLE  direcciones(

id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
direccion varchar(50) NOT NULL,
numero int NOT NULL, 

);

--modificar tabla--

ALTER TABLE nombre_tabla
ADD nombre_columna tipo restriccion;

--Foreign Keys se pueden repetir--

--relacionar tablas--

ALTER TABLE clientes ADD CONSTRAINT FK_direccionID FOREIGN KEY (direccionID) REFERENCES direcciones(id);

--Relaciones--

1 a 1: Interaccion entre 2 tablas, donde un solo registro, es representado una sola vez en la otra tabla
1 a N (Muchos): Interaccion entre 2 tablas, donde un registro es representado varias veces en la otra tabla
Many to many: Interaccion entre tablas, pero existe una tabla entre media