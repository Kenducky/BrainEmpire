package com.tonine.mybrainempire.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tonine.mybrainempire.dao.BlogsMapper;
import com.tonine.mybrainempire.entity.Blogs;
import com.tonine.mybrainempire.service.BlogsService;
/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
@Service
public class BlogsServiceImpl implements BlogsService{

    @Resource
    private BlogsMapper blogsMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Blogs record) {
        return blogsMapper.insert(record);
    }

    @Override
    public int insertSelective(Blogs record) {
        return blogsMapper.insertSelective(record);
    }

    @Override
    public Blogs selectByPrimaryKey(Long id) {
        return blogsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Blogs record) {
        return blogsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Blogs record) {
        return blogsMapper.updateByPrimaryKey(record);
    }

}
