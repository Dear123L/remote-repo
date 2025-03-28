package com.learn.mapper;

import com.learn.Util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.learn.pojo.User;

import java.util.List;

/**
 * @author lhh
 */
public class UserMapperTest {
    @Test
    public void testGetAllUsers(){
        // 先通过刚才写的工具类获取会话对象
        // Session就是会话，SqlSession就是指程序和数据库的会话，就是程序和数据库的连接
        SqlSession session = MybatisUtil.getSqlSession();
        // 使用会话对象的getMapper()方法可以获取mybatis动态生成的实现类
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        System.out.println(allUsers);
        session.close();
    }
    @Test
    public void testGetUserById(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        session.close();
    }
    @Test
    public void testInsertUser(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int result = mapper.insertUser(new User(null, "李四", "123456"));
        System.out.println(result);
        session.commit();
        session.close();
    }
    @Test
    public void testUpdateUser(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setPassword("789");
        int count = mapper.updateUser(user);
        System.out.println(count);
        session.commit();
        session.close();
    }
    @Test
    public void testDeleteUserById() {
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int result = mapper.deleteUserById(12);
        System.out.println(result);
        session.commit();
        session.close();
    }

    @Test
    public void testGetUserByNameAndPass(){
        SqlSession session = MybatisUtil.getSqlSession();
        IUserMapper mapper = session.getMapper(IUserMapper.class);
        User user = mapper.getUserByNameAndPass("hh","123456");
        System.out.println(user);
        session.close();
    }
}