package com.niraj.simpleWebApp.controller;

import com.niraj.simpleWebApp.model.Product;
import com.niraj.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    Product product;
    @GetMapping("/products")
    public List<Product> getProduct() {
        return productService.getProducts();
    }
    @GetMapping ("/products/{prodId}")
    public Product getProductById(@PathVariable int  prodId) {
        return productService.getProductById(prodId);
    }
    @PostMapping("/products")
    public void setProduct( @RequestBody Product product) {
            productService.addProduct(product);
        }
        @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
            productService.updateProduct(product);

        }
        @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
          productService.deleteProduct(prodId);
        }
    }


