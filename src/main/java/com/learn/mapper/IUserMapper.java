package com.learn.mapper;

import com.learn.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lhh
 */
public interface IUserMapper {
    @Select("select * from learn_mybatis where name = #{name} And password = #{password}")
        //当方法存在多个参数时，参数前必须加上@Param("name")注解
    User getUserByNameAndPass(@Param("name") String name, @Param("password") String password);
}
