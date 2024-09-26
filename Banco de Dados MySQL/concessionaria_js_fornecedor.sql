-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: concessionaria_js
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(250) NOT NULL,
  `endereco` varchar(250) NOT NULL,
  `estado` varchar(50) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `cnpj` varchar(20) DEFAULT NULL,
  `observacoes` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cnpj` (`cnpj`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (23,'Auto Peças Brasil','Av. Paulista, 1001','SP','01311-000','(11) 98765-4321','12.345.678/0001-01','Fornecedor de peças automotivas'),(24,'Rodas e Pneus S/A','Rua das Rodas, 500','RJ','20010-000','(21) 12345-6789','98.765.432/0001-02','Fornecedor de rodas e pneus'),(25,'Freios e Suspensões Ltda','Av. das Suspensões, 200','MG','30123-456','(31) 56789-0123','76.543.210/0001-03','Fornecedor de sistemas de freio'),(26,'Pneus Norte Sul','Rua dos Pneus, 800','SP','04567-890','(11) 23456-7890','23.456.789/0001-04','Fornecedor de pneus de todas as marcas'),(27,'Filtros e Óleos Express','Av. dos Filtros, 300','RJ','21000-123','(21) 34567-8901','34.567.890/0001-05','Fornecedor de filtros e óleos automotivos'),(28,'Faróis e Lanternas S/A','Rua das Lanternas, 600','MG','30100-234','(31) 45678-9012','45.678.901/0001-06','Fornecedor de sistemas de iluminação'),(29,'Ar Condicionado Central','Av. do Ar Condicionado, 400','SP','05555-555','(11) 55555-5555','55.555.555/0001-07','Fornecedor de sistemas de ar condicionado'),(30,'Escapamentos & Sons','Rua dos Escapamentos, 700','RJ','22000-456','(21) 67890-1234','67.890.123/0001-08','Fornecedor de sistemas de escape e áudio'),(31,'Vidros & Espelhos Ltda','Av. dos Vidros, 200','MG','30234-567','(31) 78901-2345','78.901.234/0001-09','Fornecedor de vidros e espelhos automotivos'),(32,'Estofados de Luxo','Rua dos Estofados, 900','SP','06789-012','(11) 90123-4567','90.123.456/0001-10','Fornecedor de estofados personalizados');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-25 22:20:33
