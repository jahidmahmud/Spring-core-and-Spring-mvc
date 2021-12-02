package productcrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrud.dao.ProductDao;
import productcrud.model.Product;

@Controller
public class ProductController {
	
	private ProductDao productDao;
	
	public ProductController(ProductDao productDao) {
		this.productDao=productDao;
	}

	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String home(Model m) {
		List<Product> allProducts = productDao.getAll();
		System.out.println(allProducts);
		m.addAttribute("products", allProducts);
		return "home";
	}
	
	@RequestMapping(path = "/add")
	public String addProduct(Model m ) {
		m.addAttribute("title", "Add Product");
		return "add_Product";
	}
	@RequestMapping(path = "/handle_product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product) {
		productDao.addProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("home");
		return redirectView;
	}
	
	@RequestMapping(path = "/update/{id}")
	public String update(@PathVariable("id") int id,Model m) {
		Product singeProduct = this.productDao.getSingleProduct(id);
		m.addAttribute("product", singeProduct);
		return "update_form";
	}
	@RequestMapping(path = "/handle_update_product",method = RequestMethod.POST)
	public RedirectView handleUpdateProduct(@ModelAttribute Product product) {
		RedirectView redirectView=new RedirectView();
		productDao.updateProduct(product);
		redirectView.setUrl("home");
		return redirectView;
		
	}
	
	@RequestMapping(path = "/delete/{id}")
	public RedirectView deleteProduct(@PathVariable("id") int id,HttpServletRequest request) {
		Product singleProduct = productDao.getSingleProduct(id);
		productDao.deleteProduct(singleProduct);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/home");
		return redirectView;
	}

}
