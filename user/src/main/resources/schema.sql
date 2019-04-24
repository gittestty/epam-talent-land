
create table ROL
(
   id integer not null,
   rol varchar(155) not null,
   primary key(id)
);

create table USER
(
   id varchar(155) not null,
   completeName varchar(255) not null,
   idRol number(255) not null,
   isActive TINYINT not null,
   primary key(id),
   password varchar(255) not null,
   FOREIGN KEY (idRol) REFERENCES ROL(id)
);

