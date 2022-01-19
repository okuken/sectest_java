package okuken.sectest.controller;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.SerializationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import okuken.sectest.dto.UserInfo;

@Controller
public class DeserializeController {

	@GetMapping("/deserialize")
	public String get() {
		return "deserialize";
	}

	@PostMapping("/deserialize/serialize")
	public String serialize(Model model, @RequestParam("name") String name) {
		model.addAttribute("name", name);
		model.addAttribute("serializedObject", Base64.encodeBase64String(SerializationUtils.serialize(new UserInfo(name, UserInfo.TYPE_MEMBER))));
		return "deserialize";
	}

	@PostMapping("/deserialize/deserialize")
	public String deserialize(Model model, @RequestParam("object") String object) {

		UserInfo userInfo = (UserInfo)SerializationUtils.deserialize(Base64.decodeBase64(object));

		model.addAttribute("object", object);
		model.addAttribute("deserializedName", userInfo.getName());
		model.addAttribute("deserializedType", userInfo.getType());
		return "deserialize";
	}

}
