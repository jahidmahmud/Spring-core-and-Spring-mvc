package springmvc.controller;

import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Emp;

@Controller
public class FormController {
	@RequestMapping("/form")
	public String getForm() {
		return "form";
	}
	@RequestMapping(path = "/submitform",method = RequestMethod.POST)
	public String formHandle(@ModelAttribute("emp") Emp emp,BindingResult result ) {
		if(result.hasErrors()) {
			return "form";
		}
		System.out.println(emp);
		return "confirm";
	}

}
