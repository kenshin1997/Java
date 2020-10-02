package com.springapp.movie.controller.items;

import com.springapp.movie.exception.product.ProductNotFoundException;
import com.springapp.movie.models.product.Product;
import com.springapp.movie.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class ItemsController {
    @Autowired
    ProductService productService;


    @GetMapping("{category}")
    public List<Product> getProductsByCategory(@PathVariable String category)  {
        List<Product>  products = productService.findProductsByCategory(category);
//        productService.addTest();
        if(products == null ) {
            throw  new ProductNotFoundException("Products from this category "+category+" not found " );
        }

     return products;
    }
}
