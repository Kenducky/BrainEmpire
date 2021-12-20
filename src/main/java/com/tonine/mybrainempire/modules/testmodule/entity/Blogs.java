package com.tonine.mybrainempire.modules.testmodule.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
  * @author XiongYiGe
  * @date 2021/8/12
  * @description 
  */
@Data
public class Blogs {
    private Long id;

    private String title;

    private String description;

    private String content;

    private String status;

    private String userId;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreated;

    private Date gmtModified;
}