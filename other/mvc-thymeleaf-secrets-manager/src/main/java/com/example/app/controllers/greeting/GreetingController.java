package com.example.app.controllers.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.commands.greeting.GreetingCommand;
import com.example.app.secretsmanager.services.SecretsManagerService;


@Controller
public class GreetingController {
	
	@Autowired
	private SecretsManagerService service;

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {		
			
		command.setText(service.getSecret().getMessage());
		return "greeting/greeting";
		
	}
	
}