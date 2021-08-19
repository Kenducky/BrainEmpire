package com.tonine.mybrainempire.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tonine.mybrainempire.dao.UserMapper;
import com.tonine.mybrainempire.entity.User;
import com.tonine.mybrainempire.service.UserService;
/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

}
