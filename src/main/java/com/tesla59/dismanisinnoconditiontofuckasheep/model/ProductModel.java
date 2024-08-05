package com.tesla59.dismanisinnoconditiontofuckasheep.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class ProductModel {
    @Id
    private Integer ID;
    private String Name;
    private Integer price;

    public ProductModel() {
    }

    public ProductModel(int iD, String name, int price) {
        this.ID = iD;
        this.Name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
