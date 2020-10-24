-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: dictionarytest
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbltest`
--

DROP TABLE IF EXISTS `tbltest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbltest` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Word` varchar(155) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Pronunciation` varchar(155) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Define` longtext NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbltest`
--

LOCK TABLES `tbltest` WRITE;
/*!40000 ALTER TABLE `tbltest` DISABLE KEYS */;
INSERT INTO `tbltest` VALUES 
(2,'1-byte character code','','(Tech) mã ký tự 1 bai'),
(3,'1-byte character set','','(Tech) bộ ký tự 1 bai'),
(4,'1-byte character string','','(Tech) chuỗi ký tự 1 bai'),
(5,'1 to 1 relationship','','(Tech) quan hệ 1 đối 1'),
(6,'1 to many relationship','','(Tech) quan hệ 1 đối nhiều'),
(7,'2-way device','','(Tech) thiết bị 2 chiều/thu phát'),
(8,'2D configuration','','(Tech) cấu hình 2 chiều, cấu hình phẳng'),
(9,'2D image','','(Tech) ảnh 2 chiều, ảnh phẳng'),
(10,'2D module = two-dimensional module','','(Tech) mô đun hai chiều'),
(11,'2D (two dimension)','','(Tech) hai chiều, nhị thứ nguyên, phẳng'),
(12,'3D (three dimension)','','(Tech) ba chiều, tam thứ nguyên, nổi'),
(13,'3D (three dimension) calculation','','(Tech) tính toán 3 chiều'),
(14,'3D (three dimension) configuration','','(Tech) cấu hình 3 chiều, cấu hình nổi'),
(15,'3D (three dimension) image','','(Tech) ảnh 3 chiều, ảnh nổi = stereoscopic image'),
(16,'4th Generation Language (4GL)','','(Tech) Ngôn ngữ Thế hệ Thứ tư'),
(17,'7-bit ASCII code','','(Tech) mã ASCII 7 bít'),
(18,'7-bit ASCII code set','','(Tech) bộ mã ASCII 7 bít'),
(19,'8-bit character','','(Tech) ký tự 8 bít'),
(20,'8-bit character code','','(Tech) mã ký tự 8 bít'),
(21,'8-bit character set','','(Tech) bộ ký tự 8 bít'),
(22,'8-bit character string','','(Tech) chuỗi ký tự 8 bít'),
(23,'8-bit microcomputer','','(Tech) máy vi điện toán 8 bít, máy vi tính 8 bít [TN]'),
(24,'8-bit microprocessor','','(Tech) bộ vi xử lý 8 bít'),
(25,'8-bit personal computer','','(Tech) máy điện toán cá nhân 8 bít'),
(26,'a','/ei, ə/','(danh từ, thông tục) loại a, hạng nhất, hạng tốt nhất, hạng rất tốt;from a to z : từ đầu đến đuôi, tường tận;(mạo từ) một;a very cold day : một ngày rất lạnh;a dozen : một tá;a few+ một ít;all of a size : tất cả cùng một cỡ'),
(27,'A A','','(Alcoholics Anonymous) Hội cai rượu;(Automobile Association) Hội ô tô'),
(28,'A A A','','(Amateur Athletic Association) Hội thể thao không chuyên;(American Automobile Association) Hiệp hội xe hơi Mỹ'),
(29,'a b c','/\'eibi:\'si:/ ','(danh từ) bảng chữ cái , khái niệm cơ sở, cơ sở'),
(30,'a b c - book','/\'eibi:\'si:buk/','(danh từ) sách vỡ lòng, sách học vần'),
(31,'a-bomb','/\'ei\'bɔm/','(danh từ) bom nguyên tử'),
(32,'A-D','','(analog-to-digital);(Tech) đổi dạng sóng (dạng tương tự) sang dạng số'),
(33,'a.d.','/\'ei\'di:/ ','(viết tắt) của Ano Dominsau công nguyên;1540 a.d. : năm 1540 sau công nguyên'),
(34,'a.d.c','','(vt của aide-de-camp) sự quan phụ tá'),
(35,'A-D conversion','','(Tech) đổi sóng (tương tự) - số'),
(36,'A-D converter circuit','','(Tech) mạch đổi sóng-số'),
(37,'A except B gate','','(Tech) cổng A loại trừ B'),
(38,'a font','/ɑ:\'fɜ:ɳ/','(phó từ) thấu triệt, cặn kẽ, rõ ngọn nghành'),
(39,'a fortiori','/\'ei,fɔ:ti\'ɔ:rai/','(phó từ) huống hồ, huống là'),
(40,'a-going','/ə\'gouiɳ/','(phó từ) đang chạy, đang chuyển động, đang hoạt động, đang tiến hành;to set a-going : cho chuyển động, cho chạy (máy...)'),
(41,'A ignore B gate','','(Tech) cổng A không biết B'),
(42,'A implies B gate','','(Tech) cổng A bao hàm B'),
(43,'a la carte','/\'ɑ:lɑ:\'kɑ:t/','(phó từ) theo món, gọi theo món, đặt theo món;to dine a_la_carte : ăn cơm gọi theo món'),
(44,'a la mode','/,ɑ:lə\'moud/','(phó từ) hợp thời trang, đúng mốt'),
(45,'a.m','','(vt) (radio) viết tắt của amplitude modulation) biến điệu biên độ;(vt của Master of Arts) cao học văn chương;(vt của tiếng Latinh Antemeridian) sáng, trước ngọ'),
(46,'a.m.','/\'ei\'em/','(phó từ) (xem) ante_meridiem'),
(47,'a-ok','','(tính từ) giống như OK nhấn mạnh'),
(48,'a-pac-thai','','(danh từ) apartheid'),
(49,'a-plenty','/ə\'plenti/','(phó từ) (từ Mỹ,nghĩa Mỹ) nhiều, dồi dào, phong phú'),
(50,'a-point','','(giải tích) điểm'),
(51,'a posteriori','/\'eipɔs,teri\'ɔ:rai/','(phó từ), (tính từ) theo phép quy nạp;method a_posteriori : phương pháp quy nạp hậu nghiệm;probability a_posteriori : (toán học) xác suất hậu nghiệm'),
(52,'a-power','/\'ei\'pauə/','(danh từ) năng lượng nguyên tử, cường quốc nguyên tử'),
(53,'a priori','/\'eiprai\'ɔ:rai/','(danh từ) theo cách suy diễn, theo cách diễn dịch, tiên nghiệm;probability a_priori : (toán học) xác xuất tiên nghiệm'),
(54,'a-road','','(danh từ) đường lớn, không quan trọng bằng xa lộ, nhưng rộng và thẳng hơn đường loại B'),
(55,'a.s.a.p.','','(viết tắt) càng sớm càng tốt (As soon as possible)'),
(56,'A shares','','(Econ) Cổ phiếu A (Cổ phiếu hưởng lãi sau);Xem FINANCIAL CAPITAL.'),
(57,'a-side','','(danh từ) mặt chính của dĩa hát'),
(58,'A W O L','/\'eiwɔ:l/',' (tính từ) (quân sự) nghỉ không được phép, nghỉ không xin phép'),
(59,'A4-size','','(Tech) khổ giấy A4 (21 cm x 29.7 cm)'),
(60,'aa','','(Alcoholics Anonymous) Hội cai rượu;(Automobile Association) Hội ô tô'),
(62,'aard-wolf','/\'ɑ:d,wulf/','(danh từ) (động vật học) chó sói đất (Nam Phi)'),
(63,'aardvark','','(danh từ) (động vật) lợn đất'),
(64,'aardvarks','','(danh từ số nhiều) (động vật) lợn đất'),
(65,'aardwolf','','(danh từ) chó sói đất (Nam Phi)'),
(66,'aardwolves','','(danh từ số nhiều) chó sói đất (Nam Phi)'),
(67,'aasvogel','/\'ɑ:sfougəl/','(danh từ) (động vật học) con kên kên (Nam Phi)'),
(68,'ab','','(vt của able-bodied seaman) thủy thủ hạng nhất;(vt của Bachelor of Arts) Cử nhân văn chương'),
(69,'aba','/\'ɑ:bə/','(danh từ) áo aba (áo ngoài giống hình cái túi người A-Rập)'),
(70,'abac, abacus','','bàn tính, toán đồ, bản đồ tính'),
(71,'abaca','','(danh từ) vải dệt bằng tơ chuối abaca ở Philippines'),
(72,'abaci','/\'æbəkəs/','(danh từ,  số nhiều : abaci,  abacuses) bàn tính;to move counters of an abacus; to work an abacus : tính bằng bàn tính, gảy bàn tính;(kiến trúc) đầu cột, đỉnh cột'),
(73,'abacist','','(danh từ) người gảy bàn phím, người kế toán'),
(74,'aback','/ə\'bæk/','(phó từ) lùi lại, trở lại phía sau;to stand aback from : đứng lùi lại để tránh (hàng hải) bị thổi ép vào cột buồm (buồm);to be taken aback : (hàng hải) bị gió thổi ép vào cột buồm;(nghĩa bóng) : sửng sốt, ngạc nhiên;to be taken aback by the news : sửng sốt vì cái tin đó'),
(75,'abacterial','','(tính từ) không do vi khuẩn gây ra'),
(76,'abaction','','(danh từ) (từ pháp) việc gia súc bị bắt trộm'),
(77,'abactus','','(tính từ) bị trụy thai'),
(80,'abaddon','/ə\'bædən/','(danh từ) âm ti, địa ngục, con quỷ'),
(81,'abaft','/ə\'bɑ:ft/','(phó từ) (hàng hải) ở phía sau bánh lái, gần phía bánh lái;(giới từ) (hàng hải) sau, ở đằng sau, ở phía sau;abaft the mast : sau cột buồm'),
(82,'abalienate','','(ngoại động từ) nhường lại tài sản'),
(86,'abalienation','','(danh từ) sự nhường lại tài sản'),
(87,'abalone','/,æbə\'louni/','(danh từ) (từ Mỹ, nghĩa Mỹ) bào ngư'),
(88,'abalones','/,æbə\'louni/','(danh từ số nhiều) (từ Mỹ, nghĩa Mỹ) bào ngư'),
(89,'abampere','','(Tech) abampe, ampe tuyệt đối (đơn vị cường độ tuyệt đối của dòng điện, 1 abampe = 10 ampe)'),
(90,'abandon','/ə\'bændən/','(ngoại động từ) (từ Mỹ,nghĩa Mỹ) từ bỏ, bỏ rơi, ruồng bỏ;to abandon a hope : từ bỏ hy vọng; to abandon one’’s wife and children : ruồng bỏ vợ con;to abandon oneself to : đắm đuối, chìm đắm vào (nỗi thất vọng...); (danh từ) sự phóng túng, sự tự do, sự buông thả;with abandon : phóng túng'),
(91,'abandon call','','(Tech) gọi bỏ'),
(92,'abandoned','/ə\'bændənd/','(tính từ) bị bỏ rơi, bị ruồng bỏ, phóng đãng, truỵ lạc'),
(93,'abandoner','/ə\'bændənə/','(danh từ) (pháp lý) người rút đơn'),
(94,'abandoners','/ə\'bændənəs/','(danh từ số nhiều) (pháp lý) người rút đơn'),
(96,'abandonment','/ə\'bændənmənt/','(danh từ) sự bỏ, sự từ bỏ, sự bỏ rơi, sự ruồng bỏ, tình trạng bị bỏ rơi, tình trạng bị ruồng bỏ, sự phóng túng, sự tự do, sự buông thả'),
(99,'abapikal','','(tính từ) (sinh học) xa đỉnh, xa ngọn, dưới vực'),
(100,'abarticular','','(tính từ) (giải phẫu) học ngoài khớp, trật khớp'),
(102,'abase','/ə\'beis/','(ngoại động từ) làm hạ phẩm giá, làm mất thể diện, làm nhục;to abase one-self : tự hạ mình'),
(104,'abasement','/ə\'beismənt/','(danh từ) sự làm hạ phẩm giá, sự làm mất thể diện, sự làm nhục'),
(107,'abash','/ə\'bæʃ/','(ngoại động từ) làm bối rối, làm lúng túng, làm luống cuống'),
(108,'abashed','','(tính từ) bối rối, xấu hổ'),
(111,'abashment','/ə\'bæʃmənt/','(danh từ) sự bối rối, sự lúng túng, sự luống cuống'),
(112,'abashments','/ə\'bæʃmənt/','(danh từ)  sự bối rối, sự lúng túng, sự luống cuống'),
(114,'abask','/ə\'bɑ:sk/','(phó từ) (thơ ca) dưới ánh nắng, dưới ánh mặt trời, trong ánh lửa ấm'),
(115,'abatable','/ə\'beitəbl/','(tính từ) có thể làm dịu, có thể làm yếu đi, có thể giảm bớt có thể hạ, có thể bớt có thể làm nhụt có thể chấm dứt, có thể thanh trừ;(pháp lý) có thể huỷ bỏ, có thể thủ tiêu'),
(116,'abate','/ə\'beit/','(ngoại động từ) làm dịu đi, làm yếu đi, làm giảm bớt;to abate a pain : làm dịu đau hạ (giá), bớt (giá) làm nhụt (nhụt khí...), làm cùn (lưỡi dao...), làm mất hết (những điều khó chịu, bực bội) (pháp lý) huỷ bỏ, thủ tiêu (kỹ thuật) ;paint abates : cơn đau dịu đi;storm abates : cơn bão ngớt'),
(118,'abatement','/ə\'beitmənt/','(danh từ) sự dịu đi, sự yếu đi, sự nhụt đi, sự giảm bớt, sự đỡ, sự ngớt sự hạ (giá), sự bớt (giá) sự chấm dứt, sự thanh toán; (pháp lý) sự huỷ bỏ, sự thủ tiêu;abatement of a contract : sự huỷ bỏ một hợp đồng'),
(119,'Abatement cost','','(Econ) Chi phí kiểm soát, chi phí chống (ô nhiễm)'),
(121,'abater','','(danh từ) người giảm bớt; (y học) thuốc làm dịu'),
(124,'abatis','/\'æbətis/','(danh từ) , (số nhiều : abatis) (quân sự) đống cây chướng ngại, đống cây cản'),
(125,'abatised','/\'æbətist/','(tính từ) (quân sự) có đống cây chướng ngại, có đống cây cản'),
(127,'abattoir','/\'æbətwɑ:/','(danh từ) lò mổ, lò sát sinh'),
(129,'abaxial','','(tính từ) ở ngoài trục, xa trục'),
(130,'abaya','','(danh từ) áo aba (của người Ả Rập)'),
(131,'abb','/æb/','(danh từ) (nghành dệt) sợi canh, sợi khổ (của tấm vải)'),
(133,'abbacy','/\'æbəsi/','(danh từ) chức vị trưởng tu viện; quyền hạn trưởng tu viện'),
(134,'abbatial','/ə\'beiʃəl/','(tính từ) (thuộc) trưởng tu viện'),
(135,'abbess','/\'æbis/','(danh từ) bà trưởng tu viện'),
(137,'abbey','/\'æbi/','(danh từ) tu viện giới tu sĩ, các nhà tu, các bà xơ nhà thờ (lớn)'),
(139,'abbo','','(danh từ) người thổ dân, dân cư trú đầu tiên tại địa phương'),
(140,'abbot','/\'æbət/','(danh từ) cha trưởng tu viện'),
(142,'abbr','','(vt của abbreviated, abbreviation) viết tắt, chữ viết tắt'),
(143,'abbreviate','/ə\'bri:vieit/','(ngoại động từ) tóm tắt, viết tắt; rút ngắn lại (cuộc đi thăm...);(toán học) ước lược, rút gọn'),
(144,'abbreviated','/ə\'bri:vietid/','(tính từ) tóm tắt, viết tắt, rút ngắn lại ngắn cũn cỡn (quần áo...) '),
(145,'abbreviated address','','(Tech) địa chỉ rút gọn'),
(148,'abbreviation','/ə,bri:vi\'eiʃn/','(danh từ) sự tóm tắt, sự rút ngắn (cuộc đi thăm...), bài tóm tắt, chữ viết tắt;Jan is the abbreviation January : Jan là chữ viết tắt của January;(toán học) sự ước lược, sự rút gọn'),
(150,'abbreviator','/ə\'bri:vieitə/','(danh từ) người tóm tắt'),
(152,'abc','','(danh từ) bảng chữ cái, khái niệm cơ sở;(vt của American Broadcasting Company) Công ty phát thanh truyền hình Mỹ;(vt của Australian Broadcasting Commission) Uy ban phát thanh truyền hình Uc Đại Lợi'),
(153,'abc-book','','(danh từ) sách vỡ lòng, sách học vần'),
(154,'abcauline','','(tính từ) (sinh học) ngoài thân, xa thân'),
(155,'abdicable','','xem abdicate'),
(156,'abdicant','/\'æbdikeitə/','(danh từ) người từ bỏ, người thoái vị'),
(158,'abdicate','/\'æbdikeit/','(ngoại động từ) từ bỏ (quyền lợi, địa vị...);to abdicate a position : từ bỏ một địa vị;to abdicate all one’’s rights : từ bỏ mọi quyền lợi;(nội động từ) thoái vị, từ ngôi'),
(162,'abdication','/,æbdi\'keiʃn/','(danh từ) sự thoái vị, sự từ ngôi sự từ bỏ (địa vị, chức vụ, quyền lợi...)'),
(164,'abdicator','/\'æbdikeitə/;(abdicant) /\'æbdikənt/','(danh từ) người từ bỏ người thoái vị'),
(166,'abdomen','/\'æbdəmen/','(danh từ) bụng'),
(168,'abdominal','/æb\'dɔminl/','(tính từ) (thuộc) bụng, ở bụng;an abdominal operation : phẫu thuật ở bụng;abdominal cavity : khoang bụng'),
(169,'abdominally','','(phó từ) (thuộc) bụng, ở bụng'),
(170,'abdominous','/æb\'dɔminəs/','(tính từ) phệ bụng'),
(171,'abducens','','(danh từ) dây thần kinh não VI ra ngoài'),
(172,'abducent','/æb\'dju:sənt/','(tính từ) (giải phẫu) rẽ ra, giạng ra'),
(174,'abduct','/æd\'dʌkt/','(ngoại động từ) bắt cóc, cuỗm đi, lừa đem đi (người đàn bà...);(giải phẫu) rẽ ra, giạng ra'),
(177,'abduction','/æb\'dʌkʃn/','(danh từ) sự bắt cóc (trẻ em...), sự bắt đi, sự cuỗm đi, sự lừa đem đi; (giải phẫu) sự giạng ra'),
(179,'abductor','/æb\'dʌktə/','(danh từ) người bắt cóc, người cuỗm đi, người lừa đem đi;(giải phẫu) cơ giạng ((cũng) abductor muscle)'),
(182,'abeam','/ə\'bi:m/','phó từ (hàng hải),  (hàng không) đâm ngang sườn;abeam of us : ngang sườn chúng tôi, sóng ngang với chúng tôi'),
(183,'abearance','','(danh từ) phẩm hạnh;good abearance : phẩm hạnh tốt'),
(184,'abecedarian','/,eibi:si:\'deəriən/','(tính từ) sắp xếp theo thứ tự abc sơ đẳng dốt nát;(danh từ) (từ Mỹ,nghĩa Mỹ) học sinh vỡ lòng'),
(186,'abecedaries','','(danh từ) sách vỡ lòng, sách vần điều sơ bộ, điều sơ đẳng'),
(187,'abed','/ə\'bed/','(phó từ) ở trên giường;to lie abed : nằm ở trên giường'),
(188,'abele','/ə\'bi:l/','(danh từ) (thực vật học) cây bạch dương'),
(189,'abelmosk','/\'eibəlmɔsk/','(danh từ) (thực vật học) cây vông vàng'),
(190,'abend (abnormal ending)','','(Tech) kết thúc/chấm dứt bất thường'),
(191,'abenteric','','(tính từ) (giải phẫu) học ngoài ruột, xa ruột'),
(192,'aberrance','/æ\'berəns/;(aberrancy) /æ\'berənsi/','(danh từ) sự lầm lạc;(sinh vật học) sự khác thường'),
(195,'aberrancy','/æ\'berənsi/','(danh từ) sự lầm lạc ;(sinh vật học) sự khác thường');
/*!40000 ALTER TABLE `tbltest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-20 15:32:21
