package com.csdProj.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String myMassage(){
		
		UserDetail ud =new UserDetail(); 
	    ud.setFirstName("Chandrashekhar");
		ud.setLastName("Dwivedi");
		
		return "Welcome Spring Boot Example!!!!"+" "+ ud;
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	public String getUser(@RequestParam String name){
			
		return "Welcome Mr"+name;  
	}
	
	@RequestMapping(value="/getUser2", method=RequestMethod.GET)
	public String getUser2(@RequestParam(value="myName") String name){ 
			
		return "Welcome Mr"+name;  
	}


}  
