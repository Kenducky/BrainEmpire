package com.tonine.mybrainempire.common.entity;

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

    public void success(T data) {
        this.setCode("0");
        this.setData(data);
        this.setMsg("操作成功");
    }

    public void success(String mess, T data) {
        this.setCode("0");
        this.setData(data);
        this.setMsg(mess);
    }

    public void fail(String mess) {
        this.setCode("-1");
        this.setData(null);
        this.setMsg(mess);
    }

    public void fail(String mess, T data) {
        this.setCode("-1");
        this.setData(data);
        this.setMsg(mess);
    }

}
