/* alterar la tabla articulo */

/* agregar un campo*/
ALTER TABLE articulo ADD COLUMN editorial VARCHAR(100);

/*ver la estructura de la tabla*/
DESCRIBE articulo;

ALTER TABLE articulo ADD COLUMN isbn BIGINT NOT NULL

ALTER TABLE articulo ADD COLUMN paginas INT NOT NULL
/*eliminar campos*/ 
ALTER TABLE articulo DROP COLUMN isbn;
ALTER TABLE articulo DROP COLUMN paginas;

DESCRIBE libro;

/* modificar la tabla libro, para dejar el campo articuloid como unique */
ALTER TABLE libro ADD CONSTRAINT UN_libro_articulo_id UNIQUE (articulo_id)


/*agregar una constraint (restriccion) al campo paginas para que sea > 0*/
ALTER TABLE libro ADD CONSTRAINT CHECK(nro_paginas > 0);

/*eliminar una tabla, primero creamos una tabla*/
CREATE TABLE articulo2 (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	titulo VARCHAR(50) NOT NULL 
);

DESCRIBE articulo2;
DROP TABLE articulo2;

/* crear tabla musica*/
CREATE TABLE musica_temas (
	musica_id INT NOT NULL,
	nro_tema INT,
	titulo VARCHAR(50),
	duracion INT,
	PRIMARY KEY(musica_id,nro_tema)
);

DESCRIBE musica_temas;
DROP TABLE musica_temas;
ALTER TABLE musica_temas ADD CONSTRAINT UN_musica_nro_tema UNIQUE(nro_tema);
ALTER TABLE musica_temas 
ADD CONSTRAINT FK_musica_temas_musica 
FOREIGN KEY (musica_id) 
REFERENCES musica(id);

ALTER TABLE articulo DROP COLUMN editorial;

SELECT * 
FROM articulo
WHERE id=2;

SELECT * 
FROM musica
WHERE articulo_id=2;

/*JOIN*/
SELECT * FROM musica m
JOIN articulo a
ON m.articulo_id = a.id;

SELECT a.*,
	m.*,
	mt.nro_tema, mt.titulo, mt.duracion
FROM musica m
	JOIN articulo a
		ON m.articulo_id = a.id
	JOIN musica_temas mt
		ON mt.musica_id = m.id;
