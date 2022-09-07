DROP TABLE user_thumb;
CREATE TABLE `user_thumb`
(
    `like_id`          bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
    `like_item`        bigint DEFAULT NULL COMMENT '点赞的项',
    `like_user_id`     bigint DEFAULT NULL COMMENT '点赞人ID',
    `like_point`       bigint DEFAULT NULL COMMENT '点赞的分数1/0/-1',
    `like_create_time` datetime(0) DEFAULT NULL COMMENT '时间',
    PRIMARY KEY (`like_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '赞踩记录表';