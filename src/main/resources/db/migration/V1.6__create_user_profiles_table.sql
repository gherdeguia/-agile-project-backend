CREATE TABLE if NOT EXISTS UserProfile(
  id                        int not null  auto_increment primary key,
  first_name                varchar(255) not null,
  last_name                 varchar(255) not null,
  phone_number              varchar(255) not null,
  email_address             varchar(255) not null
);


UPDATE Movie SET cinema_id=1 WHERE id=5;
UPDATE Movie SET cinema_id=2 WHERE id=6;
UPDATE Movie SET cinema_id=1 WHERE id=7;
UPDATE Movie SET cinema_id=2 WHERE id=8;