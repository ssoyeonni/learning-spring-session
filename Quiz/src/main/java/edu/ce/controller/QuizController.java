package edu.ce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.ce.model.domain.Customer2;

@Controller
public class QuizController {
	
	// 1. Customer2의 객체를 session에 저장하세요.
	@GetMapping("/quiz1")
	public String q1(Customer2 cust, Model sessionModel) {
		
		sessionModel.addAttribute("cust", cust);
		System.out.println(sessionModel.getAttribute("cust"));
		
		return "quizView";
	}
	
	// 2. 1번의 세션 값을 변경해주세요.(Customer2 객체 사용)
	@GetMapping("/quiz2")
	public String q2(Customer2 cust, Model sessionModel) {
		
		sessionModel.addAttribute("cust", cust);
		System.out.println(sessionModel.getAttribute("cust"));
		
		Customer2 cust2 = null;
		
		return "quizView2";
	}
	
}

