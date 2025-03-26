package com.learn.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lhh
 */
public class MybatisUtil {
    // SqlSessionFactoryBuilder---->SqlSessionFactory---->SqlSession
    static SqlSessionFactory sqlSessionFactory = null;
    static{
        try {
            String resource = "mybatis-config.xml";
            // 读source文件下的mybatis.xml,将mybatis.xml文件转化成流
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 创建SQLSessionFactory工厂对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession() {
        // 创建SqlSession对象
        return  sqlSessionFactory.openSession();
    }
}