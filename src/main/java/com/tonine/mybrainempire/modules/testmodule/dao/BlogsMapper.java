package com.tonine.mybrainempire.modules.testmodule.dao;

import com.tonine.mybrainempire.modules.testmodule.entity.Blogs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author XiongYiGe
 * @date 2021/8/12
 * @description
 */
@Mapper
public interface BlogsMapper {

    List<Blogs> pageSelect(@Param("offset") int offset, @Param("pageSize") int pageSize);

    List<Blogs> selectAllByTitleLike(@Param("likeTitle")String likeTitle);


}