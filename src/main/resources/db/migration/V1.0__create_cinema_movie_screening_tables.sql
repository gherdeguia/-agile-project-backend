CREATE TABLE if NOT EXISTS Movie(
  id              int not null  auto_increment primary key,
  name            varchar(255) not null,
  synopsis        varchar(255) not null,
  directedBy      varchar(255) not null,
  rated           varchar(255) not null,
  runningTime     datetime,
  genre           varchar(255) not null,
  releaseDate     date,
  castAndCrews    varchar(255) not null,
  poster          varchar(255) not null
);

CREATE TABLE if NOT EXISTS Screening(
  id              int not null  auto_increment primary key,
  availableSeats  varchar(255) not null,
  startTime       datetime,
  endTime         datetime,
  movieDate       date,
  movieId         int,
  FOREIGN KEY (movieId) REFERENCES Movie(id)
);

CREATE TABLE if NOT EXISTS Cinema(
  id              int not null  auto_increment primary key,
  name            varchar(255) not null,
  screeningId     int,
  movieId         int,
  FOREIGN KEY (movieId) REFERENCES Movie(id),
  FOREIGN KEY (screeningId) REFERENCES Screening(id)
);