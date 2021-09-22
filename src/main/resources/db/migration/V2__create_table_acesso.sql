create table acesso(
 id integer primary key auto_increment,
 nome varchar(250) not null,
 apelido varchar(250) not null,
 email varchar(250) not null,
 nivel_id integer not null,
 senha varchar (250) not null
);

alter table acesso
   add constraint fk_acesso_perfil
   foreign key (nivel_id)
   references perfil;