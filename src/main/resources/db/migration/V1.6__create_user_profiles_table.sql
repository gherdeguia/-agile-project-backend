CREATE TABLE if NOT EXISTS Users(
  id                        int not null  auto_increment primary key,
  email_address             varchar(255) not null,
  full_name                 varchar(255) not null,
  password                  varchar(255) not null,
  phone_number              varchar(255) not null
);


INSERT INTO Users(id,email_address,full_name,password,phone_number)
VALUES
(1, 'jondoe@email.com', 'Jon Doe','password1','+63-904-471-1975'),
(2, 'janedoe@email.com', 'Jane Doe','password1','+63-995-356-7951');

UPDATE Movie SET cinema_id=1 WHERE id=5;
UPDATE Movie SET cinema_id=2 WHERE id=6;
UPDATE Movie SET cinema_id=1 WHERE id=7;
UPDATE Movie SET cinema_id=2 WHERE id=8;

