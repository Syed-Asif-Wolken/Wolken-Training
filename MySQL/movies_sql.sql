create schema movies;
create table movie_member(id int primary key not null, first_name varchar(25), last_name varchar(25), age int, movie_id int ,foreign key (movie_id) references movie_details(id));
insert into movie_member values(1,"Adam","Smith",20,1),(2,"Ravi","Kumar",19,2),	(3,"Susan","Davidson",17,5),	(4,"Jenny","Adrianna",21,8),	(6,"Lee","Pong",18,4),	(7,"Rakesh","Kanna",25,3),	(8,"Pravin","Rathod",22,5),	(9,"Vishal","Hatti",25,6),	(10,"Rohan","Patil",23,1);

select * from movie_member left join movie_details on movie_member.movie_id = movie_details.id;
select * from movie_member left join movie_details on movie_member.movie_id = movie_details.id where movie_details.title="3 Idiots";
select * from movie_member inner join movie_details on movie_member.movie_id = movie_details.id;
select * from movie_member right join movie_details on movie_member.movie_id = movie_details.id;

SELECT *
FROM movie_member AS t1
LEFT JOIN movie_details AS t2 ON t1.movie_id

UNION

SELECT *
FROM movie_member AS t1
RIGHT JOIN movie_details AS t2 ON t1.movie_id;

select distinct * from (select * from movie_member full join movie_details on movie_member.movie_id = movie_details.id)as a;




