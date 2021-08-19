package com.tonine.mybrainempire.dao;

import com.tonine.mybrainempire.entity.Blogs;

/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
public interface BlogsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Blogs record);

    int insertSelective(Blogs record);

    Blogs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Blogs record);

    int updateByPrimaryKey(Blogs record);
}