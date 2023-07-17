package com.breze.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author tylt6688
 * @Date 2023/2/21 16:30
 * @Description 用于继承的VO实体父类
 * @Copyright(c) 2023 , 青枫网络工作室
 */
@ApiModel(value = "BaseVO", description = "VO 基类数据")
@Data
public class BaseVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "创建时间", name = "createTime", example = "2023-03-01 12:00:00", notes = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2023-03-01 12:00:00", notes = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "版本号", name = "version", example = "1", notes = "版本号")
    private Integer version;
}
