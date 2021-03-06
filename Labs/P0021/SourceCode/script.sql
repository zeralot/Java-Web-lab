USE [master]
GO
/****** Object:  Database [WeddingDress]    Script Date: 09/16/2016 15:54:04 ******/
CREATE DATABASE [WeddingDress] ON  PRIMARY 
( NAME = N'WeddingDress', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\WeddingDress.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'WeddingDress_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\WeddingDress_log.LDF' , SIZE = 512KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [WeddingDress] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [WeddingDress].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [WeddingDress] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [WeddingDress] SET ANSI_NULLS OFF
GO
ALTER DATABASE [WeddingDress] SET ANSI_PADDING OFF
GO
ALTER DATABASE [WeddingDress] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [WeddingDress] SET ARITHABORT OFF
GO
ALTER DATABASE [WeddingDress] SET AUTO_CLOSE ON
GO
ALTER DATABASE [WeddingDress] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [WeddingDress] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [WeddingDress] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [WeddingDress] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [WeddingDress] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [WeddingDress] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [WeddingDress] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [WeddingDress] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [WeddingDress] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [WeddingDress] SET  ENABLE_BROKER
GO
ALTER DATABASE [WeddingDress] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [WeddingDress] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [WeddingDress] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [WeddingDress] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [WeddingDress] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [WeddingDress] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [WeddingDress] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [WeddingDress] SET  READ_WRITE
GO
ALTER DATABASE [WeddingDress] SET RECOVERY SIMPLE
GO
ALTER DATABASE [WeddingDress] SET  MULTI_USER
GO
ALTER DATABASE [WeddingDress] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [WeddingDress] SET DB_CHAINING OFF
GO
USE [WeddingDress]
GO
/****** Object:  Table [dbo].[WishList]    Script Date: 09/16/2016 15:54:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[WishList](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[content] [nvarchar](80) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[WishList] ON
INSERT [dbo].[WishList] ([id], [content]) VALUES (1, N'Xe oto Lamborghini Aventador')
INSERT [dbo].[WishList] ([id], [content]) VALUES (2, N'A house in front of Vinpearl Land')
SET IDENTITY_INSERT [dbo].[WishList] OFF
/****** Object:  Table [dbo].[TrackVisit]    Script Date: 09/16/2016 15:54:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TrackVisit](
	[countView] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[countView] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[TrackVisit] ([countView]) VALUES (0)
/****** Object:  Table [dbo].[TrackViewer]    Script Date: 09/16/2016 15:54:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TrackViewer](
	[countViewer] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[countViewer] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[TrackViewer] ([countViewer]) VALUES (6)
/****** Object:  Table [dbo].[PhotoPage]    Script Date: 09/16/2016 15:54:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhotoPage](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[imgSrc] [nvarchar](300) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[PhotoPage] ON
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (9, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602133._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (10, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602124._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (11, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602132._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (12, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602127._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (13, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602136._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (14, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602131._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (15, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602093._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[PhotoPage] ([id], [imgSrc]) VALUES (16, N'./Prototype/Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602125._rsw360h270_szw360h270_.jpg')
SET IDENTITY_INSERT [dbo].[PhotoPage] OFF
/****** Object:  Table [dbo].[PartyAddress]    Script Date: 09/16/2016 15:54:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PartyAddress](
	[addressValue] [nvarchar](200) NULL,
	[email] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[PartyAddress] ([addressValue], [email]) VALUES (N'Khach san Ngan Sao - 141 Tran Duy Hung - Ha noi', N'party@gmail.com')
/****** Object:  Table [dbo].[HienThi]    Script Date: 09/16/2016 15:54:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HienThi](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](80) NULL,
	[content] [nvarchar](500) NULL,
	[imgsrc] [nvarchar](200) NULL,
	[DateAdded] [date] NULL,
	[typeOf] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[HienThi] ON
INSERT [dbo].[HienThi] ([id], [title], [content], [imgsrc], [DateAdded], [typeOf]) VALUES (1, N'Photo', N'', N'./Prototype/Wedding Blog - www.simplesite.com_us-123wedding_files/i282319414620601978._szw1280h1280_.jpg', CAST(0xD73B0B00 AS Date), 1)
INSERT [dbo].[HienThi] ([id], [title], [content], [imgsrc], [DateAdded], [typeOf]) VALUES (3, N'Quote', N'<p>Dont go far off, not even for a day', N'', CAST(0xD73B0B00 AS Date), 2)
INSERT [dbo].[HienThi] ([id], [title], [content], [imgsrc], [DateAdded], [typeOf]) VALUES (4, N'In a rainy day', N'I would miss you a lot', N'./Prototype/Wedding Blog - www.simplesite.com_us-123wedding_files/i282319414620602005._szw480h1280_.jpg', CAST(0xD73B0B00 AS Date), 3)
INSERT [dbo].[HienThi] ([id], [title], [content], [imgsrc], [DateAdded], [typeOf]) VALUES (5, N'Quote', N'<p>"If I had a flower for every time I thought of you ...I could walk through my garden forever."</p>
                                                        <small><cite title="Alfred Tennyson">Alfred Tennyson</cite></small>', N'', CAST(0xD73B0B00 AS Date), 2)
SET IDENTITY_INSERT [dbo].[HienThi] OFF
/****** Object:  Table [dbo].[Guestbook]    Script Date: 09/16/2016 15:54:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Guestbook](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](100) NULL,
	[email] [nvarchar](100) NULL,
	[website] [nvarchar](100) NULL,
	[imgLink] [nvarchar](200) NULL,
	[dateAdded] [date] NULL,
	[content] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Guestbook] ON
INSERT [dbo].[Guestbook] ([id], [name], [email], [website], [imgLink], [dateAdded], [content]) VALUES (2, N'Truong', N'deptrai@gmail.com', N'www.handsome.com', N'imgS/test.jpg', CAST(0xDE3B0B00 AS Date), N'               ASdasdasdasd')
INSERT [dbo].[Guestbook] ([id], [name], [email], [website], [imgLink], [dateAdded], [content]) VALUES (3, N'asdasd', N'asdasd@gmail.com', N'asdasd', N'imgS/google4.png', CAST(0xDE3B0B00 AS Date), N'        asdasdasd')
INSERT [dbo].[Guestbook] ([id], [name], [email], [website], [imgLink], [dateAdded], [content]) VALUES (4, N'GI GI DO ', N'asdasd@gmail.com', N'www.handsome.com', N'imgS/imgs8.png', CAST(0xDE3B0B00 AS Date), N'asdasdasdasd                                                         ')
SET IDENTITY_INSERT [dbo].[Guestbook] OFF
/****** Object:  Default [DF__HienThi__DateAdd__108B795B]    Script Date: 09/16/2016 15:54:06 ******/
ALTER TABLE [dbo].[HienThi] ADD  DEFAULT (getdate()) FOR [DateAdded]
GO
/****** Object:  Default [DF__Guestbook__dateA__32E0915F]    Script Date: 09/16/2016 15:54:06 ******/
ALTER TABLE [dbo].[Guestbook] ADD  DEFAULT (getdate()) FOR [dateAdded]
GO
