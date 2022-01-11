package com.tonine.mybrainempire.modules.testmodule.entity;

import java.util.Date;
import lombok.Data;

/**
  * @author XiongYiGe
  * @date 2022/1/11
  * @description 
  */
@Data
public class CloudBusinessUploadLog {
    private Long logId;

    private String appId;

    private String businessId;

    private String phone;

    private Integer isAuths;

    private Integer status;

    private Date lastUpdateTime;
}