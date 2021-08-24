ALTER TABLE Cinema DROP COLUMN screening_id,movie_id;

ALTER TABLE Screening DROP COLUMN movie_id;

ALTER TABLE Movie ADD cinema_id int;

ALTER TABLE Movie ADD FOREIGN KEY (cinema_id) REFERENCES Cinema(id);
