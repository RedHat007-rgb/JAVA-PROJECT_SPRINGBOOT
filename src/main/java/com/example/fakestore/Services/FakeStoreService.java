package com.example.fakestore.Services;

import com.example.fakestore.DTO.FakeStoreProductDTO;
import com.example.fakestore.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreService implements ProductService {

    public RestTemplate restTemplate;
    public FakeStoreService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public Product getProductbyId(long id) {
        Product  p=restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreProductDTO.class).getProduct();
        return p;
    }


    public List<Product> getAllProducts() {
        System.out.println("I am inside my service");
        System.out.println("coming out of service");
        return List.of();

    }

    public Product createProduct(Product product) {
        return null;
    }
}
