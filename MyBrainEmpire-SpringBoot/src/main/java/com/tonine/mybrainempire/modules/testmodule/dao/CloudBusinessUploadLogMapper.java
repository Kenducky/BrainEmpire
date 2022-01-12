package com.tonine.mybrainempire.modules.testmodule.dao;
import com.tonine.mybrainempire.modules.testmodule.entity.CloudBusinessUploadLog;
import org.apache.ibatis.annotations.Param;

/**
  * @author XiongYiGe
  * @date 2022/1/11
  * @description 
  */
public interface CloudBusinessUploadLogMapper {
    CloudBusinessUploadLog selectOneByLogId(@Param("logId")Long logId);


}