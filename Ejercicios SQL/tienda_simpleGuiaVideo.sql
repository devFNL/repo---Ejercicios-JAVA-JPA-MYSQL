DROP DATABASE IF EXISTS tienda_simple;
CREATE DATABASE tienda_simple CHARACTER SET utf8mb4;
USE tienda_simple;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  nacionalidad VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus', 'China');
INSERT INTO fabricante VALUES(2, 'Lenovo','China');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard', 'China');
INSERT INTO fabricante VALUES(4, 'Samsung', 'Brasil');
INSERT INTO fabricante VALUES(5, 'Seagate', 'Brasil');
INSERT INTO fabricante VALUES(6, 'Crucial', 'Japon');
INSERT INTO fabricante VALUES(7, 'Gigabyte', 'Japon');
INSERT INTO fabricante VALUES(8, 'Huawei', 'India');
INSERT INTO fabricante VALUES(9, 'Xiaomi', 'Korea');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

SELECT * FROM fabricante;
SELECT * FROM producto;

SELECT * FROM fabricante WHERE codigo = 3; -- HP
SELECT nombre FROM fabricante where codigo = 5; -- seagate
SELECT codigo, nombre from fabricante WHERE CODIGO = 5; -- 5 - seagate
SELECT CODIGO, NOMBRE, NACIONALIDAD FROM FABRICANTE WHERE CODIGO = 5; -- TODO
SELECT * FROM FABRICANTE WHERE CODIGO = 7; -- GYGABYTE
SELECT * FROM FABRICANTE WHERE CODIGO < 7; -- 1 AL 6
SELECT * FROM FABRICANTE WHERE CODIGO > 7; -- 8 Y 9
SELECT * FROM FABRICANTE WHERE NOMBRE = 'Lenovo'; -- lenovo
SELECT * FROM FABRICANTE WHERE NACIONALIDAD = 'China';
SELECT * FROM FABRICANTE WHERE NACIONALIDAD = 'China' AND NOMBRE = 'Asus';
SELECT * FROM FABRICANTE WHERE NACIONALIDAD = 'Japon' OR NACIONALIDAD = 'KOREA';

SELECT COUNT(*) FROM FABRICANTE;
SELECT COUNT(*) FROM FABRICANTE WHERE NACIONALIDAD = 'China';

SELECT MAX(CODIGO) FROM FABRICANTE;
SELECT MIN(CODIGO) FROM FABRICANTE;

SELECT * FROM FABRICANTE WHERE CODIGO IN (3, 5); -- HP Y SEAGATE
SELECT * FROM FABRICANTE WHERE NOMBRE LIKE '%su%'; -- asus y samsung
SELECT * FROM FABRICANTE WHERE NOMBRE LIKE 'sus%'; -- nada, con esto tiene que empezar
SELECT * FROM FABRICANTE WHERE NOMBRE LIKE '%sus'; -- Asus, porque termina en sus.

SELECT * FROM FABRICANTE WHERE CODIGO between 2 AND 7; -- DEL 2 AL 7

-- relacionar.

SELECT * FROM FABRICANTE;
SELECT * FROM PRODUCTO;

SELECT f.nombre, p.nombre, p.precio
FROM fabricante f, producto p -- nombre como variables auxiliares para hacer referencia
WHERE f.codigo = p.codigo_fabricante;

SELECT f.nombre, p.nombre, p.precio
FROM fabricante f, producto p
WHERE f.codigo = p.codigo_fabricante
AND f.codigo = 7;

SELECT f.nombre, f.codigo
FROM fabricante f, producto p
WHERE f.codigo = p.codigo_fabricante
AND f.codigo = 7;

SELECT p.codigo, p.nombre, p.precio
FROM fabricante f, producto p
WHERE f.codigo = p.codigo_fabricante
and f.codigo = 7;

SELECT p.codigo, p.nombre, p.precio
FROM fabricante f, producto p
WHERE f.codigo = p.codigo_fabricante
and f.nombre = 'Lenovo';

SELECT p.codigo, p.nombre, p.precio
FROM fabricante f, producto p
WHERE f.codigo = p.codigo_fabricante
AND f.nombre = 'Lenovo'
AND p.precio > 450;


insert INTO FABRICANTE VALUES (10,'Egg', 'Mendoza');
SELECT * FROM FABRICANTE;
SELECT * FROM PRODUCTO;

SELECT * FROM producto p inner join fabricante f on p.codigo_fabricante = f.codigo; -- trae todos los productos que tinene fabricantes

SELECT * FROM producto p left outer join fabricante f on p.codigo_fabricante = f.codigo; -- trae todos los productos  + interseccion
SELECT * FROM producto p right outer join fabricante f on p.codigo_fabricante = f.codigo; -- trae todos los fabricantes + interseccion

SELECT * FROM producto p where exists (Select f.codigo from fabricante f where f.codigo = p.codigo_fabricante); -- productos que existan en la relacion
SELECT * FROM producto p where not exists (Select f.codigo from fabricante f where f.codigo = p.codigo_fabricante); -- productos que NO existan en la relacion

SELECT * FROM fabricante f WHERE NOT EXISTS (SELECT p.codigo_fabricante from producto p where p.codigo_fabricante = f.codigo); -- fabricantes sin productos

SELECT * FROM producto p cross join fabricante f; -- trae todos los productos para todos los fabricantes


 
