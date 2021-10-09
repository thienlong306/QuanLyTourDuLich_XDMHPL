-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 17, 2021 lúc 06:16 AM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `dulich`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tours`
--

CREATE TABLE `tours` (
  `tour_id` int(255) NOT NULL,
  `tour_ten` varchar(255) NOT NULL,
  `tour_mota` varchar(255) NOT NULL,
  `loai_id` varchar(255) NOT NULL,
  `gia_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tours`
--

INSERT INTO `tours` (`tour_id`, `tour_ten`, `tour_mota`, `loai_id`, `gia_id`) VALUES
(1, 'Vũng Tàu', 'Lòng vòng', 'VT', '250000'),
(15, 'Hồ Chí Mình', 'Lòng vòng', 'HCM', '200000'),
(16, 'Hà Nội', 'Lòng vòng', 'HN', '300000'),
(17, 'Ninh Thuận', 'Lòng vòng', 'NT', '400000'),
(19, 'Đà Lạt', 'Lòng vòng', 'ĐL', '100000'),
(20, 'Nghệ An', 'Lòng vòng', 'NA', '500000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour_chiphi`
--

CREATE TABLE `tour_chiphi` (
  `cp_id` int(255) NOT NULL,
  `doan_id` varchar(255) NOT NULL,
  `cp_chitiet` varchar(255) NOT NULL,
  `cp_gia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tour_chiphi`
--

INSERT INTO `tour_chiphi` (`cp_id`, `doan_id`, `cp_chitiet`, `cp_gia`) VALUES
(6, '11', 'Ăn Uống', '80000'),
(7, '13', 'Khách Sạn', '70000'),
(8, '15', 'Leo Núi', '60000'),
(10, '11', 'Xem Phim', '20000'),
(11, '16', 'Ngủ', '24000'),
(12, '18', 'Hát', '65000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour_diadiem`
--

CREATE TABLE `tour_diadiem` (
  `dd_id` int(255) NOT NULL,
  `tour_id` varchar(255) NOT NULL,
  `dd_ten` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tour_diadiem`
--

INSERT INTO `tour_diadiem` (`dd_id`, `tour_id`, `dd_ten`) VALUES
(2, '16', 'Hải Phòng'),
(3, '17', 'Huế'),
(4, '15', 'Quận 2'),
(5, '1', 'Quân 3');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour_doan`
--

CREATE TABLE `tour_doan` (
  `doan_id` int(255) NOT NULL,
  `tour_id` varchar(255) NOT NULL,
  `doan_ten` varchar(255) NOT NULL,
  `doan_khoihanh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tour_doan`
--

INSERT INTO `tour_doan` (`doan_id`, `tour_id`, `doan_ten`, `doan_khoihanh`) VALUES
(11, '15', 'Sam Sung', '2/1/1971'),
(13, '17', 'SPTK', '2/1/1971'),
(15, '16', 'Sony', '2/1/1973'),
(16, '15', 'Nokia', '2/1/1974'),
(18, '1', 'USA', '3/2/2021');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour_khachhang`
--

CREATE TABLE `tour_khachhang` (
  `kh_id` int(255) NOT NULL,
  `doan_id` varchar(255) NOT NULL,
  `kh_ten` varchar(255) NOT NULL,
  `kh_sdt` varchar(255) NOT NULL,
  `kh_cmnd` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tour_khachhang`
--

INSERT INTO `tour_khachhang` (`kh_id`, `doan_id`, `kh_ten`, `kh_sdt`, `kh_cmnd`) VALUES
(10, '11', 'Thái', '09115', '456'),
(11, '15', 'Huy', '09116', '789'),
(12, '13', 'Lan', '09016', '789'),
(13, '11', 'Long', '09015', '456'),
(14, '16', 'Hưng', '963', '0925'),
(15, '18', 'Linh', '753', '09123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour_nhanvien`
--

CREATE TABLE `tour_nhanvien` (
  `nv_id` int(255) NOT NULL,
  `doan_id` varchar(255) NOT NULL,
  `nv_ten` varchar(255) NOT NULL,
  `nv_sdt` varchar(255) NOT NULL,
  `nv_cmnd` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tour_nhanvien`
--

INSERT INTO `tour_nhanvien` (`nv_id`, `doan_id`, `nv_ten`, `nv_sdt`, `nv_cmnd`) VALUES
(2, '11', 'Hùng', '122', 'Lái xe'),
(3, '11', 'Hải', '123', 'Phục vụ'),
(4, '15', 'Long', '121', 'Hướng dẫn viên'),
(5, '13', 'Huy', '121', 'Lái xe'),
(7, '15', 'Lan', '125', 'Phục');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tours`
--
ALTER TABLE `tours`
  ADD PRIMARY KEY (`tour_id`);

--
-- Chỉ mục cho bảng `tour_chiphi`
--
ALTER TABLE `tour_chiphi`
  ADD PRIMARY KEY (`cp_id`),
  ADD KEY `doan_id` (`doan_id`);

--
-- Chỉ mục cho bảng `tour_diadiem`
--
ALTER TABLE `tour_diadiem`
  ADD PRIMARY KEY (`dd_id`),
  ADD KEY `tour_id` (`tour_id`);

--
-- Chỉ mục cho bảng `tour_doan`
--
ALTER TABLE `tour_doan`
  ADD PRIMARY KEY (`doan_id`),
  ADD KEY `tour_id` (`tour_id`);

--
-- Chỉ mục cho bảng `tour_khachhang`
--
ALTER TABLE `tour_khachhang`
  ADD PRIMARY KEY (`kh_id`),
  ADD KEY `doan_id` (`doan_id`);

--
-- Chỉ mục cho bảng `tour_nhanvien`
--
ALTER TABLE `tour_nhanvien`
  ADD PRIMARY KEY (`nv_id`),
  ADD KEY `doan_id` (`doan_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tours`
--
ALTER TABLE `tours`
  MODIFY `tour_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT cho bảng `tour_chiphi`
--
ALTER TABLE `tour_chiphi`
  MODIFY `cp_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT cho bảng `tour_diadiem`
--
ALTER TABLE `tour_diadiem`
  MODIFY `dd_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `tour_doan`
--
ALTER TABLE `tour_doan`
  MODIFY `doan_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT cho bảng `tour_khachhang`
--
ALTER TABLE `tour_khachhang`
  MODIFY `kh_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT cho bảng `tour_nhanvien`
--
ALTER TABLE `tour_nhanvien`
  MODIFY `nv_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
