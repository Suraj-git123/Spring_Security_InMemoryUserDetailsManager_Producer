package com.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	@GetMapping("/producer")
	public String getMessage() {
		return "welcome to Producer";
	}
	@GetMapping("/home")
	public String getHome() {
		return "welcome to Home Page";
	}
	@GetMapping("/notes")
	public String getNotes() {
		return "notes are here";
	}
	@GetMapping("/profile")
	public String getProfile() {
		return "profile page";
	}
	@GetMapping("/videos")
	public String getVideos() {
		return "watch Videos Here";
	}
	
	@GetMapping("/contact")
	public String contactUs() {
		return "Contact Us";
	}
	@GetMapping("/about")
	public String aboutUs() {
		return "About Us";
	}

}
