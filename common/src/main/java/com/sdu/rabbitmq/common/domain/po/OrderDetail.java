package com.sdu.rabbitmq.common.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sdu.rabbitmq.common.commons.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
public class OrderDetail {

    @TableId
    private Long id;

    private OrderStatus status;

    private String address;

    private Long accountId;

    private Long deliverymanId;

    private Long rewardId;

    private BigDecimal price;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date createTime;
}
