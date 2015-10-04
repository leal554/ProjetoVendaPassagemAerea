-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 31-Out-2014 às 02:26
-- Versão do servidor: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vpa`
--
CREATE DATABASE IF NOT EXISTS `vpa` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `vpa`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aeronave`
--

CREATE TABLE IF NOT EXISTS `aeronave` (
`id` int(11) NOT NULL,
  `numAero` varchar(20) NOT NULL,
  `numAcent` int(11) NOT NULL,
  `emUso` tinyint(1) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
`id` int(11) NOT NULL,
  `nome` varchar(11) NOT NULL,
  `rg` varchar(11) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `endereco` varchar(11) NOT NULL,
  `cep` int(11) NOT NULL,
  `sr` varchar(11) NOT NULL,
  `estadoCivil` varchar(11) NOT NULL,
  `emprego` varchar(11) NOT NULL,
  `email` varchar(11) NOT NULL,
  `senha` varchar(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `passagem`
--

CREATE TABLE IF NOT EXISTS `passagem` (
`id` int(11) NOT NULL,
  `pesoBagagem` double DEFAULT NULL,
  `numeroBagagem` varchar(22) DEFAULT NULL,
  `necessidadeEspecial` varchar(11) DEFAULT NULL,
  `crianca` varchar(11) DEFAULT NULL,
  `idaEvolta` varchar(11) DEFAULT NULL,
  `formaPagamento` varchar(11) DEFAULT NULL,
  `numeroCartao` int(11) DEFAULT NULL,
  `codSeguranca` int(11) DEFAULT NULL,
  `dataIda` varchar(11) DEFAULT NULL,
  `dataVolta` varchar(11) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `numeroAeronave` varchar(22) DEFAULT NULL,
  `numeroVoo` varchar(22) DEFAULT NULL,
  `idCliente` varchar(50) DEFAULT NULL,
  `acento` varchar(100) DEFAULT NULL,
  `checkIn` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `voo`
--

CREATE TABLE IF NOT EXISTS `voo` (
`id` int(11) NOT NULL,
  `numeroVoo` varchar(11) NOT NULL,
  `tripulacao` varchar(11) NOT NULL,
  `saida` varchar(11) NOT NULL,
  `chegada` varchar(11) NOT NULL,
  `dia` varchar(11) NOT NULL,
  `destino` varchar(200) DEFAULT NULL,
  `numeroAeronave` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aeronave`
--
ALTER TABLE `aeronave`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `numAero` (`numAero`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `rg` (`rg`,`cpf`,`email`);

--
-- Indexes for table `passagem`
--
ALTER TABLE `passagem`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `numeroBagagem` (`numeroBagagem`), ADD UNIQUE KEY `acento` (`acento`);

--
-- Indexes for table `voo`
--
ALTER TABLE `voo`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `numeroVoo` (`numeroVoo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aeronave`
--
ALTER TABLE `aeronave`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1;
--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1;
--
-- AUTO_INCREMENT for table `passagem`
--
ALTER TABLE `passagem`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1;
--
-- AUTO_INCREMENT for table `voo`
--
ALTER TABLE `voo`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
