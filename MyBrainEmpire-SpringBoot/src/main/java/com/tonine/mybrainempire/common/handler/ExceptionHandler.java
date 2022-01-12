package com.tonine.mybrainempire.common.handler;

import com.tonine.mybrainempire.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author XiongYiGe
 * @date 2021/12/20
 * @description
 */
@RestControllerAdvice
@Slf4j
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Result<String> exceptionHandler(Exception e){
        Result<String> result = new Result<>();
        log.error("error!",e);
        result.fail("出现全局错误！",e.toString());
        return result;
    }
}
