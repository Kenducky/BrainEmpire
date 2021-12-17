package com.tonine.mybrainempire.service.impl;

import com.tonine.mybrainempire.dao.BlogsMapper;
import com.tonine.mybrainempire.entity.Blogs;
import com.tonine.mybrainempire.service.BlogsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    public List<Blogs> pageSelect(int offset, int pageSize) {
        return blogsMapper.pageSelect(offset,pageSize);
    }

}
