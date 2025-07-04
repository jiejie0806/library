package com.nhXJH.web.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.nhXJH.common.annotation.Excel;
import com.nhXJH.web.domain.ApprovalQueue;
import com.nhXJH.web.domain.BasePurchaseRequisition;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * User: xjh
 * Date: 2025/3/21
 * Time: 13:46
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyMatterVO {
    /** 记录ID */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /** 当前处理批次ID */
    @Excel(name = "当前处理批次ID")
    @ApiModelProperty("当前处理批次ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long groupId;

    /** 处理类型，1表示采购申请，2表示图书销毁，3表示图书封存，4表示图书公开申请，等其他类型其他表示 */
    @Excel(name = "处理类型",readConverterExp = "1=采购申请,2=图书销毁,3=图书封存,4=图书公开申请,5=其他类型")
    @ApiModelProperty("处理类型，1表示采购申请，2表示图书销毁，3表示图书封存，4表示图书公开申请，等其他类型其他表示")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String queueType;

    /** 待处理人ID */
    @Excel(name = "待处理人ID")
    @ApiModelProperty("待处理人ID")
    private Long handelPersonal;

    /** 当前处理结点id */
    @Excel(name = "当前处理结点")
    @ApiModelProperty("当前处理结点")
    private Long handelNode;

    /** 待处理审批申请ID */
    @Excel(name = "待处理审批申请ID")
    @ApiModelProperty("待处理审批申请ID")
    private Long purchaseId;

    /** 是否已读，默认未读0，已读使用1表示 */
    @Excel(name = "是否已读",readConverterExp = "0=未读,1=已读")
    @ApiModelProperty("是否已读，默认未读0，已读使用1表示")
    private String hasRead;

    /** 处理结果，未处理0表示，已处理1表示 */
    @Excel(name = "处理结果",readConverterExp = "0=未处理,1=已处理")
    @ApiModelProperty("处理结果，未处理0表示，已处理1表示")
    private String result;

    /** 采购申请标题文字 */
    @Excel(name = "采购申请标题文字")
    @ApiModelProperty("采购申请标题文字")
    private String title;
}
