package com.weng.ssm.blog.service;

import com.weng.ssm.blog.entity.Notice;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface NoticeService {

    /**
     * 获得公告列表
     *
     * @param status 状态
     * @return 列表
     */
    List<Notice> listNotice(Integer status);

    /**
     * 添加公告
     *
     * @param notice 公告
     */
    void insertNotice(Notice notice);

    /**
     * 删除公告
     *
     * @param id
     */
    void deleteNotice(Integer id);

    /**
     * 更新公告
     *
     * @param notice
     */
    void updateNotice(Notice notice);

    /**
     * 根据id查询公告
     *
     * @param id ID
     * @return 公告
     */
    Notice getNoticeById(Integer id);
}
