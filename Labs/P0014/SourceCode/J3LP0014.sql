USE [master]
GO
/****** Object:  Database [J3LP0014]    Script Date: 09/28/2016 13:32:02 ******/
CREATE DATABASE [J3LP0014] ON  PRIMARY 
( NAME = N'J3LP0014', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\J3LP0014.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'J3LP0014_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\J3LP0014_log.LDF' , SIZE = 768KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [J3LP0014] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [J3LP0014].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [J3LP0014] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [J3LP0014] SET ANSI_NULLS OFF
GO
ALTER DATABASE [J3LP0014] SET ANSI_PADDING OFF
GO
ALTER DATABASE [J3LP0014] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [J3LP0014] SET ARITHABORT OFF
GO
ALTER DATABASE [J3LP0014] SET AUTO_CLOSE ON
GO
ALTER DATABASE [J3LP0014] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [J3LP0014] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [J3LP0014] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [J3LP0014] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [J3LP0014] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [J3LP0014] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [J3LP0014] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [J3LP0014] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [J3LP0014] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [J3LP0014] SET  ENABLE_BROKER
GO
ALTER DATABASE [J3LP0014] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [J3LP0014] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [J3LP0014] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [J3LP0014] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [J3LP0014] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [J3LP0014] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [J3LP0014] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [J3LP0014] SET  READ_WRITE
GO
ALTER DATABASE [J3LP0014] SET RECOVERY SIMPLE
GO
ALTER DATABASE [J3LP0014] SET  MULTI_USER
GO
ALTER DATABASE [J3LP0014] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [J3LP0014] SET DB_CHAINING OFF
GO
USE [J3LP0014]
GO
/****** Object:  Table [dbo].[Visit]    Script Date: 09/28/2016 13:32:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Visit](
	[countVisit] [int] NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Visit] ([countVisit]) VALUES (4)
/****** Object:  Table [dbo].[TrekkingLinks]    Script Date: 09/28/2016 13:32:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TrekkingLinks](
	[trekkingID] [int] IDENTITY(1,1) NOT NULL,
	[trekkingTitle] [nvarchar](150) NULL,
	[trekkingContent] [nvarchar](1000) NULL,
PRIMARY KEY CLUSTERED 
(
	[trekkingID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[TrekkingLinks] ON
INSERT [dbo].[TrekkingLinks] ([trekkingID], [trekkingTitle], [trekkingContent]) VALUES (1, N'Adventure Level', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad mini')
INSERT [dbo].[TrekkingLinks] ([trekkingID], [trekkingTitle], [trekkingContent]) VALUES (2, N'The Wildland Trekking.Com', N'Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iust')
INSERT [dbo].[TrekkingLinks] ([trekkingID], [trekkingTitle], [trekkingContent]) VALUES (3, N'Worlds Best Hikes: Epic', N'Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est us')
INSERT [dbo].[TrekkingLinks] ([trekkingID], [trekkingTitle], [trekkingContent]) VALUES (4, N'The 10 best treks in the', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad mini')
SET IDENTITY_INSERT [dbo].[TrekkingLinks] OFF
/****** Object:  Table [dbo].[Picture]    Script Date: 09/28/2016 13:32:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Picture](
	[pictureID] [int] IDENTITY(1,1) NOT NULL,
	[pictureLink] [nvarchar](150) NULL,
PRIMARY KEY CLUSTERED 
(
	[pictureID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Picture] ON
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (1, N'Pictures/pt1.jpg')
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (2, N'Pictures/pt2.jpg')
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (3, N'Pictures/pt3.jpg')
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (4, N'Pictures/pt4.jpg')
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (5, N'Pictures/pt5.jpg')
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (6, N'Pictures/pt6.jpg')
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (7, N'Pictures/pt7.jpg')
INSERT [dbo].[Picture] ([pictureID], [pictureLink]) VALUES (8, N'Pictures/pt8.jpg')
SET IDENTITY_INSERT [dbo].[Picture] OFF
/****** Object:  Table [dbo].[PhotoBanner]    Script Date: 09/28/2016 13:32:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhotoBanner](
	[photoID] [int] IDENTITY(1,1) NOT NULL,
	[photoLink] [nvarchar](150) NULL,
	[photoDes] [nvarchar](300) NULL,
	[photoTitle] [nvarchar](100) NULL,
	[photoAccess] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[photoID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[PhotoBanner] ON
INSERT [dbo].[PhotoBanner] ([photoID], [photoLink], [photoDes], [photoTitle], [photoAccess]) VALUES (1, N'Pictures/Banner1.jpg', N'Typi non habent claritatem insitam liber.', N'Our Diary', N'OurDiary.jsp')
INSERT [dbo].[PhotoBanner] ([photoID], [photoLink], [photoDes], [photoTitle], [photoAccess]) VALUES (2, N'Pictures/Banner2.jpg', N'Duis autem vel eum iriure dolor soluta habent.', N'Photo Album', N'PhotoAlbum.jsp')
INSERT [dbo].[PhotoBanner] ([photoID], [photoLink], [photoDes], [photoTitle], [photoAccess]) VALUES (3, N'Pictures/Banner3.jpg', N'Nam liber tempor cum soluta nobis eleifend habent.', N'Trekking Links', N'TrekkingLinks.jsp')
SET IDENTITY_INSERT [dbo].[PhotoBanner] OFF
/****** Object:  Table [dbo].[Intro]    Script Date: 09/28/2016 13:32:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Intro](
	[title] [nvarchar](150) NULL,
	[content] [nvarchar](2000) NULL,
	[picLink] [nvarchar](200) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Intro] ([title], [content], [picLink]) VALUES (N'Welcome', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.', N'Pictures/Introduction.jpg')
/****** Object:  Table [dbo].[Diary]    Script Date: 09/28/2016 13:32:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Diary](
	[diaryID] [int] IDENTITY(1,1) NOT NULL,
	[diaryTitle] [nvarchar](150) NULL,
	[diaryContent] [nvarchar](2000) NULL,
	[diaryPic] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[diaryID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Diary] ON
INSERT [dbo].[Diary] ([diaryID], [diaryTitle], [diaryContent], [diaryPic]) VALUES (1, N'Day 1', N'Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.', NULL)
INSERT [dbo].[Diary] ([diaryID], [diaryTitle], [diaryContent], [diaryPic]) VALUES (2, N'Day 2', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Pictures/Diary1.jpg')
INSERT [dbo].[Diary] ([diaryID], [diaryTitle], [diaryContent], [diaryPic]) VALUES (3, N'Day 3', N'Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.', NULL)
INSERT [dbo].[Diary] ([diaryID], [diaryTitle], [diaryContent], [diaryPic]) VALUES (4, N'Day 4', N'Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.', N'Pictures/Diary2.jpg')
SET IDENTITY_INSERT [dbo].[Diary] OFF
