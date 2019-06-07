package demo.BITdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
    Dao<Inventory> inventoryDao;

	
	@RequestMapping("/")
    public String viewHome() {
        return "index";
    }
		
	@RequestMapping("/page2")
    public String viewpage2() {
			
		List<Inventory> list = inventoryDao.loadAll();
        System.out.println("Loaded all: " + list);
		
        return "page2";
    }
	
	@RequestMapping("/page3")
    public String viewpage3() {
        return "page3";
    }

}
