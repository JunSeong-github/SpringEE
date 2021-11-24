package com.jun.web.controller.admin.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class JunNoticeController {

	@Autowired
	private ServletContext ctx;
	
	@RequestMapping("list")
	public String list() {
		
		return "admin.board.notice.list";
		
	}
	
	@GetMapping("reg") //등록 get요청
	public String reg()  {
		
		return "admin.board.notice.reg";
	}
	
	@PostMapping("reg") //등록 post요청
	public String reg(String title, String content, MultipartFile[] files, String category, String[] foods, String food, HttpServletRequest request) throws IllegalStateException, IOException {
		
		
		
		for (MultipartFile file : files) {
			long size = file.getSize();
			String fileName = file.getOriginalFilename();
			System.out.printf("fileName:%s,fileSize:%d\n", fileName, size);

			// ServletContext ctx =request.getServletContext();
			String webPath = "/static/upload";
			String realPath = ctx.getRealPath(webPath);
			System.out.printf("realPath : %s\n", realPath);
			File savePath = new File(realPath);
			// 업로드하기 위한 경로가 없을 경우
			if (!savePath.exists()) // 파일을 저장할 폴더가 존재하는지 경로확인
				savePath.mkdirs(); // mkdir은 맨끝에 경로만 확인해서 만들어줌, mkdirs는 그 사이에 없는 폴더도 다 만들어줌(확실해야할때 사용)

			realPath += File.separator + fileName; // File.separator현재 운영체제 맞게 구분자를 만들어줌 ex /
			File saveFile = new File(realPath);

			file.transferTo(saveFile); // 파일 저장

		}
		
		System.out.println(category);
		for(String f:foods)
			System.out.println(f); 
		
		return "admin.board.notice.reg";
		
		//return String.format("title:%s<br>content:%s<br>category:%s"
				//,title,content,category);
		
	}
	
	@RequestMapping("edit") //수정
	public String edit() {
		
		return "admin.board.notice.edit";
		
	}
	
	@RequestMapping("del")  //삭제
	public String del() {
		
		return "";
		
	}
	
}
