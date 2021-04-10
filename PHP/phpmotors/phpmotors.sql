-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 05/04/2021 às 18:37
-- Versão do servidor: 10.4.17-MariaDB
-- Versão do PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `phpmotors`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `carclassification`
--

CREATE TABLE `carclassification` (
  `classificationId` int(11) NOT NULL,
  `classificationName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Despejando dados para a tabela `carclassification`
--

INSERT INTO `carclassification` (`classificationId`, `classificationName`) VALUES
(1, 'SUV'),
(2, 'Classic'),
(3, 'Sports'),
(4, 'Trucks'),
(5, 'Used');

-- --------------------------------------------------------

--
-- Estrutura para tabela `clients`
--

CREATE TABLE `clients` (
  `clientFirstname` varchar(255) NOT NULL,
  `clientLastname` varchar(255) NOT NULL,
  `clientEmail` varchar(255) NOT NULL,
  `clientPassword` varchar(255) NOT NULL,
  `clientId` int(255) NOT NULL,
  `clientLevel` int(255) DEFAULT NULL,
  `clientData` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `clients`
--

INSERT INTO `clients` (`clientFirstname`, `clientLastname`, `clientEmail`, `clientPassword`, `clientId`, `clientLevel`, `clientData`) VALUES
('Admin', 'User', 'admin@cit340.net', '$2y$10$f2XnRo0ko2dUrU6c6ZtNCu9FOVeZHcU6c47pIQ2FviAp7gxeZ7Cx2', 1, 3, NULL),
('Admin', 'User', 'admin@cse340.net', '$2y$10$dTeZpgLPkfmzi6BIlD77.e1zcXrBv0eUILjyWK.yLcNYfr.8U9WXe', 2, 3, NULL),
('Tiagos', 'Schubert', 'schubert.tiago@gmail.com', '$2y$10$0v8O4DBD4fqHJqQicsgJzObHgJ.h0YxPdajD7jCk2oi7dJj3nI5a6', 3, 3, '');

-- --------------------------------------------------------

--
-- Estrutura para tabela `images`
--

CREATE TABLE `images` (
  `imgId` int(10) UNSIGNED NOT NULL,
  `invId` int(10) UNSIGNED NOT NULL,
  `imgName` varchar(100) CHARACTER SET latin1 NOT NULL,
  `imgPath` varchar(150) CHARACTER SET latin1 NOT NULL,
  `imgDate` timestamp NOT NULL DEFAULT current_timestamp(),
  `imgPrimary` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `images`
--

INSERT INTO `images` (`imgId`, `invId`, `imgName`, `imgPath`, `imgDate`, `imgPrimary`) VALUES
(61, 1, 'wrangler.jpg', '/phpmotors/images/vehicles/wrangler.jpg', '2021-03-22 10:02:13', 1),
(62, 1, 'wrangler-tn.jpg', '/phpmotors/images/vehicles/wrangler-tn.jpg', '2021-03-22 10:02:13', 1),
(63, 2, 'model-t.jpg', '/phpmotors/images/vehicles/model-t.jpg', '2021-03-22 10:02:57', 1),
(64, 2, 'model-t-tn.jpg', '/phpmotors/images/vehicles/model-t-tn.jpg', '2021-03-22 10:02:57', 1),
(65, 3, 'adventador.jpg', '/phpmotors/images/vehicles/adventador.jpg', '2021-03-22 10:03:17', 1),
(66, 3, 'adventador-tn.jpg', '/phpmotors/images/vehicles/adventador-tn.jpg', '2021-03-22 10:03:17', 1),
(67, 4, 'monster-truck.jpg', '/phpmotors/images/vehicles/monster-truck.jpg', '2021-03-22 10:03:34', 1),
(68, 4, 'monster-truck-tn.jpg', '/phpmotors/images/vehicles/monster-truck-tn.jpg', '2021-03-22 10:03:34', 1),
(69, 5, 'mechanic.jpg', '/phpmotors/images/vehicles/mechanic.jpg', '2021-03-22 10:03:59', 1),
(70, 5, 'mechanic-tn.jpg', '/phpmotors/images/vehicles/mechanic-tn.jpg', '2021-03-22 10:03:59', 1),
(71, 6, 'batmobile.jpg', '/phpmotors/images/vehicles/batmobile.jpg', '2021-03-22 10:04:20', 1),
(72, 6, 'batmobile-tn.jpg', '/phpmotors/images/vehicles/batmobile-tn.jpg', '2021-03-22 10:04:20', 1),
(73, 7, 'mystery-van.jpg', '/phpmotors/images/vehicles/mystery-van.jpg', '2021-03-22 10:05:08', 1),
(74, 7, 'mystery-van-tn.jpg', '/phpmotors/images/vehicles/mystery-van-tn.jpg', '2021-03-22 10:05:08', 1),
(75, 8, 'fire-truck.jpg', '/phpmotors/images/vehicles/fire-truck.jpg', '2021-03-22 10:05:26', 1),
(76, 8, 'fire-truck-tn.jpg', '/phpmotors/images/vehicles/fire-truck-tn.jpg', '2021-03-22 10:05:26', 1),
(77, 9, 'crwn-vic.jpg', '/phpmotors/images/vehicles/crwn-vic.jpg', '2021-03-22 10:06:02', 1),
(78, 9, 'crwn-vic-tn.jpg', '/phpmotors/images/vehicles/crwn-vic-tn.jpg', '2021-03-22 10:06:02', 1),
(79, 10, 'camaro.jpg', '/phpmotors/images/vehicles/camaro.jpg', '2021-03-22 10:06:20', 1),
(80, 10, 'camaro-tn.jpg', '/phpmotors/images/vehicles/camaro-tn.jpg', '2021-03-22 10:06:20', 1),
(81, 11, 'escalade.jpg', '/phpmotors/images/vehicles/escalade.jpg', '2021-03-22 10:06:35', 1),
(82, 11, 'escalade-tn.jpg', '/phpmotors/images/vehicles/escalade-tn.jpg', '2021-03-22 10:06:35', 1),
(83, 12, 'hummer.jpg', '/phpmotors/images/vehicles/hummer.jpg', '2021-03-22 10:06:58', 1),
(84, 12, 'hummer-tn.jpg', '/phpmotors/images/vehicles/hummer-tn.jpg', '2021-03-22 10:06:58', 1),
(87, 14, 'van.jpg', '/phpmotors/images/vehicles/van.jpg', '2021-03-22 10:08:10', 1),
(88, 14, 'van-tn.jpg', '/phpmotors/images/vehicles/van-tn.jpg', '2021-03-22 10:08:10', 1),
(89, 15, 'DogCar.jpeg', '/phpmotors/images/vehicles/DogCar.jpeg', '2021-03-22 10:08:30', 1),
(90, 15, 'DogCar-tn.jpeg', '/phpmotors/images/vehicles/DogCar-tn.jpeg', '2021-03-22 10:08:30', 1),
(91, 22, 'delorean.jpg', '/phpmotors/images/vehicles/delorean.jpg', '2021-03-22 10:08:52', 1),
(92, 22, 'delorean-tn.jpg', '/phpmotors/images/vehicles/delorean-tn.jpg', '2021-03-22 10:08:52', 1),
(93, 13, 'aerocar.jpg', '/phpmotors/images/vehicles/aerocar.jpg', '2021-03-22 10:10:10', 1),
(94, 13, 'aerocar-tn.jpg', '/phpmotors/images/vehicles/aerocar-tn.jpg', '2021-03-22 10:10:10', 1),
(95, 15, 'dog-shaped-car.jpeg', '/phpmotors/images/vehicles/dog-shaped-car.jpeg', '2021-03-22 10:13:28', 0),
(96, 15, 'dog-shaped-car-tn.jpeg', '/phpmotors/images/vehicles/dog-shaped-car-tn.jpeg', '2021-03-22 10:13:28', 0),
(97, 1, 'rubicon-1.jpeg', '/phpmotors/images/vehicles/rubicon-1.jpeg', '2021-03-22 10:16:33', 0),
(98, 1, 'rubicon-1-tn.jpeg', '/phpmotors/images/vehicles/rubicon-1-tn.jpeg', '2021-03-22 10:16:33', 0),
(99, 1, 'wrangler-2.jpg', '/phpmotors/images/vehicles/wrangler-2.jpg', '2021-03-22 10:17:07', 0),
(100, 1, 'wrangler-2-tn.jpg', '/phpmotors/images/vehicles/wrangler-2-tn.jpg', '2021-03-22 10:17:07', 0),
(101, 1, 'wrangler-3.jpeg', '/phpmotors/images/vehicles/wrangler-3.jpeg', '2021-03-22 10:17:33', 0),
(102, 1, 'wrangler-3-tn.jpeg', '/phpmotors/images/vehicles/wrangler-3-tn.jpeg', '2021-03-22 10:17:33', 0),
(103, 3, 'aventador-1.jpeg', '/phpmotors/images/vehicles/aventador-1.jpeg', '2021-03-22 10:17:53', 0),
(104, 3, 'aventador-1-tn.jpeg', '/phpmotors/images/vehicles/aventador-1-tn.jpeg', '2021-03-22 10:17:53', 0),
(105, 3, 'aventador-2.jpeg', '/phpmotors/images/vehicles/aventador-2.jpeg', '2021-03-22 10:18:06', 0),
(106, 3, 'aventador-2-tn.jpeg', '/phpmotors/images/vehicles/aventador-2-tn.jpeg', '2021-03-22 10:18:06', 0),
(107, 3, 'aventador-3.jpeg', '/phpmotors/images/vehicles/aventador-3.jpeg', '2021-03-22 10:18:17', 0),
(108, 3, 'aventador-3-tn.jpeg', '/phpmotors/images/vehicles/aventador-3-tn.jpeg', '2021-03-22 10:18:17', 0),
(109, 6, '1989-z-movie-car-batmobile.jpeg', '/phpmotors/images/vehicles/1989-z-movie-car-batmobile.jpeg', '2021-03-22 10:18:37', 0),
(110, 6, '1989-z-movie-car-batmobile-tn.jpeg', '/phpmotors/images/vehicles/1989-z-movie-car-batmobile-tn.jpeg', '2021-03-22 10:18:37', 0),
(111, 6, 'the-next-batmobile.jpeg', '/phpmotors/images/vehicles/the-next-batmobile.jpeg', '2021-03-22 10:18:55', 0),
(112, 6, 'the-next-batmobile-tn.jpeg', '/phpmotors/images/vehicles/the-next-batmobile-tn.jpeg', '2021-03-22 10:18:55', 0),
(113, 6, 'batmobile-3.jpeg', '/phpmotors/images/vehicles/batmobile-3.jpeg', '2021-03-22 10:19:09', 0),
(114, 6, 'batmobile-3-tn.jpeg', '/phpmotors/images/vehicles/batmobile-3-tn.jpeg', '2021-03-22 10:19:09', 0),
(115, 10, 'camaro2.jpeg', '/phpmotors/images/vehicles/camaro2.jpeg', '2021-03-22 10:23:46', 0),
(116, 10, 'camaro2-tn.jpeg', '/phpmotors/images/vehicles/camaro2-tn.jpeg', '2021-03-22 10:23:46', 0),
(117, 10, 'camaro3.png', '/phpmotors/images/vehicles/camaro3.png', '2021-03-22 10:24:02', 0),
(118, 10, 'camaro3-tn.png', '/phpmotors/images/vehicles/camaro3-tn.png', '2021-03-22 10:24:02', 0),
(119, 10, 'camaro4.png', '/phpmotors/images/vehicles/camaro4.png', '2021-03-22 10:24:43', 0),
(120, 10, 'camaro4-tn.png', '/phpmotors/images/vehicles/camaro4-tn.png', '2021-03-22 10:24:43', 0),
(121, 10, 'camaro5.jpeg', '/phpmotors/images/vehicles/camaro5.jpeg', '2021-03-22 10:24:51', 0),
(122, 10, 'camaro5-tn.jpeg', '/phpmotors/images/vehicles/camaro5-tn.jpeg', '2021-03-22 10:24:51', 0),
(123, 10, 'camaro6.jpeg', '/phpmotors/images/vehicles/camaro6.jpeg', '2021-03-22 10:25:03', 0),
(124, 10, 'camaro6-tn.jpeg', '/phpmotors/images/vehicles/camaro6-tn.jpeg', '2021-03-22 10:25:03', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `inventory`
--

CREATE TABLE `inventory` (
  `invId` int(11) NOT NULL,
  `invMake` varchar(30) NOT NULL,
  `invModel` varchar(30) NOT NULL,
  `invDescription` text DEFAULT NULL,
  `invImage` varchar(50) NOT NULL,
  `invThumbnail` varchar(50) NOT NULL,
  `invPrice` decimal(10,2) NOT NULL,
  `invStock` smallint(6) NOT NULL,
  `invColor` varchar(20) NOT NULL,
  `classificationId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Despejando dados para a tabela `inventory`
--

INSERT INTO `inventory` (`invId`, `invMake`, `invModel`, `invDescription`, `invImage`, `invThumbnail`, `invPrice`, `invStock`, `invColor`, `classificationId`) VALUES
(1, 'Jeep ', 'Wrangler', 'The Jeep Wrangler is small and compact with enough power to get you where you want to go. Its great for everyday driving as well as offroading weather that be on the the rocks or in the mud!', '/images/vehicles/jeep-wrangler.jpg', '/images/vehicles/jeep-wrangler-tn.jpg', '28045.00', 4, 'Orange', 1),
(2, 'Ford', 'Model T', 'The Ford Model T can be a bit tricky to drive. It was the first car to be put into production. You can get it in any color you want as long as it', '/images/vehicles/ford-modelt.jpg', '/images/vehicles/ford-modelt-tn.jpg', '35000.00', 2, 'Black', 2),
(3, 'Lamborghini', 'Adventador', 'This V-12 engine packs a punch in this sporty car. Make sure you wear your seatbelt and obey all traffic laws. ', '/images/vehicles/adventador.jpg', '/images/vehicles/adventador-tn.jpg', '417650.00', 1, 'Blue', 3),
(4, 'Monster', 'Truck', 'Most trucks are for working, this one is for fun. this beast comes with 60in tires giving you tracktions needed to jump and roll in the mud.', '/images/vehicles/monster.jpg', '/images/vehicles/monster-tn.jpg', '150000.00', 3, 'purple', 4),
(5, 'Mechanic', 'Special', 'Not sure where this car came from. however with a little tlc it will run as good a new.', '/images/vehicles/junk.jpg', '/images/vehicles/junk-tn.jpg', '100.00', 200, 'Rust', 5),
(6, 'Batmobile', 'Custom', 'Ever want to be a super hero? now you can with the batmobile. This car allows you to switch to bike mode allowing you to easily maneuver through trafic during rush hour.', '/images/vehicles/bat.jpg', '/images/vehicles/bat-tn.jpg', '65000.00', 2, 'Black', 3),
(7, 'Mystery', 'Machine', 'Scooby and the gang always found luck in solving their mysteries because of there 4 wheel drive Mystery Machine. This Van will help you do whatever job you are required to with a success rate of 100%.', '/images/vehicles/machine.jpg', '/images/vehicles/machine-tn.jpg', '10000.00', 12, 'Green', 1),
(8, 'Spartan', 'Fire Truck', 'Emergencies happen often. Be prepared with this Spartan fire truck. Comes complete with 1000 ft. of hose and a 1000 gallon tank.', '/images/vehicles/fire-truck.jpg', '/images/vehicles/fire-truck-tn.jpg', '50000.00', 2, 'Red', 4),
(9, 'Ford', 'Crown Victoria', 'After the police force updated their fleet these cars are now available to the public! These cars come equiped with the siren which is convenient for college students running late to class.', '/images/vehicles/crown-vic.jpg', '/images/vehicles/crown-vic-tn.jpg', '10000.00', 5, 'White', 5),
(10, 'Chevy', 'Camaro', 'If you want to look cool this is the ar you need! This car has great performance at an affordable price. Own it today!', '/images/vehicles/camaro.jpg', '/images/vehicles/camaro-tn.jpg', '25000.00', 10, 'Silver', 3),
(11, 'Cadilac', 'Escalade', 'This stylin car is great for any occasion from going to the beach to meeting the president. The luxurious inside makes this car a home away from home.', '/images/vehicles/escalade.jpg', '/images/vehicles/escalade-tn.jpg', '75195.00', 4, 'Black', 1),
(12, 'GM', 'Hummer', 'Do you have 6 kids and like to go offroading? The Hummer gives you the small interiors with an engine to get you out of any muddy or rocky situation.', '/images/vehicles/hummer.jpg', '/images/vehicles/hummer-tn.jpg', '58800.00', 5, 'Yellow', 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `reviews`
--

CREATE TABLE `reviews` (
  `reviewId` int(10) UNSIGNED NOT NULL,
  `reviewText` text CHARACTER SET latin1 NOT NULL,
  `reviewDate` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `invId` int(10) UNSIGNED NOT NULL,
  `clientId` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `reviews`
--

INSERT INTO `reviews` (`reviewId`, `reviewText`, `reviewDate`, `invId`, `clientId`) VALUES
(12, 'Review 1: Great car very reliable and amazing experiences guaranteed. ', '2021-04-01 10:02:08', 1, 8),
(15, 'hgjhbj', '2021-04-02 13:36:53', 8, 8),
(16, 'Great car with you need a strong and powerful machine', '2021-04-05 15:08:35', 12, 3),
(17, 'who never dreamed to drive a Camaro? I&#39;m driving and loving. Everyone looks at me on the streets...', '2021-04-05 16:06:42', 10, 3);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `carclassification`
--
ALTER TABLE `carclassification`
  ADD PRIMARY KEY (`classificationId`);

--
-- Índices de tabela `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`clientId`),
  ADD UNIQUE KEY `clientEmail` (`clientEmail`);

--
-- Índices de tabela `images`
--
ALTER TABLE `images`
  ADD PRIMARY KEY (`imgId`);

--
-- Índices de tabela `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`invId`),
  ADD KEY `classificationId` (`classificationId`);

--
-- Índices de tabela `reviews`
--
ALTER TABLE `reviews`
  ADD PRIMARY KEY (`reviewId`),
  ADD KEY `FK_inv_reviews` (`invId`),
  ADD KEY `FK_cli_reviews` (`clientId`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `carclassification`
--
ALTER TABLE `carclassification`
  MODIFY `classificationId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `clients`
--
ALTER TABLE `clients`
  MODIFY `clientId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `images`
--
ALTER TABLE `images`
  MODIFY `imgId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=125;

--
-- AUTO_INCREMENT de tabela `inventory`
--
ALTER TABLE `inventory`
  MODIFY `invId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `reviews`
--
ALTER TABLE `reviews`
  MODIFY `reviewId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `inventory`
--
ALTER TABLE `inventory`
  ADD CONSTRAINT `inventory_ibfk_1` FOREIGN KEY (`classificationId`) REFERENCES `carclassification` (`classificationId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
