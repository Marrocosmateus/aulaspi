package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping ("/")
	public String index() {
		System.out.println("Chammou o metodo index");
		return "redirect:/eventos";
	}
	
	
}
