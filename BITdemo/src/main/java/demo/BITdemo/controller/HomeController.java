package demo.BITdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
    public String viewHome() {
        return "index";
    }
	
	@RequestMapping("/page2")
    public String viewpage2() {
        return "page2";
    }
	
	@RequestMapping("/page3")
    public String viewpage3() {
        return "page3";
    }

}
