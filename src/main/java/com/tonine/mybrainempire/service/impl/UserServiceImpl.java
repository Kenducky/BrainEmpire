package com.tonine.mybrainempire.service.impl;

import com.tonine.mybrainempire.dao.UserMapper;
import com.tonine.mybrainempire.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

}
