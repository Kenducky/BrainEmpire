package com.tonine.mybrainempire.modules.logmodule.controller;

import com.tonine.mybrainempire.common.entity.Result;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiongYiGe
 * @date 2021/12/20
 * @description
 */
@RestController
@Log4j2
@RequestMapping("/datalog")
public class Datalog {
    @GetMapping("/log")
    public Result<String> datalog(String type,String data){

        log.info("test");
        Result<String> objectResult = new Result<>();
        objectResult.success("success");
        return objectResult;
    }

}
