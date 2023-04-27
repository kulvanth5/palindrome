package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;


@RestController
public class ServiceController{

	@PostMapping("/")
	public Map<String,String> service(@RequestBody Map<String,String> map){

		String lps = palindrome.main(map.get("input"));

		return (lps);
	}
}
