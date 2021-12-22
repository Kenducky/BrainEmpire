package com.tonine.mybrainempire.modules.logmodule.controller;

import com.tonine.mybrainempire.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiongYiGe
 * @date 2021/12/20
 * @description
 */
@RestController
@Slf4j
@RequestMapping("/datalog")
public class Datalog {
    // TODO: 2021/12/20 数据埋点自行测试。
    @GetMapping("/log")
    public Result<String> datalog(String type,String data){
        return new Result<>();
    }

}
