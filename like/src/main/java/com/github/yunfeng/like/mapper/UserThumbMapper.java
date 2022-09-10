package com.github.yunfeng.like.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserThumbMapper {

    @Insert("INSERT INTO user_thumb (like_item, like_user_id, like_point, like_create_time) VALUES (#{itemId},#{userId},#{point}, now()) " +
            "ON DUPLICATE KEY UPDATE like_point = #{point}")
    Integer like(Integer itemId, Integer userId, Integer point);

    @Select("SELECT like_point FROM user_thumb where like_item = #{itemId}")
    Integer queryPoint(Integer itemId);
}
