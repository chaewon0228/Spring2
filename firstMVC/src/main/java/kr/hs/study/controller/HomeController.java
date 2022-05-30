package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	// context path(root) : webapp
	
	// get������� /�� �������� �� �Ʒ� home()�Լ��� ����
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	// get������� /test�� �������� ��, �ֿܼ� ���
//	@RequestMapping(value="/test", method = RequestMethod.GET)
//	public String test() {
//		System.out.println("test");
//		return "/WEB-INF/views/index.jsp";
//	}
}