--DELETE TABLE DATA
DELETE FROM screening;
DELETE FROM movie;
DELETE FROM Payment;
DELETE FROM seat;

--INSERT CINEMA
INSERT INTO cinema VALUES
(3,'Greenbelt 3'),
(4,'Glorietta 3');

--INSERT MOVIE
INSERT INTO MOVIE(name,synopsis,directed_by,rated,running_time,genre,release_date,cast_and_crews,poster,status,critics_rating,audience_rating,cinema_id,movie_id)
VALUES
('Spiderman: No Way Home','For the first time in the cinematic history of Spider-Man, our friendly neighborhood hero is unmasked and no longer able to separate his normal life from the high-stakes of being a Super Hero. ','Jon Watts','PG','02:00:00','Sci-Fi','2021-12-17','Zendaya,Tom Holland, enedict Cumberbatch','https://iphoneswallpapers.com/wp-content/uploads/2021/08/spiderman-no-way-home.jpg','coming soon',0,0,1,1),
('Shang-Chi and the Legend of the Ten Rings','Shang-Chi, the master of unarmed weaponry-based Kung Fu, is forced to confront his past after being drawn into the Ten Rings organization.','','PG-13','02:12:00','Action','2021-09-03','Simu Liu,Awkwafina,Menger Zhang,Fala Chen,Florian Munteanu','https://www.movienewsnet.com/wp-content/uploads/2021/04/SimuLiuPoster.jpeg','coming soon',92,90,1,2),
('Black Widow','Natasha Romanoff, aka Black Widow, confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises. ','Cate Shortland','PG-13','02:15:00','Action','2021-08-23','Scarlett Johansson,Florence Pugh,Rachel Weisz,David Harbour,Ray Winstone','https://preview.redd.it/qp6yhfw4ruv41.png?auto=webp&s=dc9b7f1758382df9d91fc6346c4aa572d97095ac','showing',80,74,1,3),
('Dune','Feature adaptation of Frank Herberts science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.','','','02:05:00','Sci-Fi','2021-09-03','Rebecca Ferguson,David Dastmalchian,Jason Momoa,Zendaya,Timothée Chalamet','https://i.pinimg.com/originals/7e/4c/3a/7e4c3a7b6aa1fe5ae34d3247f054f517.jpg','coming soon',0,0,1,4),
('My Hero Academia: World Heroes Mission','When a cult of terrorists ruins a city by releasing a toxin that causes peoples abilities to spiral out of control, Japans greatest heroes spread around the world in an attempt to track down the mastermind and put him to justice.','Kenji Nagasaki','PG','01:44:00','Animation','2021-08-25','Tetsu Inada,Yuki Kaji,Kenta Miyake,Nobuhiko Okamoto,Ayane Sakura','https://img1.ak.crunchyroll.com/i/spire2/a3ee3e682ea0f44666a0a8effc3dc8c11616911388_main.jpg','showing',84,83,1,5),
('Space Jam: A New Legacy','A rogue artificial intelligence kidnaps the son of famed basketball player LeBron James, who then has to work with Bugs Bunny to win a basketball game.','Malcolm D. Lee','G','01:55:00','Animation','2021-07-16','LeBron James, Don Cheadle, Cedric Joe, Sue Bird, Damian Lillard','https://posterspy.com/wp-content/uploads/2020/06/03.jpg','showing',83,87,1,6),

('Spiderman: No Way Home','For the first time in the cinematic history of Spider-Man, our friendly neighborhood hero is unmasked and no longer able to separate his normal life from the high-stakes of being a Super Hero. ','Jon Watts','PG','02:00:00','Sci-Fi','2021-12-17','Zendaya,Tom Holland, enedict Cumberbatch','https://iphoneswallpapers.com/wp-content/uploads/2021/08/spiderman-no-way-home.jpg','coming soon',0,0,2,1),
('Shang-Chi and the Legend of the Ten Rings','Shang-Chi, the master of unarmed weaponry-based Kung Fu, is forced to confront his past after being drawn into the Ten Rings organization.','','PG-13','02:12:00','Action','2021-09-03','Simu Liu,Awkwafina,Menger Zhang,Fala Chen,Florian Munteanu','https://www.movienewsnet.com/wp-content/uploads/2021/04/SimuLiuPoster.jpeg','coming soon',92,90,2,2),
('Black Widow','Natasha Romanoff, aka Black Widow, confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises. ','Cate Shortland','PG-13','02:15:00','Action','2021-08-23','Scarlett Johansson,Florence Pugh,Rachel Weisz,David Harbour,Ray Winstone','https://preview.redd.it/qp6yhfw4ruv41.png?auto=webp&s=dc9b7f1758382df9d91fc6346c4aa572d97095ac','showing',80,74,2,3),
('Dune','Feature adaptation of Frank Herberts science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.','','','02:05:00','Sci-Fi','2021-09-03','Rebecca Ferguson,David Dastmalchian,Jason Momoa,Zendaya,Timothée Chalamet','https://i.pinimg.com/originals/7e/4c/3a/7e4c3a7b6aa1fe5ae34d3247f054f517.jpg','coming soon',0,0,2,4),
('My Hero Academia: World Heroes Mission','When a cult of terrorists ruins a city by releasing a toxin that causes peoples abilities to spiral out of control, Japans greatest heroes spread around the world in an attempt to track down the mastermind and put him to justice.','Kenji Nagasaki','PG','01:44:00','Animation','2021-08-25','Tetsu Inada,Yuki Kaji,Kenta Miyake,Nobuhiko Okamoto,Ayane Sakura','https://img1.ak.crunchyroll.com/i/spire2/a3ee3e682ea0f44666a0a8effc3dc8c11616911388_main.jpg','showing',84,83,2,5),
('Space Jam: A New Legacy','A rogue artificial intelligence kidnaps the son of famed basketball player LeBron James, who then has to work with Bugs Bunny to win a basketball game.','Malcolm D. Lee','G','01:55:00','Animation','2021-07-16','LeBron James, Don Cheadle, Cedric Joe, Sue Bird, Damian Lillard','https://posterspy.com/wp-content/uploads/2020/06/03.jpg','showing',83,87,2,6),

('Spiderman: No Way Home','For the first time in the cinematic history of Spider-Man, our friendly neighborhood hero is unmasked and no longer able to separate his normal life from the high-stakes of being a Super Hero. ','Jon Watts','PG','02:00:00','Sci-Fi','2021-12-17','Zendaya,Tom Holland, enedict Cumberbatch','https://iphoneswallpapers.com/wp-content/uploads/2021/08/spiderman-no-way-home.jpg','coming soon',0,0,3,1),
('Shang-Chi and the Legend of the Ten Rings','Shang-Chi, the master of unarmed weaponry-based Kung Fu, is forced to confront his past after being drawn into the Ten Rings organization.','','PG-13','02:12:00','Action','2021-09-03','Simu Liu,Awkwafina,Menger Zhang,Fala Chen,Florian Munteanu','https://www.movienewsnet.com/wp-content/uploads/2021/04/SimuLiuPoster.jpeg','coming soon',92,90,3,2),
('Black Widow','Natasha Romanoff, aka Black Widow, confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises. ','Cate Shortland','PG-13','02:15:00','Action','2021-08-23','Scarlett Johansson,Florence Pugh,Rachel Weisz,David Harbour,Ray Winstone','https://preview.redd.it/qp6yhfw4ruv41.png?auto=webp&s=dc9b7f1758382df9d91fc6346c4aa572d97095ac','showing',80,74,3,3),
('Dune','Feature adaptation of Frank Herberts science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.','','','02:05:00','Sci-Fi','2021-09-03','Rebecca Ferguson,David Dastmalchian,Jason Momoa,Zendaya,Timothée Chalamet','https://i.pinimg.com/originals/7e/4c/3a/7e4c3a7b6aa1fe5ae34d3247f054f517.jpg','coming soon',0,0,3,4),
('My Hero Academia: World Heroes Mission','When a cult of terrorists ruins a city by releasing a toxin that causes peoples abilities to spiral out of control, Japans greatest heroes spread around the world in an attempt to track down the mastermind and put him to justice.','Kenji Nagasaki','PG','01:44:00','Animation','2021-08-25','Tetsu Inada,Yuki Kaji,Kenta Miyake,Nobuhiko Okamoto,Ayane Sakura','https://img1.ak.crunchyroll.com/i/spire2/a3ee3e682ea0f44666a0a8effc3dc8c11616911388_main.jpg','showing',84,83,3,5),
('Space Jam: A New Legacy','A rogue artificial intelligence kidnaps the son of famed basketball player LeBron James, who then has to work with Bugs Bunny to win a basketball game.','Malcolm D. Lee','G','01:55:00','Animation','2021-07-16','LeBron James, Don Cheadle, Cedric Joe, Sue Bird, Damian Lillard','https://posterspy.com/wp-content/uploads/2020/06/03.jpg','showing',83,87,3,6),

('Spiderman: No Way Home','For the first time in the cinematic history of Spider-Man, our friendly neighborhood hero is unmasked and no longer able to separate his normal life from the high-stakes of being a Super Hero. ','Jon Watts','PG','02:00:00','Sci-Fi','2021-12-17','Zendaya,Tom Holland, enedict Cumberbatch','https://iphoneswallpapers.com/wp-content/uploads/2021/08/spiderman-no-way-home.jpg','coming soon',0,0,4,1),
('Shang-Chi and the Legend of the Ten Rings','Shang-Chi, the master of unarmed weaponry-based Kung Fu, is forced to confront his past after being drawn into the Ten Rings organization.','','PG-13','02:12:00','Action','2021-09-03','Simu Liu,Awkwafina,Menger Zhang,Fala Chen,Florian Munteanu','https://www.movienewsnet.com/wp-content/uploads/2021/04/SimuLiuPoster.jpeg','coming soon',92,90,4,2),
('Black Widow','Natasha Romanoff, aka Black Widow, confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises. ','Cate Shortland','PG-13','02:15:00','Action','2021-08-23','Scarlett Johansson,Florence Pugh,Rachel Weisz,David Harbour,Ray Winstone','https://preview.redd.it/qp6yhfw4ruv41.png?auto=webp&s=dc9b7f1758382df9d91fc6346c4aa572d97095ac','showing',80,74,4,3),
('Dune','Feature adaptation of Frank Herberts science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.','','','02:05:00','Sci-Fi','2021-09-03','Rebecca Ferguson,David Dastmalchian,Jason Momoa,Zendaya,Timothée Chalamet','https://i.pinimg.com/originals/7e/4c/3a/7e4c3a7b6aa1fe5ae34d3247f054f517.jpg','coming soon',0,0,4,4),
('My Hero Academia: World Heroes Mission','When a cult of terrorists ruins a city by releasing a toxin that causes peoples abilities to spiral out of control, Japans greatest heroes spread around the world in an attempt to track down the mastermind and put him to justice.','Kenji Nagasaki','PG','01:44:00','Animation','2021-08-25','Tetsu Inada,Yuki Kaji,Kenta Miyake,Nobuhiko Okamoto,Ayane Sakura','https://img1.ak.crunchyroll.com/i/spire2/a3ee3e682ea0f44666a0a8effc3dc8c11616911388_main.jpg','showing',84,83,4,5),
('Space Jam: A New Legacy','A rogue artificial intelligence kidnaps the son of famed basketball player LeBron James, who then has to work with Bugs Bunny to win a basketball game.','Malcolm D. Lee','G','01:55:00','Animation','2021-07-16','LeBron James, Don Cheadle, Cedric Joe, Sue Bird, Damian Lillard','https://posterspy.com/wp-content/uploads/2020/06/03.jpg','showing',83,87,4,6)
;

--SCREENING
INSERT INTO screening (available_seats, start_time, end_time, movie_date, movie_id, cinema_id)
VALUES

(18, '14:00:00', ' 16:55:00', '2021-08-27', 28, 1),
(27, '22:00:00', ' 19:15:00', '2021-08-27', 28, 1),
(27, '19:30:00', ' 21:45:00', '2021-08-27', 28, 1),

(27, '14:00:00', ' 16:55:00', '2021-08-29', 28, 1),
(27, '22:00:00', ' 19:15:00', '2021-08-29', 28, 1),
(27, '19:30:00', ' 21:45:00', '2021-08-29', 28, 1),

(27, '14:00:00', ' 16:55:00', '2021-08-30', 28, 1),
(27, '22:00:00', ' 19:15:00', '2021-08-30', 28, 1),
(27, '19:30:00', ' 21:45:00', '2021-08-30', 28, 1),

(27, '14:00:00', ' 16:55:00', '2021-08-31', 28, 1),
(27, '22:00:00', ' 19:15:00', '2021-08-31', 28, 1),
(27, '19:30:00', ' 21:45:00', '2021-08-31', 28, 1)
;

INSERT INTO screening (available_seats, start_time, end_time, movie_date, movie_id, cinema_id)
VALUES
(27, '14:45:00', ' 16:30:00', '2021-08-26', 30, 1),
(27, '18:30:00', ' 20:15:00', '2021-08-26', 30, 1),
(27, '22:15:00', ' 23:59:00', '2021-08-26', 30, 1),

(27, '14:45:00', ' 16:30:00', '2021-08-29', 30, 1),
(27, '18:30:00', ' 20:15:00', '2021-08-29', 30, 1),
(27, '22:15:00', ' 23:59:00', '2021-08-29', 30, 1),

(27, '14:45:00', ' 16:30:00', '2021-08-30', 30, 1),
(27, '18:30:00', ' 20:15:00', '2021-08-30', 30, 1),
(27, '22:15:00', ' 23:59:00', '2021-08-30', 30, 1)
;

INSERT INTO screening (available_seats, start_time, end_time, movie_date, movie_id, cinema_id)
VALUES
(27, '16:30:00', ' 18:45:00', '2021-08-27', 31, 1),
(27, '19:00:00', ' 21:15:00', '2021-08-27', 31, 1),
(27, '21:30:00', ' 23:45:00', '2021-08-27', 31, 1),

(27, '16:30:00', ' 18:45:00', '2021-08-31', 31, 1),
(27, '19:00:00', ' 21:15:00', '2021-08-31', 31, 1),
(27, '21:30:00', ' 23:45:00', '2021-08-31', 31, 1),

(27, '16:30:00', ' 18:45:00', '2021-08-31', 31, 1),
(27, '19:00:00', ' 21:15:00', '2021-08-31', 31, 1),
(27, '21:30:00', ' 23:45:00', '2021-08-31', 31, 1)
;


--SEAT
INSERT INTO seat(seat_num, is_available, screening_id)
VALUES
('1A', true, 10), ('1B', true, 10), ('1C', true, 10), ('1D', true, 10), ('1E', true, 10), ('1F', true, 10), ('1G', true, 10), ('1H', true, 10), ('1I', true, 10),
('2A', true, 10), ('2B', true, 10), ('2C', true, 10), ('2D', true, 10), ('2E', true, 10), ('2F', true, 10), ('2G', true, 10), ('2H', true, 10), ('2I', true, 10),
('3A', true, 10), ('3B', true, 10), ('3C', true, 10), ('3D', true, 10), ('3E', true, 10), ('3F', true, 10), ('3G', true, 10), ('3H', true, 10), ('3I', true, 10),
('4A', false, 10), ('4B', false, 10), ('4C', false, 10), ('4D', false, 10), ('4E', false, 10), ('4F', false, 10), ('4G', false, 10), ('4H', false, 10), ('4I', false, 10),

('1A', false, 11), ('1B', true, 11), ('1C', true, 11), ('1D', true, 11), ('1E', true, 11), ('1F', true, 11), ('1G', true, 11), ('1H', true, 11), ('1I', false, 11),
('2A', false, 11), ('2B', true, 11), ('2C', true, 11), ('2D', true, 11), ('2E', true, 11), ('2F', true, 11), ('2G', true, 11), ('2H', true, 11), ('2I', false, 11),
('3A', false, 11), ('3B', true, 11), ('3C', true, 11), ('3D', true, 11), ('3E', true, 11), ('3F', true, 11), ('3G', true, 11), ('3H', true, 11), ('3I', false, 11),
('4A', false, 11), ('4B', false, 11), ('4C', false, 11), ('4D', false, 11), ('4E', false, 11), ('4F', false, 11), ('4G', false, 11), ('4H', false, 11), ('4I', false, 11),

('1A', false, 12), ('1B', true, 12), ('1C', true, 12), ('1D', true, 12), ('1E', true, 12), ('1F', true, 12), ('1G', true, 12), ('1H', true, 12), ('1I', false, 12),
('2A', false, 12), ('2B', true, 12), ('2C', true, 12), ('2D', true, 12), ('2E', true, 12), ('2F', true, 12), ('2G', true, 12), ('2H', true, 12), ('2I', false, 12),
('3A', false, 12), ('3B', true, 12), ('3C', true, 12), ('3D', false, 12), ('3E', false, 12), ('3F', false, 12), ('3G', true, 12), ('3H', true, 12), ('3I', false, 12),
('4A', false, 12), ('4B', false, 12), ('4C', false, 12), ('4D', false, 12), ('4E', false, 12), ('4F', false, 12), ('4G', false, 12), ('4H', false, 12), ('4I', false, 12)
;