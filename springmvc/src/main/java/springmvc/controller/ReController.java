package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
//	@RequestMapping("/one")
//	public String One() {
//		System.out.println("from one");
//		return "redirect:/two";
//	}
	
	@RequestMapping("/one")
	public RedirectView One() {
		System.out.println("from one");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	@RequestMapping("/two")
	public String Two() {
		System.out.println("from two method");
		return "";
	}

}
