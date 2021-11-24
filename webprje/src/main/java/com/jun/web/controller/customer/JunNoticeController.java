package com.jun.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jun.web.entity.Notice;
import com.jun.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/") 
public class JunNoticeController {

	 @Autowired
		private NoticeService noticeService;
	
	@RequestMapping("list") 
	public String list(@RequestParam(name="p",defaultValue="1") int page) throws ClassNotFoundException, SQLException {
		
		//String p=request.getParameter("p");
		System.out.println("page:"+page);
		
		//List<Notice> list = noticeService.getList(1, "TITLE", "");
		
		return "notice.list";
	}
	
	@RequestMapping("Detail") 
public String detail() {
	return "notice.detail";
	}
	
}
