USE [master]
GO
/****** Object:  Database [AirlineTicketsSQL]    Script Date: 09/21/2016 15:59:08 ******/
CREATE DATABASE [AirlineTicketsSQL] ON  PRIMARY 
( NAME = N'AirlineTicketsSQL', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\AirlineTicketsSQL.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'AirlineTicketsSQL_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\AirlineTicketsSQL_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [AirlineTicketsSQL] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [AirlineTicketsSQL].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [AirlineTicketsSQL] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET ANSI_NULLS OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET ANSI_PADDING OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET ARITHABORT OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [AirlineTicketsSQL] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [AirlineTicketsSQL] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [AirlineTicketsSQL] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET  DISABLE_BROKER
GO
ALTER DATABASE [AirlineTicketsSQL] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [AirlineTicketsSQL] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [AirlineTicketsSQL] SET  READ_WRITE
GO
ALTER DATABASE [AirlineTicketsSQL] SET RECOVERY SIMPLE
GO
ALTER DATABASE [AirlineTicketsSQL] SET  MULTI_USER
GO
ALTER DATABASE [AirlineTicketsSQL] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [AirlineTicketsSQL] SET DB_CHAINING OFF
GO
USE [AirlineTicketsSQL]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 09/21/2016 15:59:09 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[uid] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](30) NOT NULL,
	[password] [nvarchar](32) NOT NULL,
	[firstname] [nvarchar](32) NOT NULL,
	[lastname] [nvarchar](32) NOT NULL,
	[status] [bit] NOT NULL,
	[email] [nvarchar](32) NOT NULL,
 CONSTRAINT [PK__Users__DD7012647F60ED59] PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ__Users__F3DBC572023D5A04] UNIQUE NONCLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Users] ON
INSERT [dbo].[Users] ([uid], [username], [password], [firstname], [lastname], [status], [email]) VALUES (1, N'admin', N'123456', N'Nguyen', N'Dung', 1, N'dungnttse03851@fpt.edu.vn')
SET IDENTITY_INSERT [dbo].[Users] OFF
/****** Object:  Table [dbo].[Plane]    Script Date: 09/21/2016 15:59:09 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Plane](
	[pid] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[number] [nvarchar](50) NOT NULL,
	[statuss] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[pid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Plane] ON
INSERT [dbo].[Plane] ([pid], [name], [number], [statuss]) VALUES (1, N'Plane', N'P001', 1)
INSERT [dbo].[Plane] ([pid], [name], [number], [statuss]) VALUES (2, N'Plane', N'P002', 1)
SET IDENTITY_INSERT [dbo].[Plane] OFF
/****** Object:  Table [dbo].[Location]    Script Date: 09/21/2016 15:59:09 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Location](
	[lid] [int] IDENTITY(1,1) NOT NULL,
	[country] [nvarchar](50) NOT NULL,
	[city] [nvarchar](50) NOT NULL,
	[symbol] [nvarchar](50) NOT NULL,
	[statuss] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[lid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Location] ON
INSERT [dbo].[Location] ([lid], [country], [city], [symbol], [statuss]) VALUES (1, N'Viet Nam', N'Da Nang', N'DNA', 1)
INSERT [dbo].[Location] ([lid], [country], [city], [symbol], [statuss]) VALUES (2, N'VietNam', N'Ha Noi', N'HAN', 1)
INSERT [dbo].[Location] ([lid], [country], [city], [symbol], [statuss]) VALUES (3, N'VietNam', N'Ho Chi Minh', N'SGN', 1)
SET IDENTITY_INSERT [dbo].[Location] OFF
/****** Object:  Table [dbo].[Flights]    Script Date: 09/21/2016 15:59:09 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Flights](
	[fid] [int] IDENTITY(1,1) NOT NULL,
	[oid] [int] NOT NULL,
	[did] [int] NOT NULL,
	[dates] [nvarchar](20) NOT NULL,
	[times] [nvarchar](20) NOT NULL,
	[price] [real] NOT NULL,
	[slot] [int] NOT NULL,
	[pid] [int] NOT NULL,
	[statuss] [bit] NOT NULL,
	[times_end] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK__Flights__D9908D640DAF0CB0] PRIMARY KEY CLUSTERED 
(
	[fid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Flights] ON
INSERT [dbo].[Flights] ([fid], [oid], [did], [dates], [times], [price], [slot], [pid], [statuss], [times_end]) VALUES (1, 1, 2, N'2016-4-4', N'10:00AM', 150, 150, 1, 1, N'11:00AM')
SET IDENTITY_INSERT [dbo].[Flights] OFF
/****** Object:  Table [dbo].[Booking]    Script Date: 09/21/2016 15:59:09 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Booking](
	[bid] [int] IDENTITY(1,1) NOT NULL,
	[fid] [int] NOT NULL,
	[uid] [int] NOT NULL,
	[statuss] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[bid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Default [DF__Plane__statuss__1367E606]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Plane] ADD  DEFAULT ((1)) FOR [statuss]
GO
/****** Object:  Default [DF__Location__status__145C0A3F]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Location] ADD  DEFAULT ((1)) FOR [statuss]
GO
/****** Object:  Default [DF__Flights__statuss__15502E78]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Flights] ADD  CONSTRAINT [DF__Flights__statuss__15502E78]  DEFAULT ((1)) FOR [statuss]
GO
/****** Object:  Default [DF__Booking__statuss__164452B1]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Booking] ADD  DEFAULT ((1)) FOR [statuss]
GO
/****** Object:  ForeignKey [FK_Flights_Location]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Flights]  WITH CHECK ADD  CONSTRAINT [FK_Flights_Location] FOREIGN KEY([oid])
REFERENCES [dbo].[Location] ([lid])
GO
ALTER TABLE [dbo].[Flights] CHECK CONSTRAINT [FK_Flights_Location]
GO
/****** Object:  ForeignKey [FK_Flights_Location1]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Flights]  WITH CHECK ADD  CONSTRAINT [FK_Flights_Location1] FOREIGN KEY([did])
REFERENCES [dbo].[Location] ([lid])
GO
ALTER TABLE [dbo].[Flights] CHECK CONSTRAINT [FK_Flights_Location1]
GO
/****** Object:  ForeignKey [FK_Flights_Plane]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Flights]  WITH CHECK ADD  CONSTRAINT [FK_Flights_Plane] FOREIGN KEY([pid])
REFERENCES [dbo].[Plane] ([pid])
GO
ALTER TABLE [dbo].[Flights] CHECK CONSTRAINT [FK_Flights_Plane]
GO
/****** Object:  ForeignKey [FK_Booking_Flights]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Booking]  WITH CHECK ADD  CONSTRAINT [FK_Booking_Flights] FOREIGN KEY([fid])
REFERENCES [dbo].[Flights] ([fid])
GO
ALTER TABLE [dbo].[Booking] CHECK CONSTRAINT [FK_Booking_Flights]
GO
/****** Object:  ForeignKey [FK_Booking_Users]    Script Date: 09/21/2016 15:59:09 ******/
ALTER TABLE [dbo].[Booking]  WITH CHECK ADD  CONSTRAINT [FK_Booking_Users] FOREIGN KEY([uid])
REFERENCES [dbo].[Users] ([uid])
GO
ALTER TABLE [dbo].[Booking] CHECK CONSTRAINT [FK_Booking_Users]
GO
