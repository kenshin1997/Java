package com.springapp.movie.controller.items;

import com.springapp.movie.exception.product.ProductNotFoundException;
import com.springapp.movie.models.product.Product;
import com.springapp.movie.service.mail.MailService;
import com.springapp.movie.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/category")
public class ItemsController {
    @Autowired
    ProductService productService;
    @Autowired
    MailService mailService;

    @GetMapping("{category}")
    public List<Product> getProductsByCategory(@PathVariable String category){
        List<Product>  products = productService.findProductsByCategory(category);
//        productService.addTest();
//        productService.addPhotos();
//        mailService.sendEmail("kenshin.1997@mail.ru","Hellow","Nihao bro1");
        if(products == null ) {
            throw  new ProductNotFoundException("Products from this category "+category+" not found " );
        }

     return products;
    }

}
