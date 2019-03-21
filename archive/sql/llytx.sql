create database llytx;

use llytx;
CREATE TABLE `tx_event` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `app_id` varchar(100) NOT NULL,
  `process_id` varchar(50) NOT NULL,
  `stub_id` varchar(64) NOT NULL,
  `status` int(11) NOT NULL COMMENT '1-INIT，2-PENDING，3-PROCESSING，4-UNSOLVED，5-SOLVED',
  `tx_type` int(11) DEFAULT NULL COMMENT '1-TUS，2-TCC',
  `execute_times` int(11) NOT NULL DEFAULT '1',
  `execute_class_name` varchar(200) NOT NULL,
  `reverse_lookup_switch` int(11) DEFAULT '1' COMMENT ' 0-close，1-open',
  `reverse_lookup_class_name` varchar(200) DEFAULT '',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_stub_id_process_id` (`stub_id`,`process_id`) USING BTREE,
  KEY `idx_app_id` (`app_id`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=35858 DEFAULT CHARSET=utf8 COMMENT='transaction event table';