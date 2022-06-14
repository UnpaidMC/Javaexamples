/*--INSERT INTO nombre_tabla (columna1, columna2..., columnaN) VALUES (valor1, valor2,....valorN) , (valor1, valor2,.....valorN*/


INSERT INTO cursos (curso, descripcion) VALUES ('alfa', 'Los mas aplicados'), ('beta', 'Los mas inteligentes'), ('gamma', 'Los mas astutos');
INSERT INTO registros (cod_reg, rut) VALUES ('ZP202201', '123456-7'), ('AP202202', '234567-8'), ('TL202203', '345678-9');
INSERT INTO direcciones (calle, num, ciudad, region, pais) VALUES ('Prat', 123, 'Arica', 1, 1), ('Bulnes', 123, 'Punta Arenas', 12, 1), ('Arana', 123, 'Concepcion', 8, 1);



INSERT INTO regiones(id, nombre_region, num_provincias) VALUES (1, 'ARICA Y PARINACOTA',2),
(2,'TARAPACÁ',2),
(3,'ANTOFAGASTA',3),
(4,'ATACAMA ',3),
(5,'COQUIMBO ',3),
(6,'VALPARAÍSO ',8),
(7,'DEL LIBERTADOR GRAL. BERNARDO O HIGGINS',3),
(8,'DEL MAULE',4),
(9,'DEL BIOBIO ',4),
(10,'DE LA ARAUCANIA',2),
(11,'DE LOS RIOS',2),
(12,'DE LOS LAGOS',4),
(13,'AISEN DEL GRAL. CARLOS IBANEZ DEL CAMPO ',4),
(14,'MAGALLANES Y DE LA ANTÁRTICA CHILENA',4),
(15,'METROPOLITANA DE SANTIAGO',6);

INSERT INTO paises (nombre_pais)
VALUES ('Chile'),('Argentina'),('Colombia'),('Perú'),('Brasil'),('Uruguay'),('Venezuela'),('Paraguay');

INSERT INTO provincias(id, nombre_provincia, num_region) VALUES 	(1,'ARICA',2),
					(2,'PARINACOTA',2),
					(3,'IQUIQUE',2),
					(4,'TAMARUGAL',5),
					(5,'ANTOFAGASTA',4),
					(6,'EL LOA',3),
					(7,'TOCOPILLA',2),
					(8,'COPIAPÓ',3),
					(9,'CHAÑARAL',2),
					(10,'HUASCO',4),
					(11,'ELQUI',6),
					(12,'CHOAPA',4),
					(13,'LIMARÍ',5),
					(14,'VALPARAÍSO',7),
					(15,'ISLA DE PASCUA',1),
					(16,'LOS ANDES',4),
					(17,'PETORCA',5),
					(18,'QUILLOTA',5),
					(19,'SAN ANTONIO',6),
					(20,'SAN FELIPE DE ACONCAGUA',6),
					(21,'MARGA MARGA',4),
					(22,'CACHAPOAL',17),
					(23,'CARDENAL CARO',6),
					(24,'COLCHAGUA',10),
					(25,'TALCA',10),
					(26,'CAUQUENES',3),
					(27,'CURICÓ',9),
					(28,'LINARES',8),
					(29,'CONCEPCIÓN',12),
					(30,'ARAUCO',7),
					(31,'BIOBÍO',14),
					(32,'ÑUBLE',21),
					(33,'CAUTÍN',21),
					(34,'MALLECO',11),
					(35,'VALDIVIA',8),
					(36,'RANCO',4),
					(37,'LLANQUIHUE',9),
					(38,'CHILOÉ',10),
					(39,'OSORNO',7),
					(40,'PALENA',4),
					(41,'COIHAIQUE',2),
					(42,'AISÉN',3),
					(43,'CAPITÁN PRAT',3),
					(44,'GENERAL CARRERA',2),
					(45,'MAGALLANES',4),
					(46,'ANTÁRTICA CHILENA',2),
					(47,'TIERRA DEL FUEGO',3),
					(48,'ULTIMA ESPERANZA',2),
					(49,'SANTIAGO',32),
					(50,'CORDILLERA',3),
					(51,'CHACABUCO',3),
					(52,'MAIPO',4),
					(53,'MELIPILLA',5),
					(54,'TALAGANTE',5);


INSERT INTO ciudades(nombre)
VALUES ('Santiago'),('Buenos Aires'),('Medellin'),('Lima'),('Brasilia'),('Montevideo'),('Caracas'),('Asunsion');

INSERT INTO alumnos (nombre, apellido, edad, curso_id, registro_id, direccion_id) VALUES ('Zoe', 'Palma', 3, 1, 3, 1), ('Ayun', 'Palma', 3, 1, 3, 2), ('Tom', 'Loren', 5, 3, 1, 3);