package springmvc.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(path ="/home")
	public String Home(Model model) {
		model.addAttribute("name", "Rabbi Khan");
		return "index";
	}
	@RequestMapping(path ="/help")
	public ModelAndView help() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Shakib Khan");
		modelAndView.setViewName("help");
		return modelAndView;
	}
	@RequestMapping(path = "/students/{id}")
	public String getStudent(@PathVariable("id") int id) {
		System.out.println(id);
		String string=null;
		System.out.println(string.length());
		return "form";
	}
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler({NullPointerException.class,IOException.class,ArithmeticException.class})
	public String handleException() {
		return "null_page";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String handleGenericException() {
		return "null_page";
	}
	
	
	
	
}
