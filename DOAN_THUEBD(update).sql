USE [master]
GO
/****** Object:  Database [DOAN_THUEBD]    Script Date: 16/02/2024 14:19:20 ******/
CREATE DATABASE [DOAN_THUEBD]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DOAN_THUEBD', FILENAME = N'D:\DBMS\DOAN_THUEBD.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'DOAN_THUEBD_log', FILENAME = N'D:\DBMS\DOAN_THUEBD_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [DOAN_THUEBD] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DOAN_THUEBD].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DOAN_THUEBD] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET ARITHABORT OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DOAN_THUEBD] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DOAN_THUEBD] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET  DISABLE_BROKER 
GO
ALTER DATABASE [DOAN_THUEBD] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DOAN_THUEBD] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET RECOVERY FULL 
GO
ALTER DATABASE [DOAN_THUEBD] SET  MULTI_USER 
GO
ALTER DATABASE [DOAN_THUEBD] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DOAN_THUEBD] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DOAN_THUEBD] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DOAN_THUEBD] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [DOAN_THUEBD] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [DOAN_THUEBD] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'DOAN_THUEBD', N'ON'
GO
ALTER DATABASE [DOAN_THUEBD] SET QUERY_STORE = OFF
GO
USE [DOAN_THUEBD]
GO
/****** Object:  Table [dbo].[CT_CAPNHAT]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CT_CAPNHAT](
	[IDCN] [int] IDENTITY(1,1) NOT NULL,
	[MANV] [char](12) NULL,
	[MNCC] [nchar](10) NULL,
	[MADIA] [int] NULL,
	[NGAYCN] [date] NULL,
 CONSTRAINT [PK_CT_CAPNHAT] PRIMARY KEY CLUSTERED 
(
	[IDCN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CT_THUE]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CT_THUE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MADIA] [int] NOT NULL,
	[CCCD_KH] [char](12) NOT NULL,
	[CCCD_NV] [char](12) NOT NULL,
	[IDTRA] [int] NULL,
	[SLTHUE] [int] NOT NULL,
	[NGAYTHUE] [date] NOT NULL,
	[NGAYTRA] [date] NOT NULL,
 CONSTRAINT [PK_CT_THUE] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DIA]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DIA](
	[MADIA] [int] NOT NULL,
	[TENDIA] [nvarchar](50) NULL,
	[LOAI] [nvarchar](50) NULL,
	[SOLUONG] [int] NOT NULL,
	[GIA] [money] NOT NULL,
	[TT] [nchar](10) NOT NULL,
 CONSTRAINT [PK_DIA] PRIMARY KEY CLUSTERED 
(
	[MADIA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DS_TRA]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DS_TRA](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CCCD_NV] [char](12) NOT NULL,
	[NGAYTRA] [date] NOT NULL,
	[PHUPHI] [money] NOT NULL,
 CONSTRAINT [PK_CT_TRA] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[CCCD] [char](12) NOT NULL,
	[HOTEN] [nvarchar](50) NULL,
	[GIOITINH] [nvarchar](5) NOT NULL,
	[NGAYSINH] [date] NULL,
	[SDT] [char](10) NULL,
	[EMAIL] [varchar](50) NULL,
	[DIACHI] [nvarchar](255) NULL,
 CONSTRAINT [PK_KHACHHANG] PRIMARY KEY CLUSTERED 
(
	[CCCD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHACC]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHACC](
	[MANCC] [nchar](10) NOT NULL,
	[TENNCC] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_NHACC] PRIMARY KEY CLUSTERED 
(
	[MANCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[CCCD] [char](12) NOT NULL,
	[UID] [int] NULL,
	[HO] [nvarchar](50) NULL,
	[TEN] [nvarchar](50) NULL,
	[GIOITINH] [nvarchar](5) NOT NULL,
	[NGAYSINH] [date] NULL,
	[SDT] [char](10) NULL,
	[EMAIL] [varchar](50) NULL,
	[DIACHI] [nvarchar](255) NULL,
 CONSTRAINT [PK_NHANVIEN] PRIMARY KEY CLUSTERED 
(
	[CCCD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TAIKHOAN]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TAIKHOAN](
	[UID] [int] NOT NULL,
	[TENDANGNHAP] [char](12) NOT NULL,
	[MATKHAU] [nvarchar](10) NOT NULL,
	[VAITRO] [int] NOT NULL,
 CONSTRAINT [PK_UID] PRIMARY KEY CLUSTERED 
(
	[UID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[CT_CAPNHAT] ON 

INSERT [dbo].[CT_CAPNHAT] ([IDCN], [MANV], [MNCC], [MADIA], [NGAYCN]) VALUES (3, N'030604050908', N'TKT       ', 10, CAST(N'2024-02-16' AS Date))
INSERT [dbo].[CT_CAPNHAT] ([IDCN], [MANV], [MNCC], [MADIA], [NGAYCN]) VALUES (4, N'030604050908', N'CE32      ', 11, CAST(N'2024-02-16' AS Date))
INSERT [dbo].[CT_CAPNHAT] ([IDCN], [MANV], [MNCC], [MADIA], [NGAYCN]) VALUES (5, N'030604050908', N'TKT       ', 10, CAST(N'2024-02-16' AS Date))
SET IDENTITY_INSERT [dbo].[CT_CAPNHAT] OFF
GO
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (1, N'Thủy thủ mặt trăng', N'CD', 50, 10000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (2, N'Naruto ', N'DVD', 100, 20000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (3, N'Album Nhạc trẻ 2018', N'Băng từ', 60, 15000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (4, N'Zelda ', N'Đĩa game', 80, 150000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (5, N'God of War', N'Đĩa game', 50, 20000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (6, N'Witcher I', N'Đĩa game ', 100, 150000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (7, N'Dragon Lore', N'DVD', 50, 50000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (8, N'Superman vs Batman', N'DVD', 80, 100000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (9, N'Doraemon và vùng đất khủng long', N'DVD', 20, 20000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (10, N'Sakura', N'CD', 50, 20000.0000, N'Hiện      ')
INSERT [dbo].[DIA] ([MADIA], [TENDIA], [LOAI], [SOLUONG], [GIA], [TT]) VALUES (11, N'Dark Soul', N'Đĩa Game', 50, 50000.0000, N'Hiện      ')
GO
INSERT [dbo].[KHACHHANG] ([CCCD], [HOTEN], [GIOITINH], [NGAYSINH], [SDT], [EMAIL], [DIACHI]) VALUES (N'012345678954', N'Vu Ngọc Thoại', N'Nam', CAST(N'2005-06-30' AS Date), N'0366264050', N'vuthoai@gmail.com', NULL)
GO
INSERT [dbo].[NHACC] ([MANCC], [TENNCC]) VALUES (N'CE32      ', N'Cánh én')
INSERT [dbo].[NHACC] ([MANCC], [TENNCC]) VALUES (N'TKT       ', N'Tokutatsu')
INSERT [dbo].[NHACC] ([MANCC], [TENNCC]) VALUES (N'TP01      ', N'Tiền Phong')
GO
INSERT [dbo].[NHANVIEN] ([CCCD], [UID], [HO], [TEN], [GIOITINH], [NGAYSINH], [SDT], [EMAIL], [DIACHI]) VALUES (N'030604050908', 1, N'Lê', N'Khôi', N'Nam', CAST(N'1999-03-25' AS Date), N'0609080736', N'Leekoi@gmail.com', N'Quảng Ninh')
INSERT [dbo].[NHANVIEN] ([CCCD], [UID], [HO], [TEN], [GIOITINH], [NGAYSINH], [SDT], [EMAIL], [DIACHI]) VALUES (N'080203060405', 2, N'Nguyễn ', N'Nhật Minh', N'Nam', CAST(N'2003-06-30' AS Date), N'0326034006', N'Minhdan@gmail.com', N'Hà Nội')
GO
INSERT [dbo].[TAIKHOAN] ([UID], [TENDANGNHAP], [MATKHAU], [VAITRO]) VALUES (1, N'030604050908', N'Lekoi03', 0)
INSERT [dbo].[TAIKHOAN] ([UID], [TENDANGNHAP], [MATKHAU], [VAITRO]) VALUES (2, N'080203060405', N'Nminh08', 1)
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_TENDIA]    Script Date: 16/02/2024 14:19:20 ******/
ALTER TABLE [dbo].[DIA] ADD  CONSTRAINT [UK_TENDIA] UNIQUE NONCLUSTERED 
(
	[TENDIA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [UK_NHANVIEN_UID]    Script Date: 16/02/2024 14:19:20 ******/
ALTER TABLE [dbo].[NHANVIEN] ADD  CONSTRAINT [UK_NHANVIEN_UID] UNIQUE NONCLUSTERED 
(
	[UID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_TENDANGNHAP]    Script Date: 16/02/2024 14:19:20 ******/
ALTER TABLE [dbo].[TAIKHOAN] ADD  CONSTRAINT [UK_TENDANGNHAP] UNIQUE NONCLUSTERED 
(
	[TENDANGNHAP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[CT_CAPNHAT] ADD  CONSTRAINT [DF_CT_CAPNHAT_MANV]  DEFAULT ('030604050908') FOR [MANV]
GO
ALTER TABLE [dbo].[CT_THUE] ADD  CONSTRAINT [DF_CT_THUE_SLTHUE]  DEFAULT ((0)) FOR [SLTHUE]
GO
ALTER TABLE [dbo].[CT_THUE] ADD  CONSTRAINT [DF_CT_THUE_NGAYTHUE]  DEFAULT (getdate()) FOR [NGAYTHUE]
GO
ALTER TABLE [dbo].[DIA] ADD  CONSTRAINT [DF_DIA_SOLUONG]  DEFAULT ((0)) FOR [SOLUONG]
GO
ALTER TABLE [dbo].[DIA] ADD  CONSTRAINT [DF_DIA_GIA]  DEFAULT ((0)) FOR [GIA]
GO
ALTER TABLE [dbo].[DIA] ADD  CONSTRAINT [DF_DIA_TT]  DEFAULT (N'Hiện') FOR [TT]
GO
ALTER TABLE [dbo].[DS_TRA] ADD  CONSTRAINT [DF_CT_TRA_NGAYTRA]  DEFAULT (getdate()) FOR [NGAYTRA]
GO
ALTER TABLE [dbo].[DS_TRA] ADD  CONSTRAINT [DF_CT_TRA_PHUPHI]  DEFAULT ((0)) FOR [PHUPHI]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  CONSTRAINT [DF_KHACHHANG_GIOITINH]  DEFAULT (N'Nam') FOR [GIOITINH]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  CONSTRAINT [DF_NHANVIEN_GIOITINH]  DEFAULT (N'NAM') FOR [GIOITINH]
GO
ALTER TABLE [dbo].[CT_CAPNHAT]  WITH CHECK ADD  CONSTRAINT [FK_CT_CAPNHAT_DIA] FOREIGN KEY([MADIA])
REFERENCES [dbo].[DIA] ([MADIA])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[CT_CAPNHAT] CHECK CONSTRAINT [FK_CT_CAPNHAT_DIA]
GO
ALTER TABLE [dbo].[CT_CAPNHAT]  WITH CHECK ADD  CONSTRAINT [FK_CT_CAPNHAT_NHACC] FOREIGN KEY([MNCC])
REFERENCES [dbo].[NHACC] ([MANCC])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[CT_CAPNHAT] CHECK CONSTRAINT [FK_CT_CAPNHAT_NHACC]
GO
ALTER TABLE [dbo].[CT_CAPNHAT]  WITH CHECK ADD  CONSTRAINT [FK_CT_CAPNHAT_NHANVIEN] FOREIGN KEY([MANV])
REFERENCES [dbo].[NHANVIEN] ([CCCD])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[CT_CAPNHAT] CHECK CONSTRAINT [FK_CT_CAPNHAT_NHANVIEN]
GO
ALTER TABLE [dbo].[CT_THUE]  WITH CHECK ADD  CONSTRAINT [FK_CT_THUE_DIA] FOREIGN KEY([MADIA])
REFERENCES [dbo].[DIA] ([MADIA])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[CT_THUE] CHECK CONSTRAINT [FK_CT_THUE_DIA]
GO
ALTER TABLE [dbo].[CT_THUE]  WITH CHECK ADD  CONSTRAINT [FK_CT_THUE_DS_TRA] FOREIGN KEY([IDTRA])
REFERENCES [dbo].[DS_TRA] ([ID])
GO
ALTER TABLE [dbo].[CT_THUE] CHECK CONSTRAINT [FK_CT_THUE_DS_TRA]
GO
ALTER TABLE [dbo].[CT_THUE]  WITH CHECK ADD  CONSTRAINT [FK_CT_THUE_KHACHHANG] FOREIGN KEY([CCCD_KH])
REFERENCES [dbo].[KHACHHANG] ([CCCD])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[CT_THUE] CHECK CONSTRAINT [FK_CT_THUE_KHACHHANG]
GO
ALTER TABLE [dbo].[CT_THUE]  WITH CHECK ADD  CONSTRAINT [FK_CT_THUE_NHANVIEN] FOREIGN KEY([CCCD_NV])
REFERENCES [dbo].[NHANVIEN] ([CCCD])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[CT_THUE] CHECK CONSTRAINT [FK_CT_THUE_NHANVIEN]
GO
ALTER TABLE [dbo].[DS_TRA]  WITH CHECK ADD  CONSTRAINT [FK_DS_TRA_NHANVIEN] FOREIGN KEY([CCCD_NV])
REFERENCES [dbo].[NHANVIEN] ([CCCD])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[DS_TRA] CHECK CONSTRAINT [FK_DS_TRA_NHANVIEN]
GO
ALTER TABLE [dbo].[TAIKHOAN]  WITH CHECK ADD  CONSTRAINT [FK_TAIKHOAN_NHANVIEN] FOREIGN KEY([TENDANGNHAP])
REFERENCES [dbo].[NHANVIEN] ([CCCD])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[TAIKHOAN] CHECK CONSTRAINT [FK_TAIKHOAN_NHANVIEN]
GO
ALTER TABLE [dbo].[CT_THUE]  WITH CHECK ADD  CONSTRAINT [CK_CT_THUE_NGAYTRA] CHECK  (([NGAYTRA]>[NGAYTHUE]))
GO
ALTER TABLE [dbo].[CT_THUE] CHECK CONSTRAINT [CK_CT_THUE_NGAYTRA]
GO
ALTER TABLE [dbo].[DIA]  WITH CHECK ADD  CONSTRAINT [CK_DIA_GIA] CHECK  (([GIA]>=(0)))
GO
ALTER TABLE [dbo].[DIA] CHECK CONSTRAINT [CK_DIA_GIA]
GO
ALTER TABLE [dbo].[DIA]  WITH CHECK ADD  CONSTRAINT [CK_DIA_SOLUONG] CHECK  (([SOLUONG]>=(0)))
GO
ALTER TABLE [dbo].[DIA] CHECK CONSTRAINT [CK_DIA_SOLUONG]
GO
ALTER TABLE [dbo].[DIA]  WITH CHECK ADD  CONSTRAINT [CK_DIA_TT] CHECK  (([TT]=N'Ẩn' OR [TT]=N'Hiện'))
GO
ALTER TABLE [dbo].[DIA] CHECK CONSTRAINT [CK_DIA_TT]
GO
ALTER TABLE [dbo].[DS_TRA]  WITH CHECK ADD  CONSTRAINT [CK_CT_TRA_PHUPHI] CHECK  (([PHUPHI]=(10000) OR [PHUPHI]=(0)))
GO
ALTER TABLE [dbo].[DS_TRA] CHECK CONSTRAINT [CK_CT_TRA_PHUPHI]
GO
ALTER TABLE [dbo].[KHACHHANG]  WITH CHECK ADD  CONSTRAINT [CK_KHACHHANG_EMAIL] CHECK  (([EMAIL] like '%@gmail.com'))
GO
ALTER TABLE [dbo].[KHACHHANG] CHECK CONSTRAINT [CK_KHACHHANG_EMAIL]
GO
ALTER TABLE [dbo].[KHACHHANG]  WITH CHECK ADD  CONSTRAINT [CK_KHACHHANG_NGAYSINH] CHECK  (([NGAYSINH]<=getdate()))
GO
ALTER TABLE [dbo].[KHACHHANG] CHECK CONSTRAINT [CK_KHACHHANG_NGAYSINH]
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD  CONSTRAINT [CK_NHANVIEN_EMAIL] CHECK  (([EMAIL] like '%@gmail.com'))
GO
ALTER TABLE [dbo].[NHANVIEN] CHECK CONSTRAINT [CK_NHANVIEN_EMAIL]
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD  CONSTRAINT [CK_NHANVIEN_NGAYSINH] CHECK  (([NGAYSINH]<=getdate()))
GO
ALTER TABLE [dbo].[NHANVIEN] CHECK CONSTRAINT [CK_NHANVIEN_NGAYSINH]
GO
ALTER TABLE [dbo].[TAIKHOAN]  WITH CHECK ADD  CONSTRAINT [CK_MATKHAU] CHECK  (([MATKHAU] like '%[0-9]%' AND [MATKHAU] like '%[a-z]%' AND [MATKHAU] like '%[A-Z]%'))
GO
ALTER TABLE [dbo].[TAIKHOAN] CHECK CONSTRAINT [CK_MATKHAU]
GO
ALTER TABLE [dbo].[TAIKHOAN]  WITH CHECK ADD  CONSTRAINT [CK_VAITRO] CHECK  (([VAITRO]=(1) OR [VAITRO]=(0)))
GO
ALTER TABLE [dbo].[TAIKHOAN] CHECK CONSTRAINT [CK_VAITRO]
GO
/****** Object:  StoredProcedure [dbo].[InsertDisk]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[InsertDisk] 
(@ma INT, @tendia NVARCHAR(50), @loai NVARCHAR(50), @sl INT, @gia MONEY, @ncc NVARCHAR(10))
AS
BEGIN
	INSERT INTO dbo.DIA (MADIA, TENDIA, LOAI, SOLUONG, GIA, TT)
	VALUES (@ma, @tendia, @loai, @sl, @gia, N'Hiện')

	INSERT INTO CT_CAPNHAT (MNCC, MADIA, NGAYCN)
	VALUES (@ncc, @ma, GETDATE())
END
GO
/****** Object:  StoredProcedure [dbo].[UpdateDiskData]    Script Date: 16/02/2024 14:19:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[UpdateDiskData]
(@ma INT, @sl INT, @gia MONEY, @ncc NVARCHAR(10))
AS
BEGIN
	UPDATE DIA
	SET SOLUONG = @sl, GIA = @gia
	WHERE MADIA = @ma

	INSERT INTO CT_CAPNHAT (MNCC, MADIA, NGAYCN)
	VALUES (@ncc, @ma, GETDATE())
END
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'ID Kiểm soát phiếu thuê' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Mã Đĩa' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'COLUMN',@level2name=N'MADIA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Căn cước công dân khách hàng' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'COLUMN',@level2name=N'CCCD_KH'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Căn cước công dân nhân viên' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'COLUMN',@level2name=N'CCCD_NV'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Số lượng thuê' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'COLUMN',@level2name=N'SLTHUE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày thuê' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'COLUMN',@level2name=N'NGAYTHUE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày trả' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'COLUMN',@level2name=N'NGAYTRA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Chi tiết Thuê' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày trả phải lớn hơn ngày thuê' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'CT_THUE', @level2type=N'CONSTRAINT',@level2name=N'CK_CT_THUE_NGAYTRA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Mã đĩa' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DIA', @level2type=N'COLUMN',@level2name=N'MADIA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Tên Đĩa' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DIA', @level2type=N'COLUMN',@level2name=N'TENDIA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Loại' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DIA', @level2type=N'COLUMN',@level2name=N'LOAI'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Trạng thái' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DIA', @level2type=N'COLUMN',@level2name=N'TT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Đĩa' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DIA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Giá không được âm' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DIA', @level2type=N'CONSTRAINT',@level2name=N'CK_DIA_GIA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Số lượng không được âm' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DIA', @level2type=N'CONSTRAINT',@level2name=N'CK_DIA_SOLUONG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'ID phiếu trả' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DS_TRA', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Căn cước công dân nhân viên' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DS_TRA', @level2type=N'COLUMN',@level2name=N'CCCD_NV'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày trả' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DS_TRA', @level2type=N'COLUMN',@level2name=N'NGAYTRA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Phụ phí' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DS_TRA', @level2type=N'COLUMN',@level2name=N'PHUPHI'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Danh sách Trả' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DS_TRA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Nhận 1 trong 2 giá trị (0 hoặc 10000vnd)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'DS_TRA', @level2type=N'CONSTRAINT',@level2name=N'CK_CT_TRA_PHUPHI'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Căn cước công dân' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'COLUMN',@level2name=N'CCCD'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Họ tên' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'COLUMN',@level2name=N'HOTEN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Giới tính' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'COLUMN',@level2name=N'GIOITINH'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày sinh' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'COLUMN',@level2name=N'NGAYSINH'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Số điện thoại' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'COLUMN',@level2name=N'SDT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Email' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'COLUMN',@level2name=N'EMAIL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Địa chỉ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'COLUMN',@level2name=N'DIACHI'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Khách Hàng' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'EMAIL phải kết thúc bằng chuỗi @gmail,com' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'CONSTRAINT',@level2name=N'CK_KHACHHANG_EMAIL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày sinh của khách hàng không quá ngày nhập dữ liệu' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'KHACHHANG', @level2type=N'CONSTRAINT',@level2name=N'CK_KHACHHANG_NGAYSINH'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Mã nhà cung cấp' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHACC', @level2type=N'COLUMN',@level2name=N'MANCC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Tên nhà cung cấp' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHACC', @level2type=N'COLUMN',@level2name=N'TENNCC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Nhà cung cấp' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHACC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Căn cước công dân' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'CCCD'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'User ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'UID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Họ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'HO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Tên' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'TEN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Giới tính ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'GIOITINH'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày sinh' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'NGAYSINH'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Số điện thoại' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'SDT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Email' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'EMAIL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Địa chỉ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'COLUMN',@level2name=N'DIACHI'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Nhân Viên' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Email phải kết thúc bằng @gmail.com' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'CONSTRAINT',@level2name=N'CK_NHANVIEN_EMAIL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Ngày sinh nhân viên không quá ngày nhập ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'NHANVIEN', @level2type=N'CONSTRAINT',@level2name=N'CK_NHANVIEN_NGAYSINH'
GO
USE [master]
GO
ALTER DATABASE [DOAN_THUEBD] SET  READ_WRITE 
GO
