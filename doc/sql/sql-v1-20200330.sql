-- book表
drop table if exists `book`;
CREATE TABLE `book` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `name` VARCHAR(100) NULL COMMENT '书名',
  `description` VARCHAR(200) NULL COMMENT '描述',
  `status` TINYINT(1) NULL DEFAULT 0 COMMENT '状态: 0=未阅读,1=阅读中,2=已读完',
  `create_at` TIMESTAMP(3) NULL COMMENT '创建时间',
  `update_at` TIMESTAMP(3) NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `NAME_UNIQUE` (`name` ASC),
  UNIQUE INDEX `STATUS_UNIQUE` (`status` ASC),
  UNIQUE INDEX `CREATE_AT_UNIQUE` (`create_at` ASC))
COMMENT = '书籍表';