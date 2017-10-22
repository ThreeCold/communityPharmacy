SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_accounts`
-- ----------------------------
DROP TABLE IF EXISTS `t_accounts`;
CREATE TABLE `t_accounts` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(20) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  `password_salt` varchar(20) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_accounts
-- ----------------------------
INSERT INTO `t_accounts` VALUES ('1', '15869165643', '1105531204@qq.com', '7b65a5b85a93c00340d1b6d6b226610e', '123456', '1', '2017-10-22 18:48:47');

-- ----------------------------
-- Table structure for `t_categories`
-- ----------------------------
DROP TABLE IF EXISTS `t_categories`;
CREATE TABLE `t_categories` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_categories
-- ----------------------------

-- ----------------------------
-- Table structure for `t_drugs`
-- ----------------------------
DROP TABLE IF EXISTS `t_drugs`;
CREATE TABLE `t_drugs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `number` varchar(50) DEFAULT NULL,
  `component` varchar(200) DEFAULT NULL,
  `brand` varchar(50) DEFAULT NULL,
  `desc` varchar(200) NOT NULL,
  `taboo_crowd` varchar(200) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  `instructions` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_drugs
-- ----------------------------

-- ----------------------------
-- Table structure for `t_drug_category`
-- ----------------------------
DROP TABLE IF EXISTS `t_drug_category`;
CREATE TABLE `t_drug_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `drug_id` bigint(20) NOT NULL,
  `category_id` bigint(20) NOT NULL,
  `enabled` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_drug_category
-- ----------------------------

-- ----------------------------
-- Table structure for `t_drug_manufacturer`
-- ----------------------------
DROP TABLE IF EXISTS `t_drug_manufacturer`;
CREATE TABLE `t_drug_manufacturer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `drug_id` bigint(20) NOT NULL,
  `manufacturer_id` bigint(20) NOT NULL,
  `enabled` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_drug_manufacturer
-- ----------------------------

-- ----------------------------
-- Table structure for `t_in_orders`
-- ----------------------------
DROP TABLE IF EXISTS `t_in_orders`;
CREATE TABLE `t_in_orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `drug_id` bigint(20) NOT NULL,
  `in_price` double NOT NULL,
  `out_price` double NOT NULL,
  `out_factory_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `count` bigint(20) NOT NULL,
  `expire_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_in_orders
-- ----------------------------

-- ----------------------------
-- Table structure for `t_manufacturers`
-- ----------------------------
DROP TABLE IF EXISTS `t_manufacturers`;
CREATE TABLE `t_manufacturers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_manufacturers
-- ----------------------------

-- ----------------------------
-- Table structure for `t_month_sale_stat`
-- ----------------------------
DROP TABLE IF EXISTS `t_month_sale_stat`;
CREATE TABLE `t_month_sale_stat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `drug_id` bigint(20) NOT NULL,
  `total_count` bigint(20) NOT NULL,
  `total_price` double NOT NULL,
  `year` int(11) NOT NULL,
  `month` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_month_sale_stat
-- ----------------------------

-- ----------------------------
-- Table structure for `t_notices`
-- ----------------------------
DROP TABLE IF EXISTS `t_notices`;
CREATE TABLE `t_notices` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_id` bigint(11) NOT NULL,
  `type` int(11) NOT NULL,
  `content` varchar(200) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `watched` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_notices
-- ----------------------------

-- ----------------------------
-- Table structure for `t_out_orders`
-- ----------------------------
DROP TABLE IF EXISTS `t_out_orders`;
CREATE TABLE `t_out_orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `buyer_name` varchar(50) NOT NULL,
  `buyer_phone` varchar(20) NOT NULL,
  `sick_situation` varchar(200) NOT NULL,
  `total_price` double NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_out_orders
-- ----------------------------

-- ----------------------------
-- Table structure for `t_out_order_item`
-- ----------------------------
DROP TABLE IF EXISTS `t_out_order_item`;
CREATE TABLE `t_out_order_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `out_order_id` bigint(20) NOT NULL,
  `in_order_id` bigint(20) NOT NULL,
  `buy_count` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_out_order_item
-- ----------------------------

-- ----------------------------
-- Table structure for `t_repository`
-- ----------------------------
DROP TABLE IF EXISTS `t_repository`;
CREATE TABLE `t_repository` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `in_order_id` bigint(20) NOT NULL,
  `left_count` bigint(20) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repository
-- ----------------------------
