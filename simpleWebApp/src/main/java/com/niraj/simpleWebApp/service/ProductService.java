package com.niraj.simpleWebApp.service;

import com.niraj.simpleWebApp.model.Product;
import com.niraj.simpleWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",5000),
//            new Product(102,"Oneplus",2000),
//            new Product(103,"Goole",4000)));

    public List<Product> getProducts(){
       return repo.findAll();
    }
    public Product getProductById(int id){
        return repo.findById(id).get();
    }
    public void addProduct(Product product){


           repo.save(product);

    }
    public void updateProduct(Product product){
      repo.save(product);

    }

    public void deleteProduct(int id){
    repo.deleteById(id);
    }

}
