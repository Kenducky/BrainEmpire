package com.tonine.mybrainempire.modules.testmodule.service.impl;

import com.tonine.mybrainempire.modules.testmodule.service.UserService;
import com.tonine.mybrainempire.modules.testmodule.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

}
