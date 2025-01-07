package com.example.fakestore.Services;

import com.example.fakestore.Models.Product;

import java.util.List;

public interface ProductService {

    Product getProductbyId(long id);
    List<Product> getAllProducts();
    Product createProduct(Product product);
}
