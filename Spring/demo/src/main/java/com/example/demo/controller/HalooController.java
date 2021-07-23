package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")

public class HalooController {

		@GetMapping 
		public String helloworld1() {
			return "Bora funciona Jesus";
		}
		
}
