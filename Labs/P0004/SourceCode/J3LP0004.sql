USE [master]
GO
/****** Object:  Database [J3LP0004]    Script Date: 09/14/2016 15:43:47 ******/
CREATE DATABASE [J3LP0004] ON  PRIMARY 
( NAME = N'J3LP0004', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\J3LP0004.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'J3LP0004_log', FILENAME = N'c:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\J3LP0004_log.LDF' , SIZE = 504KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [J3LP0004] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [J3LP0004].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [J3LP0004] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [J3LP0004] SET ANSI_NULLS OFF
GO
ALTER DATABASE [J3LP0004] SET ANSI_PADDING OFF
GO
ALTER DATABASE [J3LP0004] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [J3LP0004] SET ARITHABORT OFF
GO
ALTER DATABASE [J3LP0004] SET AUTO_CLOSE ON
GO
ALTER DATABASE [J3LP0004] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [J3LP0004] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [J3LP0004] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [J3LP0004] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [J3LP0004] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [J3LP0004] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [J3LP0004] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [J3LP0004] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [J3LP0004] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [J3LP0004] SET  ENABLE_BROKER
GO
ALTER DATABASE [J3LP0004] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [J3LP0004] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [J3LP0004] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [J3LP0004] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [J3LP0004] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [J3LP0004] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [J3LP0004] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [J3LP0004] SET  READ_WRITE
GO
ALTER DATABASE [J3LP0004] SET RECOVERY SIMPLE
GO
ALTER DATABASE [J3LP0004] SET  MULTI_USER
GO
ALTER DATABASE [J3LP0004] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [J3LP0004] SET DB_CHAINING OFF
GO
USE [J3LP0004]
GO
/****** Object:  Table [dbo].[News]    Script Date: 09/14/2016 15:43:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[News](
	[newID] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](100) NULL,
	[content] [nvarchar](2000) NULL,
	[author] [nvarchar](50) NULL,
	[dateUpload] [datetime] NULL,
	[img] [nvarchar](150) NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[News] ON
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (1, N'Making security feeds smarter via machine learning', N'The Java Tutorials are practical guides for programmers who want to use the Java programming language to create applications. They include hundreds of complete, working examples, and dozens of lessons. Groups of related lessons are organized into trails.
The Java Tutorials primarily describe features in Java SE 8. For best results, download JDK 8. <br> <br> <br> What is New. The Java Tutorials are continuously updated to keep up with changes to the Java Platform and to incorporate feedback from our readers. This release of the tutorial corresponds to the JDK 8u40 release. This release includes a new lesson in the Deployment trail that describes how to use the Java packaging tools to generate self-contained applications. Self-contained applications are Java applications that are bundled with the JRE that is needed to run. These applications are installed on a users local drive and launched in the same way as native applications. See Deploying Self-Contained Applications for more information', N'TenTungTung', CAST(0x0000A68100DE6A50 AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (2, N'Lesson: Java Applets', N'This lesson discusses the basics of Java applets, how to develop applets that interact richly with their environment, 
	and how to deploy applets. A Java applet is a special kind of Java program that a browser enabled with Java technology 
	can download from the internet and run. An applet is typically embedded inside a web page and runs in the context of a browser. 
	An applet must be a subclass of the java.applet.Applet class. <br> <br> <br> The Applet class provides the standard interface between 
	the applet and the browser environment. Swing provides a special subclass of the Applet class called javax.swing.JApplet. 
	The JApplet class should be used for all applets that use Swing components to construct their graphical user interfaces (GUIs). 
	The browsers Java Plug-in software manages the lifecycle of an applet. Use a web server to test the examples in this lesson. 
	The use of local applets is not recommended, and local applets are blocked when the security level setting in 
	the Java Control Panel is set to High or Very High.', N'Nguyen Van Son', CAST(0x0000A68100DE6A51 AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (4, N'Finding and Loading Data Files', N'Whenever a Java applet needs to load data from a file that is specified with a relative URL (a URL that doesnt completely specify the files location), 
	the applet usually uses either the code base or the document base to form the complete URL.
	The code base, returned by the JApplet getCodeBase method, is a URL that specifies the directory from which the applets classes were loaded. <br> <br> <br>
	For locally deployed applets, the getCodeBase method returns null.
	The document base, returned by the JApplet getDocumentBase method, specifies the directory of the HTML page that contains the applet. 
	For locally deployed applets, the getDocumentBase method returns null.', N'Pham Minh Thuy', CAST(0x0000A68100DE6A52 AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (7, N'What Applets Can and Cannot Do', N'Java applets are loaded on a client when the user visits a page containing an applet. 
	The security model behind Java applets has been designed with the goal of protecting the user from malicious applets.
	Applets are either sandbox applets or privileged applets. <br> <br> <br>
	Sandbox applets are run in a security sandbox that allows only a set of safe operations. 
	Privileged applets can run outside the security sandbox and have extensive capabilities to access the client.', N'Hoang Duc Manh', CAST(0x0000A68100DE6A53 AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (3, N'Doing more with applets', N'The Java applet API enables you to take advantage of the close relationship that applets have with browsers. The API is provided by the javax.swing.JApplet class and the java.applet.AppletContext interface. 
	The applet execution architecture enables applets to interact with their environment to produce a rich user experience. <br> <br <br>
	An applet can manipulate its parent web page, interact with JavaScript code in the web page, find other applets running in the same web page, and much more.
	Advanced capabilities of Java applets are explored in subsequent topics.
	See Doing More With Java Rich Internet Applications for further information on advanced topics that are common to applets and Java Web Start applications (such as setting arguments and properties, using Java Network Launch Protocol API).', N'Vu Ngoc Thach', CAST(0x0000A68100DE6A51 AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (5, N'Displaying Short Status Strings', N'All browsers allow Java applets to display a short status string. All Java applets on the page, as well as the browser itself, share the same status line.
	Never put crucial information in the status line. If many users might need the information, display that information within the applet area. 
	If only a few, sophisticated users might need the information, consider sending the information to standard output 
	(see Writing Diagnostics to Standard Output and Error Streams). The status line is not usually very prominent, and it can be overwritten by other applets or by the browser. <br> <br> <br>
	For these reasons, it is best used for incidental, transitory information. For example, an applet that loads several image files might display the name of the image file it is currently loading.', N'Nguyen Tuan Tung', CAST(0x0000A68100DE6A52 AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (6, N'Handling Initialization Status With Event Handlers', N'An applet cannot handle requests from JavaScript code in the web page until the applet has been initialized. 
	A call to an applet method or access to an applet variable from JavaScript code will be blocked until the applets 
	init() method is complete or the applet first invokes JavaScript code from the web page in which it is deployed. <br> <br> <br>
	As the JavaScript implementation is single-threaded in many browsers, the web page may appear to be frozen during applet startup.
	Beginning in the JDK 7 release, you can check the status variable of the applet while it is loading to determine if the applet is ready to handle requests from JavaScript code. 
	Load handler is automatically invoked by the Java Plug-in software when the applet has been initialized. The onLoad handler invokes other methods of the applet to draw the graph on the web page.', N'Son Tung MTP', CAST(0x0000A68100DE6A53 AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (8, N'Testing', N'Java applets are loaded on a client when the user visits a page containing an applet. 
	The security model behind Java applets has been designed with the goal of protecting the user from malicious applets.
	Applets are either sandbox applets or privileged applets. <br> <br> <br>
	Sandbox applets are run in a security sandbox that allows only a set of safe operations. 
	Privileged applets can run outside the security sandbox and have extensive capabilities to access the client.', N'Hoang Duc Manh', CAST(0x0000A68100F9F9FC AS DateTime), N'Pictures/i1.jpg')
INSERT [dbo].[News] ([newID], [title], [content], [author], [dateUpload], [img]) VALUES (9, N'Test2', N'Hahaha Java applets are loaded on a client when the user visits a page containing an applet. 
	The security model behind Java applets has been designed with the goal of protecting the user from malicious applets.
	Applets are either sandbox applets or privileged applets. <br> <br> <br>
	Sandbox applets are run in a security sandbox that allows only a set of safe operations. 
	Privileged applets can run outside the security sandbox and have extensive capabilities to access the client.', N'Hoang Duc Manh', CAST(0x0000A68100FA363A AS DateTime), N'Pictures/i1.jpg')
SET IDENTITY_INSERT [dbo].[News] OFF
