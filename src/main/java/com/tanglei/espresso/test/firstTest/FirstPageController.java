package com.tanglei.espresso.test.firstTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstPageController {
	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
}
