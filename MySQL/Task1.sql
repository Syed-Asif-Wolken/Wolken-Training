create schema Task;
create table Task.details (id int primary key not null, d_name varchar(45));
select * from details;
insert into details values (1, "person1"),(2, "person2"),(3, "person3"),(4, "person4"),(5, "person5");
update details set d_name="person13" where id=3;
update details set d_name="person3" where id=3;

create table Task.details_new (id int, species varchar(45), f_id int, foreign key (f_id) references details(id));
insert into details_new values (1, "Human",3),(2,"Human",2),(3,"Animal",5),(4,"Human",1),(5,"Human",4);
select * from details_new;

select * from details_new full join details on f_id = details.id;
delete from details_new where id = 1;
delete from details where id = 1;