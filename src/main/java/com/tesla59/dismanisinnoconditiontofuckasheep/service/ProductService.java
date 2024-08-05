package com.tesla59.dismanisinnoconditiontofuckasheep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tesla59.dismanisinnoconditiontofuckasheep.model.ProductModel;
import com.tesla59.dismanisinnoconditiontofuckasheep.repository.ProductRepo;;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<ProductModel> getProducts() {
        return repo.findAll();
    }

    public ProductModel getProductByID(int ID) {
        return repo.findById(ID).orElse(new ProductModel(-1, null, -1));
    }

    public void addProduct(ProductModel product) {
        repo.save(product);
    }
}
