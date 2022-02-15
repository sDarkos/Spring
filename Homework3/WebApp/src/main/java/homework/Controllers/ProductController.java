package homework.Controllers;

import homework.Model.Product;
import homework.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private Service service;

    @Autowired
    public void setService(Service service){
        this.service = service;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    public Product showProducts (Model model, @RequestParam int id){
        Product product = service.getProductById(id);
        return product;
    }

    @RequestMapping(value = "/showAll")
    public String Products(Model model){
        List<Product> products = service.getAllProducts();

        model.addAttribute("products", products);

        return "products";
    }

    @RequestMapping("/addProduct")
    public String addProduct(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "add-product-form";
    }

    @RequestMapping("/addResult")
    @ResponseBody
    public Product processForm (@ModelAttribute("product") Product product){
        service.addProduct(product);
        return product;
    }


}
