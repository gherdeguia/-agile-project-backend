CREATE TABLE if NOT EXISTS Payment(
  id              int not null  auto_increment primary key,
  full_name      varchar(255) not null,
  email         varchar(255) not null,
  contact_detail    int,
  card_detail int,
  card_holder_name varchar(255),
  card_expiration int,
  card_code int,
  movie_Name varchar(255),
  cinema_Name varchar(255),
  screening_date     date,
  screening_time     time,
  selected_seats varchar(255),
  total_price double
);