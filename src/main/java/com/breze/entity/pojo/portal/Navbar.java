package com.breze.entity.pojo.portal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.breze.entity.pojo.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 导航连接表
 * </p>
 *
 * @author leochan
 * @since 2022-10-08
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("tb_navbar")
@ApiModel(value = "Navbar", description = "导航对象,tb_navbar导航链接表")
public class Navbar extends BaseEntity {

    private static final long serialVersionUID = 3446692820178302161L;

    @ApiModelProperty("标题类型")
    private Long flag;

    @ApiModelProperty("序号")
    private Long orderNum;

    @ApiModelProperty("标题名称")
    private String titleName;

    @ApiModelProperty("跳转路径")
    private String titleUrl;

    @ApiModelProperty("父id")
    private Long parentId;
}
