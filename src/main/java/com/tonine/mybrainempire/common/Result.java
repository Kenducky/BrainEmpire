package com.tonine.mybrainempire.common;

import lombok.Data;

/**
 * @author XiongYiGe
 * @date 2021/8/19
 * @description
 */
@Data
public class Result<T>{


    private String code;
    private String msg;
    private T data;

    public Result<T> success(T data) {
        Result<T> m = new Result<>();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }

    public Result<T> success(String mess, T data) {
        Result<T> m = new Result<>();
        m.setCode("0");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public Result<T> fail(String mess) {
        Result<T> m = new Result<>();
        m.setCode("-1");
        m.setData(null);
        m.setMsg(mess);
        return m;
    }

    public Result<T> fail(String mess, T data) {
        Result<T> m = new Result<>();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

}
