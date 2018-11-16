/*
Navicat MySQL Data Transfer

Source Server         : 行睿 
Source Server Version : 50556
Source Host           : 120.27.21.18:3308
Source Database       : media

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2018-11-16 15:37:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  `orderid` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK58x4l9shxmkb7pismj4ilt7pj` (`uid`),
  CONSTRAINT `FK58x4l9shxmkb7pismj4ilt7pj` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('0', '3', '333333', '刚刚', null);
INSERT INTO `orders` VALUES ('1', '1', '11111', '张三 ', null);
INSERT INTO `orders` VALUES ('2', '2', '22222', '李四', null);
INSERT INTO `orders` VALUES ('3', '4', '444', '李四1', null);
INSERT INTO `orders` VALUES ('4', '2', '123', '一对多数据', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `regtime` datetime DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) NOT NULL,
  `reg_time` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '2222', null, null, null, null, '', '', '');
INSERT INTO `user` VALUES ('2', '李四1', '333', null, null, null, null, '', '', '');
INSERT INTO `user` VALUES ('3', '测试1', '测试', '测试', '测试', '2018-11-06 16:00:36', '测试', '测试', '测试', '测试');
INSERT INTO `user` VALUES ('4', '阿萨德1', '阿萨德', '阿萨德', '阿萨德', null, null, '', '', '');
INSERT INTO `user` VALUES ('5', null, null, null, null, null, null, '', '', '');
