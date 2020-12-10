-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: game
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `question` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `answerA` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `answerB` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `answerC` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `answerD` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `correctAnswer` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'1 + 1 = ?','3','2','4','1',1),(2,'15cm – 2cm + 21cm = ?','34cm','30cm','38cm','36cm',0),(3,'6kg + 13kg = ?','19kg','29kg','18kg','20kg',0),(4,'78 + 13 = ?','65','89','75','91 ',3),(5,'2 * 2 * 2 * 2 = ?','8','32','2^4','2',2),(6,'6 : 2 (1 + 2) = ?','3','9','1','2',1),(7,'12,48 * 3,47 – 3,47 * 2,48 = ?','32','35,1','34,7','34,5',2),(8,'6,28 * 18,24 + 18,24 * 3,72 = ?','181,8','182,2','184,3','182,4',3),(9,'Tìm x biết: (15 * 28 – x) : 2/5 = 200 : 0,4 ','x = 200','x = 256','x = 220','x = 222',2),(10,'1024 = ?','2^9','2^8','2^11','2^10',3),(11,'Tìm x biết: x + 2 = 2x - 1','x = 3','x = 1','x = 2','x = 0',0),(12,'Tìm x biết: x - 1 = 2','x = 1','x = 2','x = 3','x = 4',2),(13,'12 + 24 + 9 = ?','51','45','46','42',1),(14,'Tìm x biết: (x -2)^2 = 0','x = 2','x = -2','x = 1','x = 4',0),(15,'Tìm x biết: x^2 - 2x +4 = 0','x = 2','x = -2','x = +-2','vô nghiệm',3),(16,'Tìm x biết: x^2 - 4x + 4 = 0','x = -2','x = +-2','x = 2','vô nghiệm',2),(17,'6! = ? ','120','720','740','940',1);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `account` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` int DEFAULT NULL,
  `point` float DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'hadm','123',1,10),(2,'hoadd','123',0,5),(3,'thangnd','123',0,1),(4,'phuclk','123',0,2),(5,'tinnt','123',0,8),(6,'minhht','123',0,6),(7,'tiennx','123',0,2.5);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-07  0:12:55
