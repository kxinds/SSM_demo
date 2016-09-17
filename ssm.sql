/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-09-17 09:47:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('5', 'asd', 'asd', 'asd');
INSERT INTO `users` VALUES ('6', '1', '1', '133');
INSERT INTO `users` VALUES ('8', 'S', 'S', 'S');
INSERT INTO `users` VALUES ('9', '2223', '222', '222');
INSERT INTO `users` VALUES ('11', 's22', '22', '22');
INSERT INTO `users` VALUES ('15', 's', 's', 's');
INSERT INTO `users` VALUES ('16', '123', '123', '123');
