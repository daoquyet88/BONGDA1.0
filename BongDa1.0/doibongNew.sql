-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2019 at 01:54 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbbongda2`
--

-- --------------------------------------------------------

--
-- Table structure for table `doibong`
--

CREATE TABLE `doibong` (
  `MaDoiBong` int(11) NOT NULL,
  `TenDoiBong` varchar(200) NOT NULL,
  `HinhAnh` varchar(200) DEFAULT NULL,
  `HuanLuanVien` varchar(200) NOT NULL,
  `NgaySinh` varchar(200) DEFAULT NULL,
  `SanNha` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doibong`
--

INSERT INTO `doibong` (`MaDoiBong`, `TenDoiBong`, `HinhAnh`, `HuanLuanVien`, `NgaySinh`, `SanNha`) VALUES
(2, 'A', ' ', 'A', ' ', 'A');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doibong`
--
ALTER TABLE `doibong`
  ADD PRIMARY KEY (`MaDoiBong`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doibong`
--
ALTER TABLE `doibong`
  MODIFY `MaDoiBong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
