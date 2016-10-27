/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-27 13:49:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `price_id` int(11) DEFAULT NULL,
  `good_id` int(11) DEFAULT NULL,
  `good_title` varchar(100) DEFAULT NULL,
  `good_info` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `id_index` (`good_id`),
  KEY `price_index` (`price_id`),
  KEY `title_index` (`good_title`),
  KEY `info_index` (`good_info`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('1', '3', '1', '1', '12', '12');
INSERT INTO `order_info` VALUES ('2', '2', '2', '2', '22', '22');
