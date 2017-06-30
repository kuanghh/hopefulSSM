/*
Navicat MySQL Data Transfer

Source Server         : centos1-mysql
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : db1

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-30 19:02:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'haohua', '21');
INSERT INTO `t_user` VALUES ('2', 'haohua2', '22');
INSERT INTO `t_user` VALUES ('3', 'haohua3', '23');
INSERT INTO `t_user` VALUES ('4', 'haohua4', '24');
INSERT INTO `t_user` VALUES ('5', 'haohua5', '25');
INSERT INTO `t_user` VALUES ('6', 'haohua6', '26');
