drop table if exists demo_user;

CREATE TABLE `demo_user` (
  `id` int COMMENT '' NOT NULL AUTO_INCREMENT,
  `sex` int COMMENT '',
  `user_name` varchar(50) CHARACTER SET utf8 COMMENT '',
  `phone` varchar(50) CHARACTER SET utf8 COMMENT '',
  `address` varchar(300) CHARACTER SET utf8  COMMENT '',
  `reg_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='user table';

insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin', 0 , '5523380', 'ChengDu City', '2017-08-08');