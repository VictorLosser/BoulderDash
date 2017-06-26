-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Lun 26 Juin 2017 à 08:11
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `boulderdash`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllExamples` ()  NO SQL
SELECT id, name
FROM example$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleById` (IN `id` INT)  NO SQL
SELECT id, name
FROM example
WHERE example.id = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleByName` (IN `name` VARCHAR(255))  NO SQL
SELECT id, name
FROM example
WHERE example.name = name$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `example`
--

CREATE TABLE `example` (
  `id` int(11) NOT NULL,
  `name` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `example`
--

INSERT INTO `example` (`id`, `name`) VALUES
(1, '40 22\r\n150 100\r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 \r\n1 0 4 4 4 4 0 0 3 0 7 0 3 4 0 0 0 0 1 3 0 3 0 0 0 0 0 0 0 4 0 0 0 0 3 0 0 0 0 1 \r\n1 4 4 4 4 4 0 0 0 3 0 4 0 0 0 0 0 0 1 0 0 3 0 0 0 3 0 0 0 0 4 0 0 0 0 0 0 0 0 1 \r\n1 4 4 4 4 4 0 0 0 0 0 4 0 0 4 4 4 6 4 4 3 0 3 0 0 3 0 0 0 0 0 0 0 0 3 0 0 0 0 1 \r\n1 3 0 4 4 0 0 0 11 0 0 0 0 0 3 0 0 0 0 0 0 3 0 0 3 0 0 0 0 3 0 0 0 3 0 0 0 0 0 1 \r\n1 3 0 3 3 0 0 0 3 0 0 0 0 0 3 3 3 0 3 0 0 0 0 0 0 0 0 3 0 0 0 0 0 0 3 0 3 4 0 1 \r\n1 0 0 0 3 0 0 3 0 0 0 0 0 0 0 0 3 0 0 0 0 0 3 0 4 3 0 0 0 0 0 0 0 0 3 0 3 3 0 1 \r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 0 3 0 0 3 0 1 \r\n1 0 4 0 0 0 3 0 0 7 0 4 0 0 3 0 3 0 0 0 0 0 0 0 0 0 0 7 0 3 4 0 0 0 0 0 0 3 0 1 \r\n1 0 0 0 0 0 0 0 0 3 0 0 0 0 0 4 0 0 0 0 0 0 0 0 3 4 4 3 0 0 7 0 0 0 0 3 0 0 0 1 \r\n1 0 0 0 3 0 0 3 0 3 0 0 4 0 0 0 0 0 0 0 0 0 0 0 3 3 0 3 0 0 3 0 0 0 0 0 0 0 0 1 \r\n1 0 4 0 0 0 0 0 3 0 0 4 5 4 0 0 0 3 3 4 0 0 0 0 0 0 0 3 0 0 3 0 0 0 0 0 0 4 0 1 \r\n1 0 3 0 0 4 0 0 3 0 0 0 4 0 0 0 0 3 0 3 4 0 0 7 0 0 0 0 3 0 0 0 3 0 0 7 0 3 0 1 \r\n1 0 0 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 3 3 3 0 0 3 0 0 0 0 0 0 0 0 7 0 0 0 0 0 3 1 \r\n1 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 \r\n1 4 4 0 0 0 0 0 0 0 0 0 4 0 0 0 7 0 0 4 4 4 0 0 0 0 0 3 0 0 0 3 0 0 0 0 0 0 0 1 \r\n1 3 4 0 0 0 0 0 0 0 0 0 3 3 0 0 3 0 0 4 4 4 0 0 0 3 0 0 0 0 0 0 3 0 3 4 0 0 0 1 \r\n1 0 3 0 0 3 0 0 0 0 0 0 0 0 3 0 0 0 0 4 10 4 4 4 0 0 0 0 7 0 0 0 3 0 3 3 0 0 0 1 \r\n1 0 0 0 0 3 0 0 0 4 0 0 0 0 0 0 0 0 3 4 0 4 0 0 0 3 0 3 7 0 0 0 0 0 0 3 0 0 0 1 \r\n1 0 0 0 4 0 0 4 0 3 0 0 3 0 3 3 0 0 0 4 0 4 0 0 0 3 0 3 7 0 0 0 0 0 0 3 0 0 3 1 \r\n1 0 7 0 0 0 0 3 0 0 0 0 0 4 0 0 0 0 0 4 0 4 0 4 0 3 0 0 3 0 0 0 0 3 0 0 0 3 0 1 \r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1'),
(2, '40 22\r\n180 1210\r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1\r\n1 0 3 0 0 3 0 0 1 0 3 0 0 0 7 3 1 0 0 0 1 3 7 0 1 1 0 0 0 0 0 0 1 0 3 0 3 0 0 1\r\n1 0 0 0 0 0 0 0 1 0 0 0 0 0 0 3 1 0 0 0 4 0 0 0 1 1 0 0 0 1 0 0 0 0 0 0 0 1 7 1\r\n1 1 1 4 1 1 1 1 1 1 1 1 1 1 1 3 1 3 0 1 0 0 0 1 1 3 1 1 3 1 1 1 1 1 1 1 1 3 1 1\r\n1 7 0 0 0 0 0 0 1 0 3 0 0 0 0 3 0 0 3 0 0 0 0 0 0 0 0 4 0 0 3 0 0 0 0 0 7 3 0 1\r\n1 0 0 0 0 0 0 0 1 0 3 0 0 0 0 0 4 0 0 0 1 0 0 0 1 0 0 0 0 0 0 0 1 0 0 3 1 0 0 1\r\n1 1 1 4 1 1 1 1 1 1 1 1 4 1 1 0 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 4 0 1 1\r\n1 0 0 0 0 3 4 0 1 0 0 1 0 0 0 0 1 0 0 0 1 0 0 3 1 7 0 0 0 1 0 0 1 7 0 0 0 0 1 1\r\n1 0 0 0 0 0 0 0 4 0 0 4 0 0 0 0 1 0 0 0 0 0 0 0 1 0 0 0 0 3 0 1 1 0 0 0 0 0 3 1\r\n1 1 1 1 1 1 1 1 1 1 1 3 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 3 1 1 1 1 1 1 1 4 3 1\r\n1 3 0 0 3 0 0 0 1 0 0 0 0 3 0 0 1 0 0 3 1 0 0 0 0 0 4 3 4 0 0 7 1 1 0 0 0 0 0 1\r\n1 3 0 0 0 0 3 0 4 0 0 3 0 0 3 0 1 0 0 0 1 0 1 1 1 0 4 0 4 0 0 0 4 3 0 0 0 3 0 1\r\n1 0 3 0 0 0 0 0 1 0 0 0 3 0 0 0 1 0 0 0 0 0 3 3 1 0 0 5 0 0 0 0 1 0 0 0 0 0 0 1\r\n1 1 0 0 1 1 1 1 1 1 1 1 1 1 4 4 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 4 1 1 1 1 4 1 1 1\r\n1 3 0 4 3 4 0 0 1 0 0 0 0 3 0 3 1 7 0 0 1 3 0 0 4 0 3 7 0 0 3 0 1 0 0 0 0 0 0 1\r\n1 0 0 0 0 0 4 0 1 4 0 0 0 0 0 0 1 0 0 4 1 0 0 0 1 0 0 0 4 0 0 0 1 0 4 0 4 4 0 1\r\n1 1 1 1 1 1 4 4 1 4 1 1 1 1 1 1 1 1 1 7 1 4 1 1 1 1 1 0 0 1 1 1 1 1 3 1 3 3 1 1\r\n1 4 0 0 0 0 0 0 1 4 0 0 0 0 3 0 1 0 3 0 1 0 0 3 1 0 3 0 3 0 0 0 1 0 0 0 0 0 0 1\r\n1 0 0 4 4 0 3 0 1 3 0 0 7 0 0 0 1 0 0 0 1 1 0 0 1 0 0 0 3 0 0 0 4 0 3 0 0 1 1 1\r\n1 0 4 4 4 4 3 4 1 0 0 1 0 0 0 0 1 0 8 7 3 3 0 0 1 0 1 3 0 0 0 0 1 0 0 0 3 3 3 1\r\n1 0 3 4 4 0 0 3 1 0 0 3 0 0 3 0 1 0 9 0 3 0 0 0 1 0 0 0 0 3 0 3 1 0 0 0 0 3 0 1\r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 '),
(3, '40 22\r\n750 900\r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 \r\n1 0 0 3 0 3 0 0 3 0 0 3 4 3 0 7 0 0 3 0 0 4 0 0 3 0 0 3 0 0 0 0 3 3 0 3 0 3 3 1 \r\n1 0 0 0 0 0 0 3 3 3 0 3 0 0 0 0 0 3 0 3 0 3 0 0 4 0 0 0 3 0 0 0 0 3 0 0 0 3 0 1 \r\n1 0 0 0 0 0 0 3 3 3 0 3 0 0 3 3 4 0 0 3 0 3 0 0 0 0 3 0 3 4 3 3 0 0 0 7 0 0 3 1 \r\n1 3 3 0 3 0 0 0 3 3 3 3 0 0 3 0 4 0 0 0 4 0 0 3 3 0 0 0 0 3 3 0 3 0 0 4 3 3 0 1 \r\n1 3 0 7 3 0 0 0 0 0 0 0 0 0 3 0 0 4 0 3 0 0 0 0 3 0 0 0 0 0 0 3 0 0 3 3 0 3 0 1 \r\n1 0 0 0 3 3 0 3 0 4 0 0 0 3 0 0 3 3 0 0 0 3 3 0 3 0 3 3 0 4 3 3 0 0 3 3 0 3 0 1 \r\n1 3 0 0 3 3 0 3 3 7 0 0 0 4 4 3 3 3 0 3 0 0 4 3 0 3 0 0 3 4 3 3 0 0 0 0 0 0 3 1 \r\n1 0 3 0 0 1 1 1 1 1 1 1 4 1 1 1 1 1 1 3 3 3 3 0 3 1 1 1 1 1 1 4 1 1 1 1 1 1 3 1 \r\n1 0 4 0 0 1 7 4 4 4 4 4 4 4 4 4 4 1 0 0 0 0 3 3 0 1 4 4 4 4 4 4 4 4 4 4 4 1 3 1 \r\n1 0 0 0 3 1 4 0 0 4 4 4 4 4 4 4 4 1 3 0 0 0 3 3 0 1 4 4 4 4 4 4 4 4 4 4 4 1 3 1 \r\n1 0 0 3 0 1 4 4 4 4 4 4 4 4 4 4 4 1 3 4 0 0 0 0 3 1 4 4 4 4 10 4 4 4 4 4 4 1 3 1 \r\n1 0 0 3 0 1 4 4 4 0 4 4 4 4 4 4 4 1 0 0 0 0 3 0 3 1 4 4 4 4 4 4 4 4 4 4 4 1 0 1 \r\n1 3 0 0 0 1 4 4 4 11 4 4 4 4 4 4 4 4 0 3 0 0 4 0 3 1 4 4 4 4 4 4 4 4 4 4 4 1 0 1 \r\n1 3 0 0 3 1 4 4 4 4 4 4 4 4 4 4 4 1 0 3 3 7 0 3 3 1 4 4 4 4 5 4 4 4 4 4 4 1 3 1 \r\n1 0 4 0 0 1 4 4 4 4 4 4 4 4 4 4 4 1 4 3 0 3 3 0 3 1 4 4 4 4 4 4 4 4 4 4 4 1 3 1 \r\n1 0 0 0 0 1 4 4 4 4 4 4 4 4 4 4 4 1 1 1 1 1 1 1 1 1 4 4 4 4 4 4 4 4 4 4 4 1 3 1 \r\n1 0 0 3 0 1 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 1 3 1 \r\n1 0 3 3 0 1 4 4 4 4 4 4 4 4 4 4 4 1 0 0 4 3 0 3 0 1 4 4 4 4 4 4 4 4 4 4 4 1 3 1 \r\n1 0 0 3 0 1 4 4 4 4 4 4 7 4 4 6 4 1 3 3 3 0 3 0 0 1 4 4 4 4 4 4 7 4 4 4 4 1 3 1 \r\n1 7 0 0 4 1 1 1 1 1 1 1 1 1 1 1 1 1 0 3 3 3 0 7 0 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 \r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 '),
(4, '40 22\r\n1250 560\r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 \r\n1 0 0 0 0 0 0 0 3 3 3 3 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 9 0 1 \r\n1 0 0 0 0 0 0 0 3 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 8 0 1 \r\n1 0 0 7 7 7 0 0 3 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 \r\n1 0 0 7 7 7 0 0 3 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 \r\n1 0 0 0 0 0 0 0 3 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 \r\n1 0 0 0 0 0 0 0 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 1 1 1 1 1 1 1 1 1 0 1 \r\n1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 0 1 \r\n1 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 0 0 0 4 4 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 3 1 \r\n1 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 0 0 4 4 4 4 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 3 1 \r\n1 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 0 4 4 4 4 4 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 3 1 \r\n1 4 4 6 4 4 4 4 0 0 0 0 0 0 0 0 0 0 0 4 4 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 3 1 \r\n1 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 3 1 \r\n1 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 3 1 \r\n1 4 4 4 4 5 4 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 3 1 \r\n1 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 3 3 3 3 3 3 3 3 3 1 \r\n1 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 4 4 4 4 4 4 4 4 0 0 0 0 0 0 0 0 1 \r\n1 4 4 4 4 4 4 4 0 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 11 4 4 4 4 0 0 0 0 0 0 0 0 1 \r\n1 4 4 4 4 4 4 4 0 4 4 4 4 4 4 4 4 4 4 10 4 4 4 4 4 4 4 4 4 4 4 0 0 0 0 7 7 0 0 1 \r\n1 0 0 0 0 0 0 0 0 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 0 0 0 0 7 7 0 0 1 \r\n1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 \r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1'),
(5, '40 22\r\n1600 400\r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 \r\n1 3 0 1 1 0 1 3 3 0 1 0 0 0 3 1 3 0 0 3 0 0 0 0 1 0 0 0 3 0 0 0 0 0 3 1 0 7 0 1 \r\n1 0 0 8 1 0 4 0 3 0 0 0 0 0 1 1 1 0 0 1 0 3 0 0 0 0 3 0 0 3 0 3 0 0 0 1 0 1 3 1 \r\n1 0 0 0 0 1 0 0 3 4 0 0 3 0 0 0 0 1 0 0 0 0 0 3 0 1 1 3 0 0 0 0 0 0 0 1 0 1 1 1 \r\n1 7 0 1 0 10 1 3 1 3 0 0 3 0 0 0 0 1 0 0 0 3 0 0 0 0 0 0 3 0 3 3 0 0 0 0 0 0 1 1 \r\n1 3 0 1 0 0 0 1 0 0 3 0 1 1 0 0 3 0 1 1 7 0 5 0 0 4 4 4 3 0 3 3 0 0 0 0 0 0 1 1 \r\n1 3 3 0 0 3 0 0 0 0 1 0 0 0 3 0 0 0 0 0 0 3 0 3 3 4 4 4 0 0 0 3 0 0 4 1 1 0 0 1 \r\n1 0 0 3 0 1 1 0 0 3 0 3 3 0 0 0 1 0 0 0 0 3 0 3 3 4 4 4 0 0 0 1 0 0 0 0 1 0 3 1 \r\n1 0 0 1 0 0 0 7 0 0 0 0 0 0 4 0 3 0 0 1 1 3 0 0 3 0 1 0 1 3 0 0 1 3 0 0 7 0 3 1 \r\n1 3 0 3 0 0 0 0 1 0 1 1 0 11 4 0 3 0 0 1 1 3 0 0 3 0 0 0 0 1 0 0 0 1 0 0 3 0 1 1 \r\n1 0 3 0 1 1 0 0 0 0 0 3 3 1 3 0 0 4 0 1 0 1 3 0 0 1 3 0 0 0 1 3 0 0 4 0 3 0 0 1 \r\n1 1 0 1 1 0 0 0 0 0 0 3 3 1 3 0 0 3 0 1 0 1 1 0 0 0 1 0 0 3 0 1 1 0 0 3 0 0 0 1 \r\n1 0 1 0 3 0 0 0 1 0 0 0 1 1 3 0 0 3 0 0 0 0 1 0 0 0 3 0 0 0 0 0 1 1 0 3 0 0 0 1 \r\n1 0 1 0 3 0 0 0 1 0 4 0 1 0 1 3 0 0 1 3 0 0 0 0 3 0 0 3 0 3 3 0 0 0 0 1 0 0 0 1 \r\n1 1 0 0 1 3 1 3 0 0 3 0 0 0 0 1 0 0 0 7 0 0 0 1 0 3 1 0 0 0 0 0 0 1 0 1 1 0 7 1 \r\n1 1 0 0 0 1 1 3 0 0 1 0 0 0 0 0 1 3 0 0 3 0 3 0 0 0 3 0 1 3 0 0 0 0 0 0 1 0 0 1 \r\n1 1 0 7 0 0 6 0 3 0 1 1 0 0 0 0 1 1 3 0 0 0 0 0 0 0 3 0 1 3 0 0 0 0 0 0 1 0 0 1 \r\n1 0 0 3 0 0 0 0 1 0 0 0 3 0 0 0 0 0 0 3 0 3 3 0 0 0 0 0 0 1 0 0 3 0 1 0 0 0 1 1 \r\n1 3 0 1 1 0 0 3 0 1 1 0 0 0 1 0 0 0 0 3 0 3 3 0 0 0 0 0 0 1 0 0 3 4 0 0 3 0 9 1 \r\n1 1 0 0 0 3 0 0 0 0 0 0 3 0 3 4 0 0 0 0 0 0 3 0 0 0 1 1 0 0 1 3 0 0 4 0 1 0 0 1 \r\n1 3 3 0 0 0 1 0 0 0 0 0 3 0 3 7 0 0 0 0 0 0 1 0 0 3 0 1 7 0 4 0 3 1 0 3 0 0 0 1 \r\n1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `example`
--
ALTER TABLE `example`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `example`
--
ALTER TABLE `example`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
