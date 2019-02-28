package com.greenfoxacademy.basicwebshop;

public class ItemModel {
    private String name;
    private String destripction;
    private int price;
    private int quantity;

    public ItemModel(String name,String destripction ,int price,int quantity) {
        this.name = name;
        this.destripction = destripction;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public String getDestripction() {
        return destripction;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
