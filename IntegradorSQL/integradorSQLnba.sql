-- CANDADO A: 
-- Pos: 2 | Clave: 14043
-- CANDADO B:
-- Pos: 3 | Clave: 3480
-- CANDADO C
-- Pos: 1 | Clave: 631
-- CANDADO D
-- Pos: 4 | Clave: 191

-- CANDADO A: 
-- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT asistencias_por_partido
FROM estadisticas
order by asistencias_por_partido desc;
-- RESULTADO: 2

-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
-- centro o esté comprendida en otras posiciones.

select * from jugadores;

SELECT sum(j.peso)
FROM jugadores j
JOIN equipos e
ON j.Nombre_equipo = e.Nombre
WHERE e.Conferencia = 'East'
AND j.Posicion LIKE '%C%';
-- RESULTADO: 14043

-- CANDADO B:
-- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
-- jugadores que tiene el equipo Heat.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT count(j.nombre)
FROM jugadores j
JOIN estadisticas e
ON j.codigo = e.jugador
WHERE e.Asistencias_por_partido > (
	SELECT count(nombre)
    FROM jugadores
    WHERE nombre_equipo = 'Heat'
);
-- RESULTADO: 3

-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999

SELECT count(*)
FROM partidos
WHERE temporada LIKE '%99%' ;
-- RESULTADO: 3480

-- CANDADO C
-- Pos: 1 | Clave: 631
-- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
-- parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
-- 195, y a eso le vamos a sumar 0.9945.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT count(j.nombre)
FROM jugadores j
JOIN equipos e
ON j.Nombre_equipo = e.Nombre
WHERE j.Procedencia = 'Michigan'
AND e.Conferencia = 'West';
-- res: 2
SELECT count(nombre)
FROM jugadores
WHERE peso >= 195;
-- res: 362
-- 2/362 = 0.0055 + 0.9945 = 1
-- RESULTADO: 1

-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
-- sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
-- tapones por partido. Además, este resultado debe ser, donde la división sea central.

SELECT FLOOR((AVG(es.Puntos_por_partido) + COUNT(es.Asistencias_por_partido) + SUM(es.Tapones_por_partido)))
FROM estadisticas es
JOIN jugadores j ON es.jugador = j.codigo
JOIN equipos eq ON j.Nombre_equipo = eq.Nombre
WHERE eq.Division = 'Central';
-- RESULTADO: 631

-- CANDADO D
-- Pos: 4 | Clave: 191
-- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
-- resultado debe ser redondeado. Nota: el resultado debe estar redondeado
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT ROUND(Tapones_por_partido)
FROM estadisticas
WHERE jugador = (
	SELECT codigo 
    FROM jugadores 
    WHERE nombre = 'Corey Maggette'
)
AND temporada = '00/01';
-- RESULTADO: 4

-- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
-- de todos los jugadores de procedencia argentina.

SELECT FLOOR(SUM(e.Puntos_por_partido))
FROM estadisticas e
JOIN jugadores j
ON e.jugador = j.codigo
WHERE j.Procedencia = 'Argentina';
-- RESULTADO: 191

