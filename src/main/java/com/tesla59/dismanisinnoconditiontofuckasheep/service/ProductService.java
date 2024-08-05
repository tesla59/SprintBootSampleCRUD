package com.tesla59.dismanisinnoconditiontofuckasheep.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.tesla59.dismanisinnoconditiontofuckasheep.model.ProductModel;;

@Service
public class ProductService {
    private List<ProductModel> ProductList = new ArrayList<>(Arrays.asList(
            new ProductModel(1, "IPhone", 100),
            new ProductModel(2, "Samsung", 200)));

    public List<ProductModel> getProducts() {
        return ProductList;
    }

    public ProductModel getProductByID(int ID) {
        return ProductList.stream()
                .filter(p -> p.getID() == ID)
                .findFirst().orElse(new ProductModel(-1, "Item Not Found", 0));
    }

    public void addProduct(ProductModel product) {
        ProductList.add(product);
    }
}
