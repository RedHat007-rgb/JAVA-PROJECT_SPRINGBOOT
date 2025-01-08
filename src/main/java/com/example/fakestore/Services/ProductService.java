package com.example.fakestore.Services;

import com.example.fakestore.DTO.FakeStoreProductDTO;
import com.example.fakestore.Models.Product;

import java.util.List;

public interface ProductService {

    Product getProductbyId(long id);
    Product[] getAllProducts();
    Product createProduct(long id,String title,double price,String description,String imageUrl,String category);

}

