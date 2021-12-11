package okuken.sectest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import okuken.sectest.form.SampleForm;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/get")
	public String get(Model model, @ModelAttribute SampleForm form) {
		return "sample";
	}

	@PostMapping("/post")
	public String post(Model model, @ModelAttribute SampleForm form) {
		System.out.println(form);
//		return "redirect:/sample/get";
		return "sample";
	}

}
