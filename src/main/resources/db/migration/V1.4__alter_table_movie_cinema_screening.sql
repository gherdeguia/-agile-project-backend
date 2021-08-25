ALTER TABLE Cinema DROP COLUMN screening_id;
ALTER TABLE Cinema DROP COLUMN movie_id;

ALTER TABLE Screening DROP COLUMN movie_id;

ALTER TABLE Movie ADD cinema_id int;
