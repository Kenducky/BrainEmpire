package com.tonine.mybrainempire.controller;

import com.tonine.mybrainempire.common.Result;
import com.tonine.mybrainempire.entity.Blogs;
import com.tonine.mybrainempire.service.BlogsService;
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

    @GetMapping("hello")
    public Result<List<Blogs>> hello() {
        List<Blogs> blogs = blogsService.pageSelect(0, 10);
        if (blogs != null) {
            log.info("blogSize:{}", blogs.size());
        }
        log.info("调用了hello接口");
        Result<List<Blogs>> result = new Result<>();
        result.success("查询成功！",blogs);
        return result;
    }
}
