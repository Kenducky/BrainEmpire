package com.tonine.mybrainempire.entity;

import java.util.Date;
import lombok.Data;

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

    private Date gmtCreated;

    private Date gmtModified;
}