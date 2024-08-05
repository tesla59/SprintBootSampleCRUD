package com.tesla59.dismanisinnoconditiontofuckasheep.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.tesla59.dismanisinnoconditiontofuckasheep.model.ProductModel;;

@Service
public class ProductService {
    private List<ProductModel> ProductList = Arrays.asList(
            new ProductModel(1, "IPhone", 100),
            new ProductModel(2, "Samsung", 200));

    public List<ProductModel> getProducts() {
        return ProductList;
    }
}
