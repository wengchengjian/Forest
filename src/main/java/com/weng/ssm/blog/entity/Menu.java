package com.weng.ssm.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author weng
 */
@Data
@ToString
public class Menu implements Serializable {
    private static final long serialVersionUID = 489914127235951698L;
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;

}