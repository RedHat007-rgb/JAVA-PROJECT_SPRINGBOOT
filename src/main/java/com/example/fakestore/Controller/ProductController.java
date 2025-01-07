package com.example.fakestore.Controller;

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
    public String getAllProducts(){
        System.out.println("My api starts here");
        fakeStoreService.getAllProducts();
        return "ends here";
    }

    @PostMapping("/create")
    public Product createProduct(Product Product){
        return null;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable long id){
        fakeStoreService.getProductbyId(id);
        return fakeStoreService.getProductbyId(id);

    }




}
