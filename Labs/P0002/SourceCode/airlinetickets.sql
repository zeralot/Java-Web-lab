create database AirlineTickets
drop database AirlineTickets
create table Customer(
	cid int primary key identity(1,1),
	email nvarchar(30),
	pass nvarchar(15),
	firstname nvarchar(15),
	lastname nvarchar(15),
	addr nvarchar(50),
	phonenumber nvarchar(11),
	sex bit,
	age int,
	cardnumber nvarchar(15),
)

select * from Customer where email='thuy@123' and pass='123456'
select * from Customer

insert into Customer(email, pass,firstname, lastname, addr,phonenumber, sex, age,cardnumber) 
values('lala@123','123456','thuy','pham','vietnam','123456',1,18,'12345')

create table Flight(
	fid int primary key identity(1,1),
	placefrom nvarchar(15),
    placeto nvarchar(15),
    depart nvarchar(15),
    departtime nvarchar (15),
    arrivetime nvarchar(15),
    detail nvarchar(15),
    cost money,
)
insert into Flight(placefrom,placeto,depart,departtime,arrivetime,detail,cost) values('Ha Noi','Da Nang','2016-12-09','5:00 PM','7:00PM','2h00',125)
insert into Flight(placefrom,placeto,depart,departtime,arrivetime,detail,cost) values('Ha Noi','Da Nang','2016-12-09','6:00 PM','8:00PM','2h00',125)
insert into Flight(placefrom,placeto,depart,departtime,arrivetime,detail,cost) values('Da Nang','Ha Noi','2016-12-11','5:00 PM','7:00PM','2h00',125)
insert into Flight(placefrom,placeto,depart,departtime,arrivetime,detail,cost) values('Ha Noi','Da Nang','2016-12-09','5:00 PM','7:00PM','2h00',125)

select * from Flight where placefrom
select * from Flight where (placefrom='Ha Noi' and placeto='Da Nang' and depart='2016-12-09') or (placefrom='Da Nang' and placeto='Ha Noi' and depart='2016-12-11')
select * from Flight
select * from Booking 
create table Booking(
	bid int primary key identity(1,1),
	cid int foreign key references Customer(cid),
	fid int foreign key references Flight(fid),
	bookingdate date default(getdate()),
)
select * from Customer
select * from Booking join Flight on Booking.fid=Flight.fid join Customer on Booking.cid=Customer.cid
insert into Booking(cid,fid) values(1,2)

select * from Booking join Flight on Booking.fid=Flight.fid join Customer on Booking.cid=Customer.cid where Customer.cid=1

select * from Booking
select TOP 1 bid, cid, fid, bookingdate from Booking order by bid desc 

select TOP 1 bid, Booking.cid, Flight.fid, bookingdate, Booking.fid, placefrom, placeto, depart, departtime, arrivetime, detail, cost, Customer.cid, email, pass, firstname, lastname, addr, phonenumber, sex, age, cardnumber from Booking join Flight on Booking.fid=Flight.fid join Customer on Booking.cid=Customer.cid where Customer.cid=1 order by bid desc
select * from Booking join Flight on Booking.fid=Flight.fid join Customer on Booking.cid=Customer.cid where Customer.cid=1 order by bid desc
