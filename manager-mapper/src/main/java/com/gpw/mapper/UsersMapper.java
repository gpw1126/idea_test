package com.gpw.mapper;

import com.gpw.pojo.Users;

import java.util.List;

/**
 * @Author: Gpw
 * @Date: 2019/4/25
 * @Description: com.gpw.mapper
 * @Version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
