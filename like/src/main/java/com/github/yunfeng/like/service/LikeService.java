package com.github.yunfeng.like.service;

import com.github.yunfeng.like.mapper.UserThumbMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LikeService {
    private final UserThumbMapper userThumbMapper;
    public Integer like(Integer itemId, Integer userId) {
        return userThumbMapper.like(itemId, userId, 1);
    }

    public Integer disLike(Integer itemId, Integer userId) {
        return userThumbMapper.like(itemId, userId, -1);
    }

    public Integer queryPoint(Integer itemId) {
        return userThumbMapper.queryPoint(itemId);
    }
}
