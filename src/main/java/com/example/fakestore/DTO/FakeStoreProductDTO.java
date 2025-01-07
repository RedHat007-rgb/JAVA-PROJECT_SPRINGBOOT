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
}


