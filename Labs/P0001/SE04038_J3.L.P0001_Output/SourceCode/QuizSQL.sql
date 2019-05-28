create database J3.L.P0001

create table Users(
	userID int IDENTITY(1,1) NOT NULL primary key,
	userName nvarchar(25) NOT NULL unique,
	password nvarchar(25) NOT NULL,
	userType int NOT NULL,
	email nvarchar(50) NULL,	
)

INSERT [dbo].[Users] ([userName], [password], [userType], [email]) VALUES (N't1', N'123', 1, NULL)
INSERT [dbo].[Users] ([userName], [password], [userType], [email]) VALUES (N'n1', N'123', 2, N'abc@fpt.edu.vn')
INSERT [dbo].[Users] ([userName], [password], [userType], [email]) VALUES (N'asd', N'123', 1, N'xxx@xxx.com')

create table Quiz(
	quizID int IDENTITY(1,1) NOT NULL primary key,
	userID int foreign key references Users(userID),
	question [nvarchar](300) NOT NULL,
	answer1 nvarchar(100) NOT NULL,
	answer2 nvarchar(100) NOT NULL,
	answer3 nvarchar(100) NOT NULL,
	answer4 nvarchar(100) NOT NULL,
	answerRight nvarchar(100) NOT NULL,
	dateCreated date default getdate(),
)

insert into Quiz(question, userID, answer1, answer2, answer3, answer4, answerRight)
values('xxx', '1', '1', '2', '3', '3', '1 | 3');

insert into Quiz(question, userID, answer1, answer2, answer3, answer4, answerRight)
values('X1', '1', '1x', '2x', '3x', '4x', '2 | 3');

insert into Quiz(question, userID, answer1, answer2, answer3, answer4, answerRight)
values('X2', '1', '1a', '2a', '3a', '4a', '2');

create table Result(
	resultID [int] IDENTITY(1,1) NOT NULL,
	userID int foreign key references Users(userID),
	dateCompleted date default getdate(),
	quizNumber int,
	score float,
)

select * from users
select * from quiz
select * from Result
select quizID, question, dateCreated
from Quiz join Users on quiz.userID = users.userID
where Users.userID = '1'

select COUNT(quizID) from quiz
