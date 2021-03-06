USE [master]
GO
/****** Object:  Database [P0025]    Script Date: 07/19/2017 10:27:00 ******/
CREATE DATABASE [P0025] ON  PRIMARY 
( NAME = N'P0025', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\P0025.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'P0025_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\P0025_log.LDF' , SIZE = 504KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [P0025] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [P0025].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [P0025] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [P0025] SET ANSI_NULLS OFF
GO
ALTER DATABASE [P0025] SET ANSI_PADDING OFF
GO
ALTER DATABASE [P0025] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [P0025] SET ARITHABORT OFF
GO
ALTER DATABASE [P0025] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [P0025] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [P0025] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [P0025] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [P0025] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [P0025] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [P0025] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [P0025] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [P0025] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [P0025] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [P0025] SET  DISABLE_BROKER
GO
ALTER DATABASE [P0025] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [P0025] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [P0025] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [P0025] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [P0025] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [P0025] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [P0025] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [P0025] SET  READ_WRITE
GO
ALTER DATABASE [P0025] SET RECOVERY FULL
GO
ALTER DATABASE [P0025] SET  MULTI_USER
GO
ALTER DATABASE [P0025] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [P0025] SET DB_CHAINING OFF
GO
USE [P0025]
GO
/****** Object:  Table [dbo].[Intro]    Script Date: 07/19/2017 10:27:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Intro](
	[Title] [nvarchar](50) NOT NULL,
	[Content] [nvarchar](4000) NOT NULL,
	[Image] [nvarchar](100) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Intro] ([Title], [Content], [Image]) VALUES (N'Courses from Beginners to Advanced Learners', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio.

Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores.', N'i286260064313937133._szw480h1280_.jpg')
INSERT [dbo].[Intro] ([Title], [Content], [Image]) VALUES (N'Courses from Beginners to Advanced Learners', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio.

Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores.', N'i286260064313937133._szw480h1280_.jpg')
INSERT [dbo].[Intro] ([Title], [Content], [Image]) VALUES (N'Courses from Beginners to Advanced Learners', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio.

Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores.', N'i286260064313937133._szw480h1280_.jpg')
/****** Object:  Table [dbo].[Course]    Script Date: 07/19/2017 10:27:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Course](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](100) NOT NULL,
	[content] [nvarchar](4000) NOT NULL,
	[image] [nchar](100) NULL,
	[date] [date] NOT NULL,
 CONSTRAINT [PK_Course] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Course] ON
INSERT [dbo].[Course] ([id], [title], [content], [image], [date]) VALUES (1, N'Developing Computer Programs', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores.', N'i286260064313937195._szw480h1280_.jpg                                                               ', CAST(0xFE3C0B00 AS Date))
INSERT [dbo].[Course] ([id], [title], [content], [image], [date]) VALUES (2, N'Configuring Computer Hardware and Software', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. ', NULL, CAST(0x073D0B00 AS Date))
INSERT [dbo].[Course] ([id], [title], [content], [image], [date]) VALUES (3, N'Programming Apps for Mobile Devices', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores.', N'i286260064313937195._szw480h1280_.jpg                                                               ', CAST(0x0E3D0B00 AS Date))
SET IDENTITY_INSERT [dbo].[Course] OFF
/****** Object:  Table [dbo].[ContactInfo]    Script Date: 07/19/2017 10:27:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ContactInfo](
	[address] [nvarchar](100) NULL,
	[city] [nvarchar](50) NULL,
	[country] [nvarchar](50) NULL,
	[tel] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[ContactInfo] ([address], [city], [country], [tel], [email]) VALUES (N'FPT Uni', N'Hanoi', N'Vietnam', N'123456', N'cc@fpt.edu.vn')
/****** Object:  Table [dbo].[Contact]    Script Date: 07/19/2017 10:27:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contact](
	[name] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[message] [nvarchar](500) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Contact] ([name], [email], [message]) VALUES (N'a', N'a@gmail.com', N'hello')
INSERT [dbo].[Contact] ([name], [email], [message]) VALUES (N'abc', N'abc@v.vn', N'hello world')
