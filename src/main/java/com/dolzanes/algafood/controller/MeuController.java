package com.dolzanes.algafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuController {
	
	@GetMapping("/api")
	@ResponseBody()
	public String api() {
		return "Testando!";
	}
	
	@GetMapping("/hello")
	@ResponseBody()
	public String hello() {
		return "ola";
	}
}
