package com.weng.ssm.blog.mapper;

import com.weng.ssm.blog.entity.ArticleCategoryRef;
import com.weng.ssm.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ArticleCategoryRefMapper {
    /**
     * create by: weng
     * description: 添加文章和分类关联记录
     * create time: 2021/1/8 17:52
     *
     * @param  record 关联对象
     * @return 影响行数
     */
    int insert(ArticleCategoryRef record);
    /**
     * create by: weng
     * description: 根据分类id删除记录
     * create time: 2021/1/8 17:53
     *
     * @param  categoryId
     * @return 影响行数
     */

    int deleteByCategoryId(Integer categoryId);
    /**
     * 根据文章ID删除记录
     * @param articleId 文章ID
     * @return 影响行数
     */
    int deleteByArticleId(Integer articleId);
    /**
     * create by: weng
     * description: 根据分类Id统计文章数
     * create time: 2021/1/8 17:55
     *
     * @param categoryId 分类id
     * @return int 文章数量
     */
    int countArticleByCategoryId(Integer categoryId);
    /**
     * create by: weng
     * description: 根据文章Id查询分类Id
     * create time: 2021/1/8 17:57
     *
     * @param articleId 分类id
     * @return 分类id列表
     */
    List<Integer> selectCategoryIdByArticleId(Integer articleId);
    /**
     * create by: weng
     * description: 根据分类Id查询文章Id
     * create time: 2021/1/8 17:58
     *
     * @param   categoryId 分类id
     * @return  文章id列表
     */
    List<Integer> selectArticleIdByCategoryId(Integer categoryId);
    /**
     * create by: weng
     * description: 根据文章id获得分类列表
     * create time: 2021/1/8 18:01
     *
     * @param   articleId 文章id
     * @return  分类列表
     */
    List<Category> listCategoryByArticleId(Integer articleId);









}
