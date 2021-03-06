USE [master]
GO
/****** Object:  Database [userproject]    Script Date: 09/28/2016 14:17:10 ******/
CREATE DATABASE [userproject] ON  PRIMARY 
( NAME = N'userproject', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\userproject.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'userproject_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\userproject_log.LDF' , SIZE = 768KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [userproject] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [userproject].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [userproject] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [userproject] SET ANSI_NULLS OFF
GO
ALTER DATABASE [userproject] SET ANSI_PADDING OFF
GO
ALTER DATABASE [userproject] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [userproject] SET ARITHABORT OFF
GO
ALTER DATABASE [userproject] SET AUTO_CLOSE ON
GO
ALTER DATABASE [userproject] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [userproject] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [userproject] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [userproject] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [userproject] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [userproject] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [userproject] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [userproject] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [userproject] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [userproject] SET  ENABLE_BROKER
GO
ALTER DATABASE [userproject] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [userproject] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [userproject] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [userproject] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [userproject] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [userproject] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [userproject] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [userproject] SET  READ_WRITE
GO
ALTER DATABASE [userproject] SET RECOVERY SIMPLE
GO
ALTER DATABASE [userproject] SET  MULTI_USER
GO
ALTER DATABASE [userproject] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [userproject] SET DB_CHAINING OFF
GO
USE [userproject]
GO
/****** Object:  Table [dbo].[user1]    Script Date: 09/28/2016 14:17:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[user1](
	[UserName] [varchar](20) NULL,
	[Email] [varchar](20) NULL,
	[FirstName] [varchar](20) NULL,
	[LastName] [varchar](20) NULL,
	[Website] [varchar](20) NULL,
	[Password] [varchar](20) NULL,
	[Role] [varchar](20) NULL,
	[Post] [int] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[user1] ([UserName], [Email], [FirstName], [LastName], [Website], [Password], [Role], [Post]) VALUES (N'us123', N'nguoidi@yahoo.com', N'Bao', N'Nguyen', N'fpt.com', N'aaa', N'Subscriber', 5)
INSERT [dbo].[user1] ([UserName], [Email], [FirstName], [LastName], [Website], [Password], [Role], [Post]) VALUES (N'admin', N'fpt@yahoo.com', N'Hung', N'Nguyen', N'zzz.com', N'bbb', N'Subscriber', 5)
INSERT [dbo].[user1] ([UserName], [Email], [FirstName], [LastName], [Website], [Password], [Role], [Post]) VALUES (N'caothu', N'long@yahoo.com', N'Giang Thanh', N'Nguyen', N'ccc.com', N'bbb', N'Subscriber', 2)
INSERT [dbo].[user1] ([UserName], [Email], [FirstName], [LastName], [Website], [Password], [Role], [Post]) VALUES (N'fifa', N'dn@yahoo.com', N'Loan', N'Nguyen', N'ccc.com', N'bbb', N'Administrator', 0)
INSERT [dbo].[user1] ([UserName], [Email], [FirstName], [LastName], [Website], [Password], [Role], [Post]) VALUES (N'fifa', N'dn@yahoo.com', N'Loan', N'Nguyen', N'ccc.com', N'bbb', N'Administrator', 0)
INSERT [dbo].[user1] ([UserName], [Email], [FirstName], [LastName], [Website], [Password], [Role], [Post]) VALUES (N'fifa', N'dn@yahoo.com', N'Loan', N'Nguyen', N'ccc.com', N'bbb', N'Administrator', 0)
