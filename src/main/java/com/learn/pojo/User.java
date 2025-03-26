package com.learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lhh
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //用户id
    private Integer id;
    //用户姓名
    private String name;
    //密码
    private String password;

}