package springmvc.controller;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.services.UserServices;

@Controller
public class ContactController {
	@Autowired
	private UserServices services;
	@RequestMapping(path = "/contact",method = RequestMethod.GET)
	public String Show() {
		return "contact";
	}
//	@RequestMapping(path = "/contact-form",method = RequestMethod.POST)
//	public String HandleForm(@RequestParam(name = "email") String mail,@RequestParam("password") String pass,Model model) {
//		System.out.println(mail);
//		System.out.println(pass);
//		model.addAttribute("email", mail);
//		model.addAttribute("password", pass);
//		
//		return "success";
//	}
	
	@RequestMapping(path = "/contact-form",method = RequestMethod.POST)
	public String HandleForm(@ModelAttribute User user,Model model) {
		
		if(user.getPassword().isBlank()) {
			return "redirect:/contact";
		}
		//model.addAttribute("user", user);
		this.services.CreateUser(user);
		return "success";
	}

}
