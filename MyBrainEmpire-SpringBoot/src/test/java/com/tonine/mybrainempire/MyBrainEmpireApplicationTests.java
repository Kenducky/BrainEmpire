package com.tonine.mybrainempire;

import com.tonine.mybrainempire.modules.testmodule.dao.BlogsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBrainEmpireApplicationTests {
    @Autowired
    BlogsMapper blogsMapper;

    static final int MAXIMUM_CAPACITY = 1 << 30;
    @Test
    void test() {
        System.out.println("testStart");

        System.out.println("tableSizeFor(10) = " + tableSizeFor(10));
        System.out.println("testStop!");
    }

    int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }



}
