
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre, posicion, peso
from jugadores 
where posicion = 'C' 
and peso > 200 
order by nombre;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre
from equipos
order by nombre;
-- 4. Mostrar el nombre de los equipos del este (East).
select nombre, conferencia
from equipos
where conferencia = 'East';
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select *
from equipos
where ciudad like 'C%'
order by nombre;
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select *
from jugadores
order by nombre_equipo;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select *
from jugadores
where nombre_equipo = 'Raptors'
order by nombre;
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select Puntos_por_partido
from estadisticas
where jugador = (
	select codigo
    from jugadores
    where nombre = 'Pau Gasol'
);
-- segunda forma (relacionando tablas)
select e.puntos_por_partido
from estadisticas e, jugadores j
where e.jugador = j.codigo
and j.nombre = 'Pau Gasol';
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select Puntos_por_partido
from estadisticas
where jugador = (
	select codigo
    from jugadores
    where nombre = 'Pau Gasol'
)
and temporada = '04/05';
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select sum(Puntos_por_partido), jugador
from estadisticas
group by jugador;

select * from estadisticas;
select * from jugadores;
-- 11. Mostrar el número de jugadores de cada equipo.
select count(nombre), nombre_equipo
from jugadores
group by nombre_equipo;
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select sum(puntos_por_partido)
from estadisticas
group by jugador
order by sum(puntos_por_partido) desc
limit 1;

select * from estadistica;
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select nombre, conferencia, division
from equipos
where nombre = (
	select nombre_equipo
    from jugadores
    where altura = (
		select max(altura)
        from jugadores
        )
    );
-- otra forma, con relacion de tablas
select e.*, j.nombre
from equipos e, jugadores j
where e.nombre = j.nombre_equipo
and altura = (
	select max(altura)
    from jugadores
);
-- 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
select avg(e.puntos_por_partido), j.nombre_equipo
from estadisticas e, jugadores j
where j.codigo = e.jugador
and j.nombre_equipo 
in (
	select nombre
	from equipos
	where division = 'Pacific'
)
group by j.nombre_equipo;
-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos. REVISAR
select *, abs(max(puntos_local - puntos_visitante)) as diferencia
from partidos
group by codigo
order by diferencia desc
limit 5;

select equipo_local, equipo_visitante, ABS(puntos_local - puntos_visitante) as diferencia
from partidos
where ABS(puntos_local - puntos_visitante) = (select MAX(ABS(puntos_local - puntos_visitante)) from partidos);


-- 16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
select e.nombre, sum(p.puntos_local) as local_total, sum(p.puntos_visitante) as visitante_total
from partidos p, equipos e
where p.equipo_local = e.nombre or p.equipo_visitante = e.nombre
group by e.nombre;

select e.*, sum(p.puntos_local) as local_total, sum(p.puntos_visitante) as visitante_total
from partidos p
join equipos e on p.equipo_local = e.nombre or p.equipo_visitante = e.nombre
group by e.nombre;


select * from partidos;
-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.

select *,   if (puntos_visitante > puntos_local, equipo_visitante,  -- if
			if (puntos_visitante < puntos_local, equipo_local, 		-- else if
			null)) 													-- else
as equipo_ganador
from partidos;

select *,
	case																-- switch
		when puntos_local > puntos_visitante then equipo_local			-- case1, then (es la funcion)
		when puntos_local < puntos_visitante then equipo_visitante 		-- case2, then (es la funcion)
        else 
        null															-- else = default 
	end																	-- llave de cierre de switch // break
	as equipo_ganador
	from partidos;
