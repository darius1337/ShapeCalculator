-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 22, 2011 at 04:47 PM
-- Server version: 5.1.50
-- PHP Version: 5.3.8-ZS5.5.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `projektas`
--

-- --------------------------------------------------------

--
-- Table structure for table `coordinates`
--

CREATE TABLE IF NOT EXISTS `coordinates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `x1` double NOT NULL,
  `y1` double NOT NULL,
  `x2` double NOT NULL,
  `y2` double NOT NULL,
  `x3` double NOT NULL,
  `y3` double NOT NULL,
  `x4` double NOT NULL,
  `y4` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=222 ;

--
-- Dumping data for table `coordinates`
--

INSERT INTO `coordinates` (`id`, `x1`, `y1`, `x2`, `y2`, `x3`, `y3`, `x4`, `y4`) VALUES
(1, 1, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(2, 1.01, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(3, 1.02, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(4, 1.03, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(216, 1.11, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(217, 1.11, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(218, 1.11, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(219, 1.11, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(220, 1.11, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1),
(221, 1.11, 11.1, 1.2, 1.1, 4.1, 1.4, 1.5, 51.1);
