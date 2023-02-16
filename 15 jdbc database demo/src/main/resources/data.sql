/*
create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);
*/
insert into person (ID,NAME,LOCATION,BIRTH_DATE) VALUES(10001,'Gus','FR',CURRENT_TIMESTAMP);
insert into person (ID,NAME,LOCATION,BIRTH_DATE) VALUES(10002,'Walter','IT',CURRENT_TIMESTAMP);
insert into person (ID,NAME,LOCATION,BIRTH_DATE) VALUES(10003,'Jesse','JP',CURRENT_TIMESTAMP);