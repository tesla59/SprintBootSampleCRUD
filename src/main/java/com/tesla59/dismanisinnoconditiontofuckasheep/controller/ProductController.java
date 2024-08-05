package com.tesla59.dismanisinnoconditiontofuckasheep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tesla59.dismanisinnoconditiontofuckasheep.service.ProductService;
import com.tesla59.dismanisinnoconditiontofuckasheep.model.ProductModel;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<ProductModel> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{ID}")
    public ProductModel getProductByID(@PathVariable int ID) {
        return productService.getProductByID(ID);
    }

    @PostMapping("/products")
    public void addProduct(@Validated @RequestBody ProductModel product) {
        productService.addProduct(product);
    }
}
