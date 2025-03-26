package com.learn.mapper;

import com.learn.pojo.User;

import java.util.List;

/**
 * @author lhh
 */
public interface IUserMapper {
    List<User> getAllUsers();

    User getUserById(Integer id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUserById(Integer id);
}
