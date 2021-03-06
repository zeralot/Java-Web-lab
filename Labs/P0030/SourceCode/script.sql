USE [master]
GO
/****** Object:  Database [ChauffeurService]    Script Date: 09/23/2016 17:02:50 ******/
CREATE DATABASE [ChauffeurService] ON  PRIMARY 
( NAME = N'ChauffeurService', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\ChauffeurService.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ChauffeurService_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\ChauffeurService_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ChauffeurService] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ChauffeurService].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ChauffeurService] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [ChauffeurService] SET ANSI_NULLS OFF
GO
ALTER DATABASE [ChauffeurService] SET ANSI_PADDING OFF
GO
ALTER DATABASE [ChauffeurService] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [ChauffeurService] SET ARITHABORT OFF
GO
ALTER DATABASE [ChauffeurService] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [ChauffeurService] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [ChauffeurService] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [ChauffeurService] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [ChauffeurService] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [ChauffeurService] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [ChauffeurService] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [ChauffeurService] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [ChauffeurService] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [ChauffeurService] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [ChauffeurService] SET  DISABLE_BROKER
GO
ALTER DATABASE [ChauffeurService] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [ChauffeurService] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [ChauffeurService] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [ChauffeurService] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [ChauffeurService] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [ChauffeurService] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [ChauffeurService] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [ChauffeurService] SET  READ_WRITE
GO
ALTER DATABASE [ChauffeurService] SET RECOVERY SIMPLE
GO
ALTER DATABASE [ChauffeurService] SET  MULTI_USER
GO
ALTER DATABASE [ChauffeurService] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [ChauffeurService] SET DB_CHAINING OFF
GO
USE [ChauffeurService]
GO
/****** Object:  Table [dbo].[views]    Script Date: 09/23/2016 17:02:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[views](
	[views] [int] NULL,
	[page] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[views] ([views], [page]) VALUES (124, N'index')
/****** Object:  Table [dbo].[Entrys]    Script Date: 09/23/2016 17:02:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Entrys](
	[eid] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[icon] [nvarchar](max) NOT NULL,
	[description_pic] [nvarchar](max) NOT NULL,
	[views_e] [int] NOT NULL,
	[description_entry] [nvarchar](max) NOT NULL,
	[date] [date] NULL,
	[likes_e] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[eid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Entrys] ON
INSERT [dbo].[Entrys] ([eid], [name], [icon], [description_pic], [views_e], [description_entry], [date], [likes_e]) VALUES (1, N'Highest quality chauffeur services - Call 12345', N'4', N'Claritas est etiam processus dynamicus, qui sequitur', 0, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.', CAST(0x6B380B00 AS Date), NULL)
INSERT [dbo].[Entrys] ([eid], [name], [icon], [description_pic], [views_e], [description_entry], [date], [likes_e]) VALUES (2, N'About us', N'5', N'', 0, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.', CAST(0x6B380B00 AS Date), NULL)
INSERT [dbo].[Entrys] ([eid], [name], [icon], [description_pic], [views_e], [description_entry], [date], [likes_e]) VALUES (3, N'Oldtimer', N'5', N'Claritas est etiam processus dynamicus, qui sequitur', 0, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.', CAST(0x68380B00 AS Date), NULL)
INSERT [dbo].[Entrys] ([eid], [name], [icon], [description_pic], [views_e], [description_entry], [date], [likes_e]) VALUES (4, N'Rolls Royce', N'4', N'', 0, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.', CAST(0xDC3B0B00 AS Date), NULL)
INSERT [dbo].[Entrys] ([eid], [name], [icon], [description_pic], [views_e], [description_entry], [date], [likes_e]) VALUES (6, N'Mercedes', N'1', N'Claritas est etiam processus dynamicus, qui sequitur', 0, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.', CAST(0xDC3B0B00 AS Date), NULL)
SET IDENTITY_INSERT [dbo].[Entrys] OFF
/****** Object:  Table [dbo].[Contacts]    Script Date: 09/23/2016 17:02:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contacts](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[email] [nvarchar](max) NOT NULL,
	[mess] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Contacts] ON
INSERT [dbo].[Contacts] ([cid], [name], [email], [mess]) VALUES (1, N'dsadsadsa', N'sadsads@gmail', N'dsadsa')
INSERT [dbo].[Contacts] ([cid], [name], [email], [mess]) VALUES (2, N'gfdgfdgfd', N'gfdgfdgfd@gmail.com', N'fdsfdsfdsfd')
INSERT [dbo].[Contacts] ([cid], [name], [email], [mess]) VALUES (3, N'jhvsajhdvsa', N'hdgscdhgsa@gmail.com', N'dsjaghdsahdfsajhdfsaj')
INSERT [dbo].[Contacts] ([cid], [name], [email], [mess]) VALUES (4, N'dgfdgf', N'gfdgfdg@dadsads.com', N'dgfdgfdgf')
SET IDENTITY_INSERT [dbo].[Contacts] OFF
/****** Object:  Default [DF__Entrys__views_e__0519C6AF]    Script Date: 09/23/2016 17:02:52 ******/
ALTER TABLE [dbo].[Entrys] ADD  DEFAULT ((0)) FOR [views_e]
GO
