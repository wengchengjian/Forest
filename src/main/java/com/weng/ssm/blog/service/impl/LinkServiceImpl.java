package com.weng.ssm.blog.service.impl;

import com.weng.ssm.blog.entity.Link;
import com.weng.ssm.blog.mapper.LinkMapper;
import com.weng.ssm.blog.service.LinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 *
 * @author 言曌
 * @date 2017/9/4
 */
@Service
@Slf4j
public class LinkServiceImpl implements LinkService {
	
	@Autowired
	private LinkMapper linkMapper;
	
	@Override
	public Integer countLink(Integer status)  {
		return linkMapper.countLink(status);
	}
	
	@Override
	public List<Link> listLink(Integer status)  {
		return linkMapper.listLink(status);
	}

	@Override
	public void insertLink(Link link)  {
		linkMapper.insert(link);
	}

	@Override
	public void deleteLink(Integer id)  {
		linkMapper.deleteById(id);
	}

	@Override
	public void updateLink(Link link)  {
		linkMapper.update(link);
	}

	@Override
	public Link getLinkById(Integer id)  {
		return linkMapper.getLinkById(id);
	}

}
