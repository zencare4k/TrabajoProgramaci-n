-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-05-2024 a las 12:34:34
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
('Raimon', '2'),
('Wild', '3'),
('Farm', '4'),
('Otaku', '5'),
('RaimonOG', '6'),
('Shuriken', '7'),
('Sallys_Street', '8'),
('Umbrella', '9'),
('Zeus', '10'),
('Kirkwood', '11'),
('Occult', '12'),
('Inazuma_Kids_FC', '13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `Nombre_J` varchar(50) DEFAULT NULL,
  `Id_J` varchar(50) NOT NULL DEFAULT '',
  `PE` int(11) DEFAULT NULL,
  `PT` int(11) DEFAULT NULL,
  `Tiro` int(11) DEFAULT NULL,
  `Aguante` int(11) DEFAULT NULL,
  `Fisico` int(11) DEFAULT NULL,
  `Control` int(11) DEFAULT NULL,
  `Defensa` int(11) DEFAULT NULL,
  `Rapidez` int(11) DEFAULT NULL,
  `Valor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `supertécnicas`
--

CREATE TABLE `supertécnicas` (
  `Nombre_S` varchar(50) DEFAULT NULL,
  `Id_S` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
