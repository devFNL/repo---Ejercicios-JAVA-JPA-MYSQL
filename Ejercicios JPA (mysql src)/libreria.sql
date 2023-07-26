DROP DATABASE IF EXISTS libreria;
CREATE DATABASE libreria;

select * from autor;
select * from editorial;
select * from libro;
select * from cliente;
select * from prestamo;



-- Insertar libro 1
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('1', 9788499082475, 'El Señor de los Anillos', 1954, 500, 100, 400, 1, 'J.R.R. Tolkien', 'Minotauro');

-- Insertar libro 2
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('2', 9788478884957, 'Harry Potter y la Piedra Filosofal', 1997, 1000, 200, 800, 1, 'J.K. Rowling', 'Salamandra');

-- Insertar libro 3
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('3', 9788496208690, 'Canción de Hielo y Fuego', 1996, 800, 150, 650, 1, 'George R.R. Martin', 'Gigamesh');

-- Insertar libro 4
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('4', 9788401352836, 'El nombre del viento', 2007, 600, 50, 550, 1, 'Patrick Rothfuss', 'Plaza & Janés');

-- Insertar libro 5
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('5', 9788408062783, 'Las Crónicas de Narnia', 1950, 700, 100, 600, 1, 'C.S. Lewis', 'Destino');

-- Insertar libro 6
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('6', 9788466657500, 'Elantris', 2005, 400, 80, 320, 1, 'Brandon Sanderson', 'Ediciones B');

-- Insertar libro 7
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('7', 9788496208691, 'Tormenta de Espadas', 2000, 900, 200, 700, 1, 'George R.R. Martin', 'Gigamesh');

-- Insertar libro 8
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('8', 9788499895566, 'American Gods', 2001, 500, 70, 430, 1, 'Neil Gaiman', 'Roca Editorial');

-- Insertar libro 9
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('9', 9788448034643, 'El Ciclo de la Puerta de la Muerte', 1984, 400, 80, 320, 1, 'Margaret Weis y Tracy Hickman', 'Timun Mas');

-- Insertar libro 10 (reemplazado)
INSERT INTO libro (id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial)
VALUES ('10', 9788498387087, 'Animales Fantásticos y Dónde Encontrarlos', 2001, 400, 80, 320, 1, 'J.K. Rowling', 'Salamandra');

-- Insertar editoriales
INSERT INTO editorial (id, nombre, alta)
VALUES ('1', 'Minotauro', 1),
       ('2', 'Salamandra', 1),
       ('3', 'Gigamesh', 1),
       ('4', 'Plaza & Janés', 1),
       ('5', 'Destino', 1),
       ('6', 'Ediciones B', 1),
       ('7', 'Roca Editorial', 1),
       ('8', 'Timun Mas', 1);

-- Insertar autores
INSERT INTO autor (id, nombre, alta)
VALUES ('1', 'J.R.R. Tolkien', 1),
       ('2', 'J.K. Rowling', 1),
       ('3', 'George R.R. Martin', 1),
       ('4', 'Patrick Rothfuss', 1),
       ('5', 'C.S. Lewis', 1),
       ('6', 'Brandon Sanderson', 1),
       ('7', 'Neil Gaiman', 1),
       ('8', 'Margaret Weis y Tracy Hickman', 1);
