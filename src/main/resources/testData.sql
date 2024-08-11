CREATE DATABASE IF NOT EXISTS `sampledb`;
USE `sampledb`;
DROP TABLE `user`;


CREATE TABLE IF NOT EXISTS`user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `address` VARCHAR(255) NULL,
  `phone` VARCHAR(50) NULL,
  `update_date` DATETIME NOT NULL,
  `create_date` DATETIME NOT NULL,
  `delete_date` DATETIME NULL,
  PRIMARY KEY (`id`));

  DELETE FROM `user`;


  INSERT INTO `sampledb`.`user` (`name`, `address`, `phone`, `update_date`, `create_date`) VALUES
  ('テスト太郎', '東京都サンプル区1-1', '080-0000-0000', '2019-05-06 12:00:00', '2019-05-01 12:00:00'),
  ('テスト次郎', '東京都サンプル区1-1', '080-0000-0000', '2019-05-06 13:00:00', '2019-05-01 12:00:00'),
  ('テスト三郎', '東京都サンプル区1-1', '080-0000-0000', '2019-05-06 14:00:00', '2019-05-01 12:00:00'),
  ('テスト四郎', '東京都サンプル区1-1', '080-0000-0000', '2019-05-06 15:00:00', '2019-05-01 12:00:00'),
  ('テスト五郎', '東京都サンプル区1-1', '080-0000-0000', '2019-05-06 16:00:00', '2019-05-01 12:00:00');

