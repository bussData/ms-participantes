--compilar proyecto (en ms-evento y ms-participante)
mvn clean package
--correr cada ms:
mvn spring-boot:run

--restman extension de chrome:
https://chromewebstore.google.com/detail/restman/ihgpcfpkpmdcghlnaofdmjkoemnlijdi

--RESTS:
GET Consultar por evento:
http://localhost:9081/api2/eventos/1


GET Inscripciones por participante: http://localhost:9091/api2/inscripciones/3

POST Inscripciones:
http://localhost:9091/api2/inscripciones
Json Body:
{
    "idParticipante":3,
    "idEvento":2
}
Header:
Content-Type: application/json


--CREAR BD:
create database inscripciones_db; 
 
---USER
create user inscrip_admin identified by 'admin';  
grant all privileges on inscripciones_db to inscrip_admin;
GRANT PROCESS ON *.* TO inscrip_admin;
 
--CREAR TABLAS:
drop table eventos;
create table eventos (id bigint not null auto_increment,
 descripcion varchar(255), 
fecha_evento datetime(6), ubicacion varchar(255),  capacidad integer not null, primary key (id));


drop table participante;
create table participante (id bigint not null auto_increment, apellidos varchar(255) not null, nombre varchar(255) not null, primary key (id));



drop table inscripcion;

create table inscripcion (id bigint not null auto_increment primary key, id_evento bigint not null, id_participante bigint not null,
 UNIQUE KEY uk_inscripcion_participante_evento (id_participante, id_evento));



--PERMISOS EN TABLAS AL USER: 
grant select, insert,delete on eventos to inscrip_admin ;

grant select, insert,delete on participante to inscrip_admin ;
grant select, insert,delete on inscripcion to inscrip_admin ;



--INSERT TABLA PRECARGADO:
select * from eventos;
insert into eventos (descripcion ,fecha_evento , ubicacion , capacidad) values ("capacitacion de AWS",STR_TO_DATE('05/30/2025', '%m/%d/%Y'), "Local Sistemas Uni", 2);
insert into eventos (descripcion ,fecha_evento , ubicacion , capacidad) values ("capacitacion de DevOps",STR_TO_DATE('06/15/2025', '%m/%d/%Y'), "Local Sistemas Uni", 2);


insert into eventos (descripcion ,fecha_evento , ubicacion , capacidad) values ("capacitacion de TOGAF",STR_TO_DATE('06/05/2025', '%m/%d/%Y'), "Local Sistemas Uni", 2);

commit;


select * from participante;


insert into participante (apellidos, nombre) values ("BENZA", "PAOLO");


insert into participante (apellidos, nombre) values ("QUISPE", "CARLOS");

insert into participante (apellidos, nombre) values ("RIVERA", "JULIO");

insert into participante (apellidos, nombre) values ( "GUEVARA", "MARCO");
commit;