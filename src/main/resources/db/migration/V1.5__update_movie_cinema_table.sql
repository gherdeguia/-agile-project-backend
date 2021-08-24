INSERT INTO cinema VALUES(2,'Fisher Mall');

UPDATE Movie SET cinema_id=1 WHERE id=1;

UPDATE Movie SET cinema_id=2 WHERE id=2;

UPDATE Movie SET cinema_id=1 WHERE id=3;

UPDATE Movie SET cinema_id=2 WHERE id=4;

UPDATE Screening SET start_time='2021-08-23 01:0:00' WHERE ID=1;
