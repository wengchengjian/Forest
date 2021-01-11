package com.weng.ssm.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author weng
 */
@Data
@ToString
public class Notice implements Serializable{

    private static final long serialVersionUID = -4901560494243593100L;
    private Integer noticeId;

    private String noticeTitle;

    private String noticeContent;

    private Date noticeCreateTime;

    private Date noticeUpdateTime;

    private Integer noticeStatus;

    private Integer noticeOrder;
}