package com.weng.ssm.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 文章分类关联表
 *
 * @author weng
 */
@Data
@ToString
public class ArticleCategoryRef implements Serializable{

    private static final long serialVersionUID = -6809206515467725995L;

    private Integer articleId;

    private Integer categoryId;

    public ArticleCategoryRef() {
    }

    public ArticleCategoryRef(Integer articleId, Integer categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
    }
}