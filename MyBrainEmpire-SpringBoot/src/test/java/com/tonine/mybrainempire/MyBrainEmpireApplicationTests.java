package com.tonine.mybrainempire;

import com.tonine.mybrainempire.modules.testmodule.dao.BlogsMapper;
import com.tonine.mybrainempire.modules.testmodule.entity.Blogs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@SpringBootTest
class MyBrainEmpireApplicationTests {
    @Autowired
    BlogsMapper blogsMapper;

    @Test
    void test() {
        System.out.println("testStart");
        List<Blogs> blogs = blogsMapper.selectAllByTitleLike("test");
        List<Blogs> blogs1 = new ArrayList<>();
        Assertions.assertNotNull(blogs,"空了！怎么回事呢");
        Assertions.assertEquals(0, blogsMapper.selectAllByTitleLike("k").size(),"怎么回事，有数据");

        List<String> testss= new ArrayList<>();
        testss.add("");
        testss.add("123123");
        testss.add(null);
        testss.add("4123123");

        List<String> msisdns = testss.stream()
                .filter(Objects::nonNull)
                .sorted()
                .collect(Collectors.toList());



        System.out.println("testStop!");

    }


}
