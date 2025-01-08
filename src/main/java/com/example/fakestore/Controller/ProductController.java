package com.example.fakestore.Controller;

import com.example.fakestore.DTO.FakeStoreProductDTO;
import com.example.fakestore.Models.Product;
import com.example.fakestore.Services.FakeStoreService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    public FakeStoreService fakeStoreService;

    public ProductController(FakeStoreService fakeStoreService){
        this.fakeStoreService=fakeStoreService;
    }

    @GetMapping("/products")
    public Product[] getAllProducts(){
        fakeStoreService.getAllProducts();
        return fakeStoreService.getAllProducts();
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return fakeStoreService.createProduct(product.getId(), product.getTitle(), product.getPrice(), product.getDescription(), product.getImageUrl(),product.getCategory().getTitle());

    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable long id){
        fakeStoreService.getProductbyId(id);
        return fakeStoreService.getProductbyId(id);

    }

    public Product updateProduct(@RequestBody Product product){
        fakeStoreService.updateProduct(product.getId(), product.getTitle(), product.getPrice(), product.getDescription());
        return null;
    }




}
