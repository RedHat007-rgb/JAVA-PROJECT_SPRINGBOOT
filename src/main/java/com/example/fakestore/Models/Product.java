package com.example.fakestore.Models;

public class Product {
    public long id;
    public String title;
    public double price;
    public String description;
    public String imageUrl;
    public Category category;

    public Product(){

    }

    public Product(long id,String title,double price,String description,String imageUrl,Category category){
        this.id=id;
        this.title=title;
        this.price=price;
        this.description=description;
        this.imageUrl=imageUrl;
        this.category=category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
