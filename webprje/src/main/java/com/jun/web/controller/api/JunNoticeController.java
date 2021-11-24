package com.jun.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jun.web.entity.Notice;
import com.jun.web.service.NoticeService;

@RestController("apiJunNoticeController")
@RequestMapping("/api/notice/")
public class JunNoticeController {

	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list() throws ClassNotFoundException, SQLException {
		
		List<Notice> list=service.getList(1,"title", "");
		
		return "공지사항 list";
	}
}
