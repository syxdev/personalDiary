CREATE DATABASE personalDiary;
USE personalDiary;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(200),
`password` VARCHAR(200),
address VARCHAR(200),
telephone VARCHAR(20),
email VARCHAR(64),
ip VARCHAR(20),
login_time DATETIME,
last_login_time DATETIME
)
