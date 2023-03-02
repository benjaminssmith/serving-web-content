package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewGreetingController {
    private String email = "name@test.com";

	@GetMapping("/new-greeting")
    public String newGreetingModel(Model model) {
        model.addAttribute("email", email);
		return "new-greeting";
	}

}