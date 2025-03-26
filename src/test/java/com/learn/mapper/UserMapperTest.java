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
    public void testSelectAll(){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
//        这个mapper对象就是UserMapper的实现类
//        getMapper是获取对应接口的实现类，用的时候就传入对应接口的class对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        我们可以通过这个实现类来操作数据库
        List<User> allUsers = mapper.getAllUsers();
        for(User user:allUsers){
            System.out.println(user);
        }
    }
}
