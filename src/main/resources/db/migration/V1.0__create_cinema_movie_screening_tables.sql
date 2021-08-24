CREATE TABLE if NOT EXISTS Movie(
  id              int not null  auto_increment primary key,
  name            varchar(255) not null,
  synopsis        varchar(255) not null,
  directed_by      varchar(255) not null,
  rated           varchar(255) not null,
  running_time     datetime,
  genre           varchar(255) not null,
  release_date     date,
  cast_and_crews  varchar(255) not null,
  poster          varchar(255) not null
);

CREATE TABLE if NOT EXISTS Screening(
  id              int not null  auto_increment primary key,
  available_seats  varchar(255) not null,
  start_time       datetime,
  end_time         datetime,
  movie_date       date,
  movie_id         int,
  FOREIGN KEY (movie_id) REFERENCES Movie(id)
);

CREATE TABLE if NOT EXISTS Cinema(
  id              int not null  auto_increment primary key,
  name            varchar(255) not null,
  screening_id     int,
  movie_id         int,
  FOREIGN KEY (movie_id) REFERENCES Movie(id),
  FOREIGN KEY (screening_id) REFERENCES Screening(id)
);