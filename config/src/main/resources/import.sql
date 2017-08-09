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

insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin', 0 , '10000', 'ChengDu City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin1', 0 , '10000', 'ChongQing City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin2', 0 , '10000', 'BeiJing City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin3', 0 , '10000', 'GuangZhou City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin4', 0 , '10000', 'TianJin City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin5', 0 , '10000', 'WuHan City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin6', 0 , '10000', 'XiAn City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin7', 0 , '10000', 'ShangHai City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin8', 0 , '10000', 'NanChong City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin9', 0 , '10000', 'PaoTing City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin10', 0 , '10000', 'WuLuMuQi City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin11', 0 , '10000', 'ChengDu City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin12', 0 , '10000', 'ChengDu City', '2017-08-08');
insert into demo_user (user_name, sex, phone, address, reg_time) values ('xibin13', 0 , '10000', 'ChengDu City', '2017-08-08');