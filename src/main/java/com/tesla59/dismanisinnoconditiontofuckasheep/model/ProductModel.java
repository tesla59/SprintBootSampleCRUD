package com.tesla59.dismanisinnoconditiontofuckasheep.model;

public class ProductModel {
    private int ID;
    private String Name;
    private int price;

    public ProductModel(int iD, String name, int price) {
        ID = iD;
        Name = name;
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
