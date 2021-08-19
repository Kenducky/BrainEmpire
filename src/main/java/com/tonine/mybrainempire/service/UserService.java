package com.tonine.mybrainempire.service;

import com.tonine.mybrainempire.entity.User;
    /**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
public interface UserService{


    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
