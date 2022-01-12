package com.tonine.mybrainempire.modules.testmodule.service;

import com.tonine.mybrainempire.modules.testmodule.entity.Blogs;

import java.util.List;

/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */

public interface BlogsService{

    List<Blogs> pageSelect(int offset,int pageSize);
}
