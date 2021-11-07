package com.cogent.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.model.ProdRepository;
import com.cogent.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProdRepository prodRepository;
	@GetMapping("/")
	public List<Product> getAllProduct(Model model){
		List<Product> prdlist=prodRepository.findAll();
		model.addAttribute("listdata",prdlist);		
		return prdlist;
		
	}
	
	@GetMapping("/ShowForm")
	public String display(Model m) {
		
		Product p=new Product();
		m.addAttribute("prd", p);
		return "new_product";
		
	}
	
	@PostMapping("/saveProduct")	
    public String saveEmployee
    (@ModelAttribute("prd") Product prd) {
        // save employee to database
        prodRepository.save(prd);
  //    return "redirect:/";//It works like a forward

        return "welcome";//It works like a forward
        // it will forward the request to request for /
    }

	
	
	
}
