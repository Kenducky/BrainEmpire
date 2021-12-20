package com.tonine.mybrainempire.common.handler;

import com.tonine.mybrainempire.common.entity.Result;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiongYiGe
 * @date 2021/12/20
 * @description
 */
@RestController
public class Error404Handler implements ErrorController {

    @RequestMapping("/error")
    public Result<String> exceptionHandler(Exception e){
        Result<String> result = new Result<>();
        result.fail("出现404错误！",e.getMessage());
        return result;
    }
}
