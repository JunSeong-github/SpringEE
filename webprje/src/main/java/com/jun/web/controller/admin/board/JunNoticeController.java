package com.jun.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class JunNoticeController {

	@RequestMapping("list")
	public String list() {
		
		return "";
		
	}
	
	@RequestMapping("reg") //���
	@ResponseBody
	public String reg(String title, String content, String category, String[] foods, String food) {
		System.out.println(category);
		for(String f:foods)
			System.out.println(f);
		return String.format("title:%s<br>content:%s<br>category:%s"
				,title,content,category);
		
	}
	
	@RequestMapping("edit") //����
	public String edit() {
		
		return "";
		
	}
	
	@RequestMapping("del")  //����
	public String del() {
		
		return "";
		
	}
	
}
