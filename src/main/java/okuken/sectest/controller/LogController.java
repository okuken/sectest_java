package okuken.sectest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class LogController {

	@GetMapping("/log")
	public String getLog() {
		return "log";
	}

	@PostMapping("/log")
	public String postLog(Model model, @RequestParam("message") String message) {

		log.info("message:" + message);

		model.addAttribute("message", message);
		return "log";
	}

}
