package com.example.HelloHumanApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false) String name){
		
		if(name!=null) {
			return "Hello" +name;
		}
		return "Hello Human";
	}

}
