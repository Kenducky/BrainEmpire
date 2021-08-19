package com.tonine.mybrainempire.entity;

import java.util.Date;
import lombok.Data;

/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
/**
    * 用户表
    */
@Data
public class User {
    /**
    * id
    */
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 昵称
    */
    private String nickname;

    /**
    * 创建时间
    */
    private Date gmtCreated;

    /**
    * 最后登录
    */
    private Date lastLogin;

    /**
    * 等级
    */
    private Byte level;

    /**
    * 权限
    */
    private Byte authority;

    /**
    * 头像
    */
    private String avatar;

    private String email;
}