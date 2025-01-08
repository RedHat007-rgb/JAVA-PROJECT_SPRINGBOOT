package com.example.fakestore.DTO;

import com.example.fakestore.Models.Category;
import com.example.fakestore.Models.Product;

public class FakeStoreProductDTO {

    public long id;
    public String  title;
    public double price;
    public String description;
    public String image;
    public String category;

    public  Product getProduct(){
        Product p=new Product();
        p.setId(id);
        p.setTitle(title);
        p.setPrice(price);
        p.setDescription(description);
        p.setImageUrl(image);

        Category c=new Category();
        c.setTitle(category);
        p.setCategory(c);

        return p;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}


