package com.github.yunfeng.like.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LikeServiceTest {
    private static final int itemId = 1;
    private static final int userId = 1;
    @Autowired
    private LikeService likeService;

    @Test
    void like() {
        likeService.like(itemId, userId);
        Integer point = likeService.queryPoint(itemId);
        Assertions.assertEquals(1, point);
    }

    @Test
    void disLike() {
        Integer disLike = likeService.disLike(1, 1);
        Integer point = likeService.queryPoint(itemId);
        Assertions.assertEquals(-1, point);
    }
}