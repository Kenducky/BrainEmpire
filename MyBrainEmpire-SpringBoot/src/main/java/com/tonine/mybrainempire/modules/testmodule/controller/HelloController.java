package com.tonine.mybrainempire.modules.testmodule.controller;

import com.tonine.mybrainempire.common.entity.Result;
import com.tonine.mybrainempire.modules.testmodule.dao.BlogsMapper;
import com.tonine.mybrainempire.modules.testmodule.entity.Blogs;
import com.tonine.mybrainempire.modules.testmodule.service.BlogsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XiongYiGe
 * @date 2021/8/11
 * @description
 */
@RestController
@RequestMapping("/")
@Slf4j
public class HelloController {
    @Autowired
    BlogsService blogsService;
    @Autowired
    BlogsMapper blogsMapper;

    @GetMapping("hello")
    public Result<List<Blogs>> hello() {
        List<Blogs> blogs = blogsMapper.selectAllByTitleLike("te");
        if (blogs != null) {
            log.info("blogSize:{}", blogs.size());
        }
        log.info("调用了hello接口");
        Result<List<Blogs>> result = new Result<>();
        result.success("查询成功！",blogs);
        return result;
    }
}
