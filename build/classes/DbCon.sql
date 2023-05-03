create table Login_Details(User_name varchar(25) references account_details(user_name),PassWord varchar(20));
create table account_details(acc_holder_name varchar(25),age integer,date_of_birth varchar(15),gender varchar(15),e_mail varchar(30),qualification varchar(20),mobile_number varchar(10),user_name varchar(25),primary key(user_name));
create table account_transaction(user_name varchar(25) references account_details(user_name),Balance int);

select * from Login_Details;
select * from account_Details;
select * from account_transaction;

insert into Login_Details values('Admin','1234567890@');
insert into Login_Details values('miichan','admin');

insert into Login_Details values('Elonism','elon123');
insert into account_details values('venkatesh',19,'24/10/2001','male','venkateshprabhu2210@gmail.com','Graduate','9025193037','miichan');
insert into account_transaction values('miichan',0);
drop table account_details;
drop table login_details;
