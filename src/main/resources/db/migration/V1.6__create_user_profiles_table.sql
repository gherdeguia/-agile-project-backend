CREATE TABLE if NOT EXISTS Users(
  id                        int not null  auto_increment primary key,
  user_name                 varchar(255) not null,
  first_name                varchar(255) not null,
  last_name                 varchar(255) not null,
  phone_number              varchar(255) not null,
  email_address             varchar(255) not null
);


INSERT INTO Users(id,user_name,first_name,last_name,phone_number,email_address)
VALUES
(1, 'JonDoe','Jon','Doe','+63-904-471-1975','jondoe@email.com'),
(2, 'JaneDoe','Jane','Doe','+63-978-748-3675','janedoe@email.com');

UPDATE Movie SET cinema_id=1 WHERE id=5;
UPDATE Movie SET cinema_id=2 WHERE id=6;
UPDATE Movie SET cinema_id=1 WHERE id=7;
UPDATE Movie SET cinema_id=2 WHERE id=8;


