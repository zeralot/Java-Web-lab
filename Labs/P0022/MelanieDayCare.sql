USE master
GO
IF EXISTS(select * from sys.databases where name='MELANIE_DAY_CARE')
DROP DATABASE MELANIE_DAY_CARE
GO
CREATE DATABASE MELANIE_DAY_CARE
GO 


USE MELANIE_DAY_CARE
GO
CREATE TABLE IntroImage (
	ImageUrl [nvarchar](100) NOT NULL,
	Caption [nvarchar](50)
)
CREATE TABLE Intros (
	Type [nvarchar](20) NOT NULL,
	Title [nvarchar](30) NOT NULL,
	Content [nvarchar](MAX) NOT NULL,
	ImageUrl [nvarchar](100)
)

CREATE TABLE Info (
	Address [nvarchar](100),
	Tel [varchar](15) CHECK (Tel not like '%[^0-9]%'),
	Email [varchar](30)
)

CREATE TABLE Photos (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	Name [nvarchar](20),
	SmallImageUrl [nvarchar](100),
	ImageUrl [nvarchar](100) NOT NULL,
	Description [nvarchar](100)
)

CREATE TABLE Messages (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	Name [nvarchar](30) NOT NULL,
	Email [varchar](30),
	Message [nvarchar](MAX)
)

INSERT [dbo].[IntroImage] ([ImageUrl], [Caption]) VALUES ('images/i281756464666921188._szw1280h1280_.jpg', 'Lorem ipsum dolor sit amet.')

INSERT [dbo].[Intros] ([Type], [Title], [Content]) VALUES ('ShortAbout', 'About me', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim .')
INSERT [dbo].[Intros] ([Type], [Title], [Content]) VALUES ('ShortContact', 'Contact', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim .')
INSERT [dbo].[Intros] ([Type], [Title], [Content], [ImageUrl]) VALUES ('About', 'About me', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.
	<br/>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.', 'images/i281756464666921266._szw480h1280_.jpg')

INSERT [dbo].[Info] ([Address], [Tel], [Email]) VALUES ('<br/>City: <br/>Country: ', '123456', 'your-email@your-email.com')

INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242466._rsw360h270_szw360h270_.jpg', 'images/i281756464682242466._szw1280h1280_.jpg')
INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242456._rsw360h270_szw360h270_.jpg', 'images/i281756464682242456._szw1280h1280_.jpg')
INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242458._rsw360h270_szw360h270_.jpg', 'images/i281756464682242458._szw1280h1280_.jpg')
INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242461._rsw360h270_szw360h270_.jpg', 'images/i281756464682242461._szw1280h1280_.jpg')
INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242464._rsw360h270_szw360h270_.jpg', 'images/i281756464682242464._szw1280h1280_.jpg')
INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242467._rsw360h270_szw360h270_.jpg', 'images/i281756464682242467._szw1280h1280_.jpg')
INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242469._rsw360h270_szw360h270_.jpg', 'images/i281756464682242469._szw1280h1280_.jpg')
INSERT [dbo].[Photos] ([SmallImageUrl], [ImageUrl]) VALUES ('images/i281756464682242470._rsw360h270_szw360h270_.jpg', 'images/i281756464682242470._szw1280h1280_.jpg')

/*
CREATE TABLE Products (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	Name [nvarchar](50) NOT NULL, 
	Description [nvarchar](MAX) NOT NULL,
	ImageUrl [nvarchar](100) NOT NULL, 
	Price [money] NOT NULL,
	DeliveryTime [varchar](20) DEFAULT '1-2 business days'
)

CREATE TABLE Blogs (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	Title [nvarchar](30) NOT NULL,
	Content [nvarchar](MAX),
	ImageUrl [nvarchar](100),
	CreatedDate [date] DEFAULT(GETDATE()), 
	Likes [int] DEFAULT(0),
	Comments [int] DEFAULT(0)
)

CREATE TABLE Invoices (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	CreatedDate [datetime] DEFAULT(GETDATE()),
	Comment [nvarchar](MAX)
)

CREATE TABLE Packages (
	InvoiceID [int] FOREIGN KEY REFERENCES Invoices (ID),
	ProductId [int] FOREIGN KEY REFERENCES Products (ID),
	Quantity [int] DEFAULT 1
)

CREATE TABLE Shippings (
	ID [int] FOREIGN KEY REFERENCES Invoices (ID) PRIMARY KEY,
	Name [nvarchar](50) NOT NULL,
	Company [nvarchar](100),
	Address1 [nvarchar](200) NOT NULL,
	Address2 [nvarchar](200),
	Zip [int] NOT NULL,
	City [nvarchar](30) NOT NULL,
	State [nvarchar](30) NOT NULL,
	Phone [varchar](20),
	Email [varchar](50) NOT NULL
)

CREATE TABLE Billings (
	ID [int] FOREIGN KEY REFERENCES Invoices (ID) PRIMARY KEY,
	Name [nvarchar](50) NOT NULL,
	Company [nvarchar](100),
	Address1 [nvarchar](200) NOT NULL,
	Address2 [nvarchar](200),
	Zip [int] NOT NULL,
	City [nvarchar](30) NOT NULL,
	State [nvarchar](30) NOT NULL
)

CREATE TABLE Intros (
	Type [nvarchar](10) NOT NULL,
	Title [nvarchar](30) NOT NULL,
	Content [nvarchar](MAX) NOT NULL,
	ImageUrl [nvarchar](100)
)

CREATE TABLE Info (
	Address [nvarchar](100),
	Tel [varchar](15) CHECK (Tel not like '%[^0-9]%'),
	Email [varchar](30),
	OpenningHours [nvarchar](200),
)

CREATE TABLE Cities (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	Name [nvarchar](50) NOT NULL,
	ShortName [nvarchar](5)	
)

INSERT [dbo].[Products] ([Name], [Description], [ImageUrl], [Price]) VALUES ('Homemade Jam', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i281756464687106784._rsw480h480_szw480h480_.jpg', 5)
INSERT [dbo].[Products] ([Name], [Description], [ImageUrl], [Price]) VALUES ('Berries', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i281756464687107103._rsw480h480_szw480h480_.jpg', 3)
INSERT [dbo].[Products] ([Name], [Description], [ImageUrl], [Price]) VALUES ('Fresh Eggs Daily', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i281756464687107233._rsw480h480_szw480h480_.jpg', 10)
INSERT [dbo].[Products] ([Name], [Description], [ImageUrl], [Price]) VALUES ('Potatoes', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i281756464687107384._rsw480h480_szw480h480_.jpg', 3)
INSERT [dbo].[Products] ([Name], [Description], [ImageUrl], [Price]) VALUES ('Blossom Honey', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i281756464687107465._rsw480h480_szw480h480_.jpg', 8)

INSERT [dbo].[Blogs] ([Title], [Content], [ImageUrl]) VALUES ('Lorem ipsum dolor', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. ', 'images/i281756464684715224._szw480h1280_.jpg')
INSERT [dbo].[Blogs] ([Title], [Content], [ImageUrl]) VALUES ('Lorem ipsum dolor', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. ', 'images/i281756464684715223._szw480h1280_.jpg')
INSERT [dbo].[Blogs] ([Title], [Content], [ImageUrl]) VALUES ('Photo', '', 'images/i281756464684715221._szw1280h1280_.jpg')

INSERT [dbo].[Intros] ([Type], [Title], [Content], [ImageUrl]) VALUES ('Intro', 'Online store', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.', '')

INSERT [dbo].[Info] ([Address], [Tel], [Email], [OpenningHours]) VALUES ('<p>City: </p><p>Country: </p>', '12345', 'your-email@your-email.com', '<p>Tuesday - Saturday: 10 am - 6 pm</p><p>Wednesdays open until 7pm</p><p></p><p>Our Farm Store is closed Sundays and Mondays.</p>')

INSERT [dbo].[Cities] ([Name], [ShortName]) VALUES ('Ha Noi', 'HN')
INSERT [dbo].[Cities] ([Name], [ShortName]) VALUES ('Ho Chi Minh', 'HCM')
INSERT [dbo].[Cities] ([Name], [ShortName]) VALUES ('Da Nang', 'DN')
INSERT [dbo].[Cities] ([Name], [ShortName]) VALUES ('An Giang', 'AG')
INSERT [dbo].[Cities] ([Name], [ShortName]) VALUES ('Bac Giang', 'BG')
INSERT [dbo].[Cities] ([Name], [ShortName]) VALUES ('Bac Kan', 'BK')
INSERT [dbo].[Cities] ([Name], [ShortName]) VALUES ('Bac Lieu', 'BL')
*/
/*
CREATE TABLE Invoices (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	CreatedDate [datetime] DEFAULT(GETDATE())
)

CREATE TABLE Packages (
	ID [int] FOREIGN KEY REFERENCES Invoices (ID) PRIMARY KEY,
	ProductId [int] NOT NULL,
	Quantity [int] DEFAULT 1
)

CREATE TABLE Shippings (
	ID [int] FOREIGN KEY REFERENCES Invoices (ID) PRIMARY KEY,
	Name [nvarchar](50) NOT NULL,
	Company [nvarchar](100),
	Address1 [nvarchar](200) NOT NULL,
	Address2 [nvarchar](200),
	Zip [int] NOT NULL,
	City [nvarchar](30) NOT NULL,
	State [nvarchar](30) NOT NULL,
	Phone [varchar](20),
	Email [varchar](50) NOT NULL
)

CREATE TABLE Billings (
	ID [int] FOREIGN KEY REFERENCES Invoices (ID) PRIMARY KEY,
	Name [nvarchar](50) NOT NULL,
	Company [nvarchar](100),
	Address1 [nvarchar](200) NOT NULL,
	Address2 [nvarchar](200),
	Zip [int] NOT NULL,
	City [nvarchar](30) NOT NULL,
	State [nvarchar](30) NOT NULL
)

CREATE TABLE Feedbacks (
	ID [int] IDENTITY(1,1) PRIMARY KEY,
	Name [nvarchar](50),
	Email [varchar](50),
	Message [nvarchar](MAX) NOT NULL
)

INSERT [dbo].[Products] ([Name], [ShortDescription], [Description], [ImageUrl], [Price]) VALUES ('Television', 'Lorem ipsum dolor sit amet.', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i285978589337227269._rsw480h360_szw480h360_.jpg', 260)
INSERT [dbo].[Products] ([Name], [ShortDescription], [Description], [ImageUrl], [Price]) VALUES ('GPS', 'Lorem ipsum dolor sit amet.', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i285978589337227261._rsw480h360_szw480h360_.jpg', 180)
INSERT [dbo].[Products] ([Name], [ShortDescription], [Description], [ImageUrl], [Price]) VALUES ('Headphones', 'Lorem ipsum dolor sit amet.', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i285978589337227255._rsw480h360_szw480h360_.jpg', 60)
INSERT [dbo].[Products] ([Name], [ShortDescription], [Description], [ImageUrl], [Price]) VALUES ('Notebook', 'Lorem ipsum dolor sit amet.', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i285978589337227273._rsw480h360_szw480h360_.jpg', 325)
INSERT [dbo].[Products] ([Name], [ShortDescription], [Description], [ImageUrl], [Price]) VALUES ('Smartphone charger', 'Lorem ipsum dolor sit amet.', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i285978589337227280._rsw480h360_szw480h360_.jpg', 25)
INSERT [dbo].[Products] ([Name], [ShortDescription], [Description], [ImageUrl], [Price]) VALUES ('Router', 'Lorem ipsum dolor sit amet.', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod.', 'images/i285978589337227283._rsw480h360_szw480h360_.jpg', 25.54)


INSERT [dbo].[Invoices] ([CreatedDate]) VALUES (GETDATE())
INSERT [dbo].[Packages] ([ID], [ProductId], [Quantity]) VALUES (1, 1, 2)
INSERT [dbo].[Shippings] ([ID], [Name], [Company], [Address1], [Address2], [Zip], [City], [State], [Phone], [Email]) VALUES (1, 'Xuan Chuc', 'FPT', 'Ha Dong', '', 10000, 'Ha Noi', 'Ha Noi', '0987654321', 'chuc@gmail.com')
INSERT [dbo].[Billings] ([ID], [Name], [Company], [Address1], [Address2], [Zip], [City], [State]) VALUES (1, 'Xuan Chuc', 'FPT', 'Ha Dong', '', 10000, 'Ha Noi', 'Ha Noi')

INSERT [dbo].[Feedbacks] ([Name], [Email], [Message]) VALUES ('Xuan Chuc', 'chuc@gmail.com', 'good products')
*/