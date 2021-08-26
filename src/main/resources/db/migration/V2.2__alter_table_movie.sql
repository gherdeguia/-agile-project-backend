DELETE FROM MOVIE;

ALTER TABLE Movie ADD movie_id int not null;

INSERT INTO movie(name, synopsis, directed_by, rated, running_time, genre, release_date, cast_and_crews, poster, status,
 critics_rating, audience_rating, cinema_id, movie_id)
VALUES
(
	'Captain America: The First Avenger',
	'Scrawny Steve Rogers in World War II gets the Super Soldier serum to become big, buff Steve Rogers and helps take out Red Skull before being frozen in ice for 70 years.',
	'Joe Johnston',
	'PG',
	'02:00:00',
	'Superhero',
	'2021-08-23',
	'Chris Evans',
	'https://media.comicbook.com/2017/10/captain-america-the-first-avenger-movie-poster-marvel-cinematic--1038891.jpeg',
	'showing',
	9.5,
	9.1,
	1,
	1
),
(
	'Captain Marvel',
	'Pilot Carol Danvers is infused with powers by the Tesseract (Infinity Stone No. 1 -- the Space Stone).',
	'Anna Boden',
	'PG',
	'01:45:00',
	'Science Fiction Comedy',
	'2021-08-24',
	'Brie Larson',
	'https://m.media-amazon.com/images/M/MV5BMTE0YWFmOTMtYTU2ZS00ZTIxLWE3OTEtYTNiYzBkZjViZThiXkEyXkFqcGdeQXVyODMzMzQ4OTI@._V1_.jpg',
	'showing',
	8.0,
	8.0,
	2,
	2
),
(
	'Iron Man',
	'To save his own life, weapons wunderkind Tony Stark builds a suit of armor "in a cave... with a bunch of scraps"',
	'Joe Johnston',
	'PG',
	'02:00:00',
	'Superhero',
	'2021-08-23',
	'Robert Downey Jr.',
	'https://media.comicbook.com/2017/10/iron-man-movie-poster-marvel-cinematic-universe-1038878.jpg',
	'showing',
	9.3,
	9.3,
	1,
	3
),
(
	'Iron Man 2',
	'Stark discovers a new element, upgrades his suit (again), then gets a sidekick who has mysteriously transformed from Terrence Howard into Don Cheadle.',
	'Anna Boden',
	'PG',
	'01:45:00',
	'Science Fiction Comedy',
	'2021-08-24',
	'Robert Downey Jr.',
	'https://media.comicbook.com/2017/10/iron-man-2-movie-poster-marvel-cinematic-universe-1038887.jpg',
	'showing',
	8.2,
	8.2,
	2,
	4
),
(
	'Thor',
	'Mighty God of Thunder is not so mighty when he makes daddy mad, gets banished to Earth, falls in love and learns humility.',
	'Joe Johnston',
	'PG',
	'02:00:00',
	'Superhero',
	'2021-08-23',
	'Chris Hemsworth',
	'https://media.comicbook.com/2017/10/thor-movie-poster-marvel-cinematic-universe-1038890.jpg',
	'showing',
	9.2,
	9.2,
	1,
	5
),
(
	'The Avengers',
	'Our heroes join with S.H.I.E.L.D. to stop an alien army led by "puny god" Loki from destroying New York.',
	'Anna Boden',
	'PG',
	'01:45:00',
	'Science Fiction Comedy',
	'2021-08-24',
	'Robert Downey Jr.',
	'https://media.comicbook.com/2017/10/the-avengers-movie-poster-marvel-cinematic-universe-1038892.jpg',
	'showing',
	9.6,
	9.6,
	2,
	6
),
(
	'Iron Man 3',
	'Stark deals with emotional issues after his near-death experience in New York by building dozens of new suits.',
	'Joe Johnston',
	'PG',
	'02:00:00',
	'Superhero',
	'2021-08-31',
	'Robert Downey Jr.',
	'https://media.comicbook.com/2017/10/iron-man-3-movie-poster-marvel-cinematic-universe-1038894.jpg',
	'coming soon',
	null,
	null,
	1,
	7
),
(
	'Thor: The Dark World',
	'Thor fights to save his love from the Aether (Infinity Stone No. 2 -- the Reality Stone).',
	'Joe Johnston',
	'PG',
	'02:00:00',
	'Superhero',
	'2021-08-31',
	'Chris Hemsworth',
	'https://media.comicbook.com/2017/10/thor-movie-poster-marvel-cinematic-universe-1038890.jpg',
	'coming soon',
	null,
	null,
	2,
	8
),
(
	'Thor: The Dark World',
	'Thor fights to save his love from the Aether (Infinity Stone No. 2 -- the Reality Stone).',
	'Joe Johnston',
	'PG',
	'02:00:00',
	'Superhero',
	'2021-08-31',
	'Chris Hemsworth',
	'https://media.comicbook.com/2017/10/thor-movie-poster-marvel-cinematic-universe-1038890.jpg',
	'coming soon',
	null,
	null,
	1,
	8
)
;