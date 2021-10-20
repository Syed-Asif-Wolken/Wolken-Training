create schema butterflies;
create table butterflies.butterfly_details (id int primary key not null, family varchar(50), subfamily varchar(50), wingspan int, wingcolor varchar(50), age int, region varchar(50));
insert into butterflies.butterfly_details value(1,"Nymphalidae","brush-footed butterflies","7.3","Broad Orange and Black",3,"Southern Canada");
select * from butterfly_details;