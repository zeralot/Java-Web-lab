USE [master]
GO
/****** Object:  Database [HandyService]    Script Date: 09/19/2016 18:43:29 ******/
CREATE DATABASE [HandyService] ON  PRIMARY 
( NAME = N'HandyService', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\HandyService.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'HandyService_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\HandyService_log.LDF' , SIZE = 504KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [HandyService] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [HandyService].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [HandyService] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [HandyService] SET ANSI_NULLS OFF
GO
ALTER DATABASE [HandyService] SET ANSI_PADDING OFF
GO
ALTER DATABASE [HandyService] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [HandyService] SET ARITHABORT OFF
GO
ALTER DATABASE [HandyService] SET AUTO_CLOSE ON
GO
ALTER DATABASE [HandyService] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [HandyService] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [HandyService] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [HandyService] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [HandyService] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [HandyService] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [HandyService] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [HandyService] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [HandyService] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [HandyService] SET  ENABLE_BROKER
GO
ALTER DATABASE [HandyService] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [HandyService] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [HandyService] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [HandyService] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [HandyService] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [HandyService] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [HandyService] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [HandyService] SET  READ_WRITE
GO
ALTER DATABASE [HandyService] SET RECOVERY SIMPLE
GO
ALTER DATABASE [HandyService] SET  MULTI_USER
GO
ALTER DATABASE [HandyService] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [HandyService] SET DB_CHAINING OFF
GO
USE [HandyService]
GO
/****** Object:  Table [dbo].[TrackViewer]    Script Date: 09/19/2016 18:43:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TrackViewer](
	[countViewer] [int] NULL
) ON [PRIMARY]
GO
INSERT [dbo].[TrackViewer] ([countViewer]) VALUES (14)
/****** Object:  Table [dbo].[Ref]    Script Date: 09/19/2016 18:43:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ref](
	[name] [nvarchar](50) NULL,
	[content] [nvarchar](200) NULL,
	[website] [nvarchar](100) NULL,
	[email] [nvarchar](100) NULL,
	[imgLink] [nvarchar](200) NULL,
	[dateAdded] [date] NULL,
	[id] [int] IDENTITY(1,1) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Ref] ON
INSERT [dbo].[Ref] ([name], [content], [website], [email], [imgLink], [dateAdded], [id]) VALUES (N'Truong', N'Good service                                                        ', N'www.handsome.com', N'truong@gmail.com', N'imgS/i282319414620602131._rsw360h270_szw360h270_.jpg', CAST(0xE13B0B00 AS Date), 1)
SET IDENTITY_INSERT [dbo].[Ref] OFF
/****** Object:  Table [dbo].[PriceList]    Script Date: 09/19/2016 18:43:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PriceList](
	[serviceName] [nvarchar](40) NULL,
	[info] [nvarchar](80) NULL,
	[price] [nvarchar](10) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[PriceList] ([serviceName], [info], [price]) VALUES (N'Ghost win', N'Full driver, phan mem cac kieu', N'50')
INSERT [dbo].[PriceList] ([serviceName], [info], [price]) VALUES (N'Design a website', N'Prototype given', N'500')
/****** Object:  Table [dbo].[Info]    Script Date: 09/19/2016 18:43:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Info](
	[addr] [nvarchar](100) NULL,
	[city] [nvarchar](100) NULL,
	[country] [nvarchar](100) NULL,
	[tel] [nvarchar](20) NULL,
	[email] [nvarchar](80) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Info] ([addr], [city], [country], [tel], [email]) VALUES (N'Ho Hoan Kiem', N'Ha Noi', N'Vietnam', N'0986989898', N'deptrai@gmail.com')
/****** Object:  Table [dbo].[HienThi]    Script Date: 09/19/2016 18:43:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HienThi](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](100) NULL,
	[content] [nvarchar](max) NULL,
	[imgLink] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[HienThi] ON
INSERT [dbo].[HienThi] ([id], [title], [content], [imgLink]) VALUES (1, N'Expert Japanese Plumber', N'Cac ban muon sua ong nuoc ? Theo phong cach nhat ban? Hay den day ngay', N'./Prototype/Handyman Service - us-123handyman.simplesite.com_files/i286260064312083794._szw480h1280_.jpg')
INSERT [dbo].[HienThi] ([id], [title], [content], [imgLink]) VALUES (2, N'Cai Win dao tu A-Z', N'May ban chay cham? <br>Khong thanh van de<br>Hay goi chung toi ngay', N'./Prototype/Handyman Service - us-123handyman.simplesite.com_files/i286260064312083794._szw480h1280_.jpg')
SET IDENTITY_INSERT [dbo].[HienThi] OFF
/****** Object:  Table [dbo].[FeedBack]    Script Date: 09/19/2016 18:43:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[FeedBack](
	[name] [nvarchar](80) NULL,
	[email] [nvarchar](80) NULL,
	[messageCol] [nvarchar](700) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[FeedBack] ([name], [email], [messageCol]) VALUES (N'Dep Trai', N'deptrai@gmail.com', N'                                                                aasdasdasdasd')
INSERT [dbo].[FeedBack] ([name], [email], [messageCol]) VALUES (N'asdasd', N'deptrai@gmail.com', N'Toi cam on ban                                        ')
/****** Object:  Default [DF__Ref__dateAdded__0CBAE877]    Script Date: 09/19/2016 18:43:31 ******/
ALTER TABLE [dbo].[Ref] ADD  DEFAULT (getdate()) FOR [dateAdded]
GO
