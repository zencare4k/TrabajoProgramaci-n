-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-05-2024 a las 13:34:13
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inadex`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `Nombre_E` varchar(50) DEFAULT NULL,
  `Id_E` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`Nombre_E`, `Id_E`) VALUES
('Royal_Academy', '1'),
('Zeus', '10'),
('Kirkwood', '11'),
('Occult', '12'),
('Inazuma_Kids_FC', '13'),
('Raimon', '2'),
('Wild', '3'),
('Farm', '4'),
('Otaku', '5'),
('RaimonOG', '6'),
('Shuriken', '7'),
('Sallys_Street', '8'),
('Umbrella', '9');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `Id_J` varchar(50) DEFAULT NULL,
  `Nombre_J` varchar(50) DEFAULT NULL,
  `PT` int(11) DEFAULT NULL,
  `PE` int(11) DEFAULT NULL,
  `Tiro` int(11) DEFAULT NULL,
  `Aguante` int(11) DEFAULT NULL,
  `Fisico` int(11) DEFAULT NULL,
  `Control` int(11) DEFAULT NULL,
  `Defensa` int(11) DEFAULT NULL,
  `Rapidez` int(11) DEFAULT NULL,
  `Valor` int(11) DEFAULT NULL,
  `Elemento` varchar(50) DEFAULT NULL,
  `Posicion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`Id_J`, `Nombre_J`, `PT`, `PE`, `Tiro`, `Aguante`, `Fisico`, `Control`, `Defensa`, `Rapidez`, `Valor`, `Elemento`, `Posicion`) VALUES
('1', 'Feldt', 177, 206, 75, 78, 69, 68, 76, 75, 76, 'Bosque', 'GK'),
('2', 'Under', 115, 121, 44, 42, 40, 40, 69, 48, 70, 'Bosque', 'GK'),
('3', 'Waters', 101, 151, 52, 54, 48, 51, 52, 45, 45, 'Bosque', 'DF'),
('4', 'Good', 117, 134, 44, 48, 44, 48, 55, 44, 45, 'Bosque', 'DF'),
('5', 'Stronger', 121, 145, 44, 52, 46, 46, 52, 47, 52, 'Fuego', 'DF'),
('6', 'Marvel', 108, 143, 44, 50, 53, 52, 48, 49, 51, 'Montaña', 'DF'),
('7', 'Leading', 112, 140, 52, 52, 52, 44, 47, 50, 48, 'Aire', 'DF'),
('8', 'Stiller', 117, 134, 53, 46, 45, 47, 52, 44, 53, 'Aire', 'MF'),
('9', 'Oughtry', 113, 127, 55, 44, 52, 45, 45, 46, 48, 'Montaña', 'MF'),
('10', 'Tell', 109, 145, 44, 44, 53, 48, 46, 45, 47, 'Bosque', 'MF'),
('11', 'Rock', 112, 149, 51, 47, 46, 46, 48, 48, 52, 'Fuego', 'MF'),
('12', 'Kind', 109, 134, 49, 53, 53, 48, 51, 48, 46, 'Bosque', 'MF'),
('13', 'Buster', 113, 125, 55, 50, 46, 52, 49, 48, 49, 'Fuego', 'MF'),
('14', 'Mooney', 101, 138, 53, 53, 49, 54, 50, 55, 46, 'Fuego', 'FW'),
('15', 'Seller', 113, 132, 55, 45, 50, 50, 49, 55, 46, 'Aire', 'FW'),
('16', 'Turner', 108, 121, 48, 50, 48, 52, 52, 44, 45, 'Fuego', 'FW'),
('17', 'Greeny', 109, 169, 50, 64, 53, 60, 73, 53, 77, 'Fuego', 'GK'),
('18', 'Mower', 164, 189, 46, 61, 56, 41, 72, 62, 60, 'Montaña', 'GK'),
('19', 'Sherman', 116, 176, 49, 70, 60, 62, 79, 52, 56, 'Fuego', 'DF'),
('20', 'Hillvalley', 108, 187, 40, 66, 56, 52, 79, 63, 53, 'Montaña', 'DF'),
('21', 'Lively', 116, 182, 47, 63, 57, 44, 73, 56, 54, 'Bosque', 'DF'),
('22', 'Hayseed', 128, 193, 42, 68, 56, 52, 77, 58, 61, 'Montaña', 'DF'),
('23', 'Grower', 113, 187, 53, 68, 53, 44, 76, 61, 61, 'Montaña', 'DF'),
('24', 'Nevis', 120, 195, 52, 64, 56, 51, 70, 59, 53, 'Aire', 'DF'),
('25', 'Work', 109, 171, 44, 65, 57, 54, 70, 54, 60, 'Bosque', 'DF'),
('26', 'Howells', 117, 171, 48, 60, 62, 54, 75, 54, 56, 'Aire', 'DF'),
('27', 'Milky', 100, 178, 40, 63, 54, 54, 68, 56, 56, 'Montaña', 'MF'),
('28', 'Dawson', 108, 187, 57, 66, 55, 56, 75, 64, 76, 'Aire', 'MF'),
('29', 'Spray', 125, 169, 71, 66, 70, 46, 72, 62, 71, 'Fuego', 'MF'),
('30', 'Mother', 116, 180, 42, 60, 55, 63, 76, 53, 55, 'Bosque', 'MF'),
('31', 'Roast', 104, 193, 63, 61, 58, 52, 73, 71, 70, 'Montaña', 'MF'),
('32', 'Muffs', 101, 165, 56, 63, 62, 62, 74, 66, 72, 'Bosque', 'FW'),
('33', 'Herman Muller', 109, 143, 40, 46, 50, 44, 47, 44, 45, 'Aire', 'GK'),
('34', 'Bart Grantham', 180, 101, 38, 29, 35, 29, 66, 28, 64, 'Bosque', 'GK'),
('35', 'Izzy Island', 65, 136, 42, 48, 40, 48, 41, 41, 44, 'Bosque', 'DF'),
('36', 'Robert Silver', 73, 125, 46, 48, 41, 51, 44, 41, 44, 'Aire', 'DF'),
('37', 'Sothern Newman', 60, 127, 45, 49, 44, 48, 60, 43, 47, 'Montaña', 'DF'),
('38', 'Keth Claus', 84, 112, 41, 40, 41, 48, 40, 60, 46, 'Aire', 'DF'),
('39', 'Irwin Hall', 69, 162, 40, 40, 48, 51, 43, 41, 41, 'Bosque', 'MF'),
('40', 'Mitch Grumble', 65, 110, 48, 46, 48, 43, 48, 40, 41, 'Aire', 'MF'),
('41', 'Taylor Higgins', 65, 134, 44, 48, 43, 50, 48, 40, 40, 'Aire', 'MF'),
('42', 'Michael Riverside', 77, 138, 51, 43, 46, 50, 49, 40, 48, 'Montaña', 'MF'),
('43', 'Jamie Cool', 76, 162, 47, 52, 40, 44, 48, 52, 51, 'Aire', 'MF'),
('44', 'Karl Blue', 76, 114, 46, 46, 48, 47, 44, 51, 48, 'Montaña', 'MF'),
('45', 'Theakston Plank', 80, 121, 48, 41, 50, 42, 45, 58, 51, 'Aire', 'FW'),
('46', 'Hans Randall', 65, 169, 64, 56, 40, 40, 51, 48, 44, 'Fuego', 'FW'),
('47', 'Ken Cake', 88, 123, 49, 49, 40, 40, 40, 51, 46, 'Montaña', 'FW'),
('48', 'Maddie Moonlight', 148, 167, 44, 40, 40, 60, 42, 51, 46, 'Bosque', 'FW'),
('49', 'Mask', 156, 165, 58, 60, 56, 70, 68, 56, 68, 'Aire', 'GK'),
('50', 'Zombie', 156, 200, 47, 74, 46, 50, 40, 51, 56, 'Montaña', 'GK'),
('51', 'Styx', 137, 140, 60, 65, 53, 60, 52, 63, 58, 'Bosque', 'DF'),
('52', 'Franky', 156, 151, 55, 61, 59, 47, 70, 52, 48, 'Montaña', 'DF'),
('53', 'Undead', 132, 187, 52, 79, 58, 56, 61, 56, 53, 'Fuego', 'DF'),
('54', 'Creepy', 152, 151, 52, 54, 54, 57, 57, 60, 63, 'Aire', 'DF'),
('55', 'Jiangshi', 136, 145, 55, 61, 62, 60, 52, 56, 62, 'Aire', 'MF'),
('56', 'Mummy', 137, 187, 54, 75, 52, 60, 52, 62, 61, 'Bosque', 'MF'),
('57', 'Grave', 144, 180, 57, 56, 65, 60, 52, 71, 55, 'Fuego', 'MF'),
('58', 'Wolfy', 153, 211, 61, 69, 70, 77, 52, 79, 67, 'Fuego', 'MF'),
('59', 'Ghost', 100, 143, 55, 56, 50, 54, 44, 48, 54, 'Bosque', 'MF'),
('60', 'Blood', 152, 184, 68, 62, 52, 52, 51, 56, 60, 'Montaña', 'MF'),
('61', 'Dollman', 104, 129, 52, 53, 53, 45, 48, 49, 55, 'Bosque', 'FW'),
('62', 'Noir', 120, 121, 52, 58, 45, 48, 52, 52, 45, 'Bosque', 'FW'),
('63', 'Alien', 112, 149, 48, 55, 51, 51, 50, 48, 44, 'Aire', 'FW'),
('64', 'Talisman', 165, 171, 62, 62, 64, 56, 48, 60, 63, 'Bosque', 'FW'),
('65', 'Idol', 161, 165, 60, 45, 58, 54, 55, 58, 67, 'Montaña', 'GK'),
('66', 'Eldorado', 144, 158, 49, 28, 63, 61, 69, 43, 49, 'Fuego', 'GK'),
('67', 'Train', 152, 149, 61, 41, 60, 53, 56, 52, 54, 'Fuego', 'DF'),
('68', 'Vox', 144, 162, 48, 50, 55, 57, 51, 44, 47, 'Viento', 'DF'),
('69', 'Cosplay', 152, 149, 59, 40, 52, 56, 58, 56, 62, 'Montaña', 'DF'),
('70', 'Formby', 137, 158, 54, 48, 58, 61, 45, 46, 51, 'Montaña', 'DF'),
('71', 'Net', 141, 143, 44, 51, 62, 54, 48, 44, 49, 'Bosque', 'DF'),
('72', 'Hero', 132, 158, 62, 50, 62, 61, 55, 56, 71, 'Fuego', 'MF'),
('73', 'Signalman', 137, 151, 54, 48, 56, 55, 52, 53, 59, 'Viento', 'MF'),
('74', 'Robot', 137, 167, 60, 41, 60, 52, 58, 54, 66, 'Viento', 'MF'),
('75', 'Novel', 164, 154, 60, 44, 55, 56, 58, 61, 61, 'Bosque', 'MF'),
('76', 'Online', 133, 158, 54, 44, 56, 56, 62, 55, 60, 'Bosque', 'FW'),
('77', 'Custom', 152, 171, 58, 47, 62, 52, 61, 54, 59, 'Viento', 'FW'),
('78', 'Gamer', 137, 173, 58, 45, 60, 59, 52, 55, 69, 'Fuego', 'FW'),
('79', 'Artist', 149, 143, 52, 51, 56, 58, 63, 53, 64, 'Viento', 'FW'),
('80', 'Arcade', 152, 147, 57, 47, 57, 55, 56, 52, 60, 'Bosque', 'FW'),
('81', 'Mark Evans', 184, 191, 72, 69, 72, 70, 77, 68, 79, 'Montaña', 'GK'),
('82', 'Jack Wallside', 165, 206, 62, 54, 68, 62, 66, 49, 54, 'Montaña', 'DF'),
('83', 'Jim Wraith', 140, 195, 58, 62, 53, 75, 59, 53, 60, 'Bosque', 'DF'),
('84', 'Bobby Shearer', 176, 202, 76, 72, 61, 72, 76, 60, 72, 'Bosque', 'DF'),
('85', 'Tod Ironside', 161, 184, 54, 56, 55, 53, 56, 59, 65, 'Fuego', 'DF'),
('86', 'Nathan Swift', 156, 169, 64, 58, 58, 68, 54, 76, 56, 'Aire', 'DF'),
('87', 'Steve Grim', 144, 154, 62, 71, 64, 71, 64, 71, 71, 'Aire', 'MF'),
('88', 'Tim Saunders', 149, 156, 63, 48, 76, 61, 60, 55, 58, 'Bosque', 'MF'),
('89', 'Sam Kincaid', 136, 167, 71, 56, 57, 56, 56, 52, 76, 'Fuego', 'MF'),
('90', 'Jude Sharp', 180, 191, 63, 76, 79, 79, 79, 76, 68, 'Aire', 'MF'),
('91', 'Maxwell Carson', 160, 156, 60, 56, 56, 78, 64, 60, 62, 'Aire', 'FW'),
('92', 'Kevin Dragonfly', 144, 195, 71, 64, 60, 59, 61, 60, 70, 'Bosque', 'FW'),
('93', 'Axel Blaze', 176, 200, 79, 68, 66, 76, 64, 72, 60, 'Fuego', 'FW'),
('94', 'William Glass', 168, 147, 56, 53, 51, 68, 57, 56, 60, 'Bosque', 'FW'),
('95', 'Hairtown', 173, 202, 70, 60, 65, 65, 62, 73, 71, 'Aire', 'DF'),
('96', 'Steaky', 173, 193, 62, 67, 75, 78, 68, 68, 68, 'Montaña', 'DF'),
('97', 'MacHines', 173, 213, 68, 68, 68, 75, 71, 76, 73, 'Fuego', 'DF'),
('98', 'Foreman', 149, 193, 76, 72, 72, 64, 64, 68, 70, 'Montaña', 'MF'),
('99', 'Butler', 184, 215, 72, 69, 71, 69, 70, 74, 78, 'Bosque', 'MF'),
('100', 'Nathaniel', 172, 209, 64, 66, 73, 73, 75, 71, 65, 'Bosque', 'MF'),
('101', 'Suffolk', 172, 209, 71, 68, 68, 70, 69, 77, 68, 'Fuego', 'MF'),
('102', 'Tailor', 197, 200, 73, 72, 72, 76, 76, 79, 70, 'Montaña', 'MF'),
('103', 'Gladstone', 177, 187, 68, 63, 66, 68, 60, 72, 69, 'Fuego', 'MF'),
('104', 'Heart', 181, 209, 60, 65, 62, 66, 63, 72, 64, 'Aire', 'FW'),
('105', 'Poe', 173, 217, 64, 64, 68, 79, 70, 69, 69, 'Bosque', 'FW'),
('106', 'Barista', 189, 191, 62, 72, 72, 72, 76, 65, 65, 'Aire', 'FW'),
('107', 'Builder', 173, 195, 69, 77, 69, 64, 60, 63, 64, 'Fuego', 'FW'),
('108', 'Hillman', 300, 285, 79, 94, 74, 69, 79, 74, 99, 'Montaña', 'GK'),
('109', 'Island', 240, 240, 79, 79, 89, 99, 94, 79, 74, 'Bosque', 'DF'),
('110', 'Sweet', 255, 300, 99, 99, 99, 69, 79, 69, 79, 'Montaña', 'DF'),
('111', 'Joe King', 153, 200, 72, 74, 75, 69, 72, 55, 60, 'Fuego', 'GK'),
('112', 'Bob Carlton', 170, 147, 58, 62, 55, 63, 54, 45, 70, 'Bosque', 'GK'),
('113', 'Peter Drent', 144, 165, 71, 59, 54, 67, 64, 44, 62, 'Montaña', 'DF'),
('114', 'Ben Simmons', 169, 191, 68, 70, 63, 72, 60, 69, 69, 'Bosque', 'DF'),
('115', 'Gus Martin', 149, 189, 76, 66, 67, 73, 67, 63, 63, 'Bosque', 'DF'),
('116', 'Alan Master', 168, 165, 64, 62, 64, 72, 69, 64, 66, 'Aire', 'MF'),
('117', 'John Bloom', 153, 195, 61, 54, 71, 67, 70, 71, 62, 'Fuego', 'MF'),
('118', 'Derek Swing', 184, 171, 70, 60, 56, 76, 59, 69, 61, 'Aire', 'MF'),
('119', 'Herman Waldon', 188, 189, 76, 57, 64, 72, 79, 70, 69, 'Aire', 'MF'),
('120', 'Barry Potts', 136, 171, 53, 60, 52, 54, 56, 52, 44, 'Aire', 'MF'),
('121', 'Cliff Tomlinson', 157, 149, 53, 52, 60, 52, 61, 54, 53, 'Aire', 'FW'),
('122', 'Steve Ingham', 133, 169, 61, 54, 53, 57, 52, 47, 46, 'Montaña', 'FW'),
('123', 'Jim Lawrenson', 137, 167, 54, 56, 57, 57, 63, 53, 55, 'Aire', 'FW'),
('124', 'David Samford', 193, 193, 70, 67, 60, 78, 66, 66, 71, 'Bosque', 'FW'),
('125', 'Daniel Hatch', 133, 184, 75, 61, 69, 68, 68, 78, 64, 'Bosque', 'FW'),
('126', 'Hood', 164, 167, 53, 55, 59, 44, 64, 52, 62, 'Bosque', 'GK'),
('127', 'Castle', 132, 156, 53, 52, 60, 52, 68, 52, 52, 'Aire', 'GK'),
('128', 'Bandit', 149, 151, 54, 58, 53, 57, 56, 55, 63, 'Fuego', 'DF'),
('129', 'Crackshot', 129, 169, 62, 60, 61, 56, 60, 55, 63, 'Montaña', 'DF'),
('130', 'Hopper', 136, 145, 52, 61, 58, 62, 62, 55, 54, 'Montaña', 'DF'),
('131', 'Hillfort', 141, 147, 55, 63, 62, 60, 53, 54, 61, 'Aire', 'DF'),
('132', 'Thunder', 153, 145, 63, 57, 60, 63, 62, 54, 60, 'Montaña', 'DF'),
('133', 'Cleats', 140, 176, 56, 68, 61, 53, 56, 69, 59, 'Aire', 'MF'),
('134', 'Spook', 132, 165, 56, 55, 56, 52, 63, 64, 62, 'Aire', 'MF'),
('135', 'Trops', 144, 145, 58, 57, 61, 69, 55, 59, 54, 'Bosque', 'MF'),
('136', 'Star', 133, 156, 53, 65, 63, 59, 56, 47, 60, 'Aire', 'MF'),
('137', 'Hattori', 140, 160, 60, 60, 55, 59, 44, 60, 56, 'Bosque', 'MF'),
('138', 'Code', 152, 176, 60, 68, 56, 60, 57, 54, 61, 'Montaña', 'MF'),
('139', 'Samurai', 176, 160, 60, 60, 60, 60, 60, 56, 53, 'Bosque', 'FW'),
('140', 'Ronin', 137, 171, 62, 54, 56, 56, 53, 60, 57, 'Aire', 'FW'),
('141', 'Cloak', 180, 180, 52, 68, 61, 61, 54, 60, 55, 'Fuego', 'FW'),
('142', 'Yuma', 80, 129, 44, 46, 44, 43, 56, 49, 45, 'Montaña', 'GK'),
('143', 'Holmes', 174, 81, 34, 31, 28, 34, 64, 39, 77, 'Bosque', 'GK'),
('144', 'Daltry', 60, 114, 44, 40, 45, 49, 51, 49, 43, 'Bosque', 'DF'),
('145', 'Lovely', 85, 138, 49, 51, 44, 44, 44, 44, 44, 'Aire', 'DF'),
('146', 'Fielding', 81, 121, 44, 44, 49, 48, 51, 48, 40, 'Bosque', 'DF'),
('147', 'Knuckles', 72, 136, 60, 48, 52, 51, 41, 41, 49, 'Fuego', 'DF'),
('148', 'Crumb', 72, 121, 40, 48, 44, 44, 43, 44, 45, 'Montaña', 'DF'),
('149', 'Stager', 81, 129, 40, 50, 49, 44, 51, 49, 51, 'Bosque', 'DF'),
('150', 'Sheldon', 84, 127, 42, 40, 48, 45, 53, 42, 43, 'Montaña', 'DF'),
('151', 'Squirrel', 137, 129, 43, 45, 44, 50, 45, 47, 44, 'Aire', 'MF'),
('152', 'Sandstone', 61, 125, 54, 46, 58, 41, 48, 45, 51, 'Fuego', 'MF'),
('153', 'Riversong', 61, 121, 40, 42, 50, 50, 48, 40, 47, 'Montaña', 'MF'),
('154', 'Prentice', 73, 116, 46, 48, 46, 56, 44, 42, 49, 'Montaña', 'FW'),
('155', 'Baughan', 68, 116, 45, 51, 41, 46, 48, 40, 44, 'Aire', 'FW'),
('156', 'Ingram', 113, 149, 44, 57, 71, 52, 74, 47, 78, 'Fuego', 'GK'),
('157', 'Banker', 122, 138, 50, 45, 45, 51, 63, 50, 75, 'Aire', 'GK'),
('158', 'Sefton', 109, 151, 53, 54, 49, 61, 54, 67, 55, 'Aire', 'DF'),
('159', 'Caperock', 113, 140, 54, 48, 50, 46, 45, 58, 53, 'Aire', 'DF'),
('160', 'Strike', 109, 132, 48, 51, 50, 64, 47, 56, 53, 'Fuego', 'DF'),
('161', 'Chops', 120, 136, 62, 55, 63, 55, 44, 53, 49, 'Bosque', 'DF'),
('162', 'Mildford', 112, 145, 45, 52, 56, 44, 60, 44, 46, 'Montaña', 'DF'),
('163', 'Molehill', 113, 123, 53, 49, 48, 68, 48, 55, 46, 'Aire', 'DF'),
('164', 'Most', 165, 191, 65, 61, 60, 60, 68, 63, 64, 'Montaña', 'DF'),
('165', 'Chaney', 121, 136, 46, 48, 48, 48, 45, 66, 49, 'Bosque', 'MF'),
('166', 'Rhymes', 140, 140, 47, 45, 48, 52, 53, 46, 48, 'Aire', 'MF'),
('167', 'Tunk', 109, 145, 55, 47, 53, 44, 62, 55, 54, 'Fuego', 'MF'),
('168', 'Morefield', 129, 167, 59, 52, 56, 58, 52, 48, 72, 'Aire', 'MF'),
('169', 'Scott', 109, 129, 44, 52, 52, 47, 50, 55, 44, 'Bosque', 'MF'),
('170', 'Cyborg', 165, 123, 49, 56, 55, 63, 51, 51, 65, 'Bosque', 'FW'),
('171', 'Boar', 100, 217, 68, 62, 44, 44, 69, 60, 69, 'Fuego', 'GK'),
('172', 'Bullford', 174, 171, 41, 51, 68, 48, 77, 31, 64, 'Fuego', 'GK'),
('173', 'Toad', 109, 167, 48, 57, 52, 48, 48, 54, 50, 'Bosque', 'DF'),
('174', 'Fishman', 113, 167, 52, 62, 64, 51, 51, 51, 51, 'Bosque', 'DF'),
('175', 'Raccoon', 121, 123, 53, 44, 53, 53, 44, 51, 47, 'Bosque', 'DF'),
('176', 'Lion', 113, 195, 78, 69, 52, 47, 64, 55, 68, 'Montaña', 'DF'),
('177', 'Monkey', 100, 184, 54, 52, 64, 51, 48, 53, 54, 'Aire', 'MF'),
('178', 'Chameleon', 101, 176, 44, 60, 45, 45, 55, 53, 48, 'Aire', 'MF'),
('179', 'Mouseman', 112, 158, 42, 54, 50, 52, 44, 79, 45, 'Montaña', 'MF'),
('180', 'Koala', 112, 132, 52, 46, 45, 53, 51, 48, 49, 'Bosque', 'MF'),
('181', 'Chicken', 101, 189, 44, 67, 52, 56, 46, 64, 54, 'Fuego', 'MF'),
('182', 'Eagle', 148, 193, 61, 71, 68, 62, 52, 68, 68, 'Aire', 'MF'),
('183', 'Panda', 132, 123, 52, 51, 51, 48, 52, 52, 46, 'Fuego', 'FW'),
('184', 'Cheetah', 133, 195, 63, 42, 47, 69, 55, 79, 47, 'Aire', 'FW'),
('185', 'Gorilla', 108, 191, 78, 52, 66, 49, 64, 54, 67, 'Montaña', 'FW'),
('186', 'Snake', 112, 184, 55, 65, 63, 62, 49, 55, 45, 'Bosque', 'FW'),
('187', 'Icarus', 149, 182, 71, 71, 67, 66, 79, 44, 64, 'Aire', 'GK'),
('188', 'Apollo', 144, 136, 79, 48, 79, 62, 73, 53, 55, 'Bosque', 'DF'),
('189', 'Hephestus', 156, 171, 60, 64, 64, 78, 69, 70, 62, 'Fuego', 'DF'),
('190', 'Ares', 153, 138, 71, 57, 79, 70, 72, 56, 60, 'Montaña', 'DF'),
('191', 'Dionysus', 124, 136, 62, 53, 68, 66, 79, 50, 64, 'Aire', 'DF'),
('192', 'Heracles', 64, 192, 63, 71, 60, 66, 79, 69, 65, 'Fuego', 'DF'),
('193', 'Chronos', 169, 178, 48, 61, 66, 62, 79, 63, 66, 'Bosque', 'DF'),
('194', 'Artemis', 184, 127, 62, 45, 66, 76, 67, 44, 58, 'Aire', 'MF'),
('195', 'Medusa', 152, 173, 69, 62, 78, 79, 67, 63, 62, 'Montaña', 'MF'),
('196', 'Hera', 165, 193, 48, 70, 68, 60, 67, 64, 60, 'Fuego', 'MF'),
('197', 'Hermes', 180, 162, 56, 62, 69, 69, 68, 57, 62, 'Bosque', 'MF'),
('198', 'Athena', 132, 187, 60, 64, 76, 64, 63, 71, 77, 'Bosque', 'FW'),
('199', 'Demeter', 149, 151, 77, 63, 64, 79, 56, 68, 68, 'Fuego', 'FW'),
('200', 'Achilles', 165, 191, 78, 60, 69, 61, 50, 65, 70, 'Montaña', 'FW'),
('201', 'Aphrodite', 184, 167, 79, 68, 69, 77, 70, 72, 67, 'Bosque', 'MF'),
('201', 'Poseidon', 120, 145, 79, 74, 79, 71, 79, 44, 76, 'Montaña', 'GK');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `supertécnicas`
--

CREATE TABLE `supertécnicas` (
  `Nombre_S` varchar(50) DEFAULT NULL,
  `Id_S` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Id_U` varchar(50) DEFAULT NULL,
  `Usuario` varchar(50) DEFAULT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Correo` varchar(50) DEFAULT NULL,
  `Contraseña` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
