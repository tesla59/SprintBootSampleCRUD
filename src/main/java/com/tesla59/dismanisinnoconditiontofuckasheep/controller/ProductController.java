package com.tesla59.dismanisinnoconditiontofuckasheep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesla59.dismanisinnoconditiontofuckasheep.service.ProductService;
import com.tesla59.dismanisinnoconditiontofuckasheep.model.ProductModel;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<ProductModel> getProducts() {
        return productService.getProducts();
    }
}
