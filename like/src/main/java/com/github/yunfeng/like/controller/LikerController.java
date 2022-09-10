package com.github.yunfeng.like.controller;

import com.github.yunfeng.like.service.LikeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/like")
@RequiredArgsConstructor
public class LikerController {
    private final LikeService likeService;

    public Integer like(Integer itemId, Integer userId) {
        return likeService.like(itemId, userId);
    }

    public Integer disLike(Integer itemId, Integer userId) {
        return likeService.disLike(itemId, userId);
    }
}
