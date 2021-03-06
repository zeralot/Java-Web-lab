USE [master]
GO
/****** Object:  Database [garden]    Script Date: 09/19/2016 15:25:24 ******/
CREATE DATABASE [garden] ON  PRIMARY 
( NAME = N'garden', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\garden.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'garden_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\garden_log.LDF' , SIZE = 504KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [garden] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [garden].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [garden] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [garden] SET ANSI_NULLS OFF
GO
ALTER DATABASE [garden] SET ANSI_PADDING OFF
GO
ALTER DATABASE [garden] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [garden] SET ARITHABORT OFF
GO
ALTER DATABASE [garden] SET AUTO_CLOSE ON
GO
ALTER DATABASE [garden] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [garden] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [garden] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [garden] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [garden] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [garden] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [garden] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [garden] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [garden] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [garden] SET  ENABLE_BROKER
GO
ALTER DATABASE [garden] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [garden] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [garden] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [garden] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [garden] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [garden] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [garden] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [garden] SET  READ_WRITE
GO
ALTER DATABASE [garden] SET RECOVERY SIMPLE
GO
ALTER DATABASE [garden] SET  MULTI_USER
GO
ALTER DATABASE [garden] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [garden] SET DB_CHAINING OFF
GO
USE [garden]
GO
/****** Object:  Table [dbo].[img]    Script Date: 09/19/2016 15:25:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[img](
	[link] [varchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[img] ([link]) VALUES (N'i287104489242216175._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[img] ([link]) VALUES (N'i287104489242216170._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[img] ([link]) VALUES (N'i287104489242216171._rsw360h270_szw360h270_.jpg')
INSERT [dbo].[img] ([link]) VALUES (N'i287104489242216172._rsw360h270_szw360h270_.jpg')
/****** Object:  Table [dbo].[feedback]    Script Date: 09/19/2016 15:25:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[feedback](
	[name] [varchar](max) NULL,
	[email] [varchar](max) NULL,
	[messenger] [varchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[feedback] ([name], [email], [messenger]) VALUES (N'a', N'bao', N'hello')
INSERT [dbo].[feedback] ([name], [email], [messenger]) VALUES (N'bao', N'fpt@com.vn', N'hello')
INSERT [dbo].[feedback] ([name], [email], [messenger]) VALUES (N'truong', N'fpt@com.edu.vn', N'hello')
/****** Object:  Table [dbo].[dulieu]    Script Date: 09/19/2016 15:25:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[dulieu](
	[title] [varchar](max) NULL,
	[content] [varchar](max) NULL,
	[img] [varchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[dulieu] ([title], [content], [img]) VALUES (N'Hedge Cutting', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex
 ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis
 dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes
 demonstraverunt lectores legere me lius quod ii legunt saepius.', N'i287104489242216168._szw480h1280_.jpg')
INSERT [dbo].[dulieu] ([title], [content], [img]) VALUES (N'Hedge Cutting', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex
 ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis
 dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes
 demonstraverunt lectores legere me lius quod ii legunt saepius.', N'i287104489242216168._szw480h1280_.jpg')
INSERT [dbo].[dulieu] ([title], [content], [img]) VALUES (N'Hedge Cutting', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex
 ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis
 dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes
 demonstraverunt lectores legere me lius quod ii legunt saepius.', N'i287104489242216168._szw480h1280_.jpg')
INSERT [dbo].[dulieu] ([title], [content], [img]) VALUES (N'Hedge Cutting', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex
 ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis
 dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes
 demonstraverunt lectores legere me lius quod ii legunt saepius.', N'i287104489242216168._szw480h1280_.jpg')
/****** Object:  Table [dbo].[db]    Script Date: 09/19/2016 15:25:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[db](
	[soluot] [int] NULL
) ON [PRIMARY]
GO
INSERT [dbo].[db] ([soluot]) VALUES (43)
/****** Object:  Table [dbo].[contact]    Script Date: 09/19/2016 15:25:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[contact](
	[address] [nvarchar](max) NULL,
	[city] [nvarchar](max) NULL,
	[country] [nvarchar](max) NULL,
	[tel] [int] NULL,
	[email] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[contact] ([address], [city], [country], [tel], [email]) VALUES (N'21, Nguyễn Văn Linh', N'Đà Nẵng', N'Việt Nam', 123456, N'nguoidixa@fpt.edu.vn')
