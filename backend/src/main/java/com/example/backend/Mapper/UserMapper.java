package com.example.backend.Mapper;

import com.example.backend.controller.request.UserPageRequest;
import com.example.backend.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    //@Select("select * from user")
    List<User> listUsers();

    List<User> listByCondition(UserPageRequest userPageRequest);
}
