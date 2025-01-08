package com.example.fakestore.Services;

import com.example.fakestore.DTO.FakeStoreProductDTO;
import com.example.fakestore.Models.Category;
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

    @SuppressWarnings("null")
    public Product getProductbyId(long id) {
        Product p=restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreProductDTO.class).getProduct();
       return p;
    }

    public Product[] getAllProducts() {
         FakeStoreProductDTO[] dto=restTemplate.getForObject("https://fakestoreapi.com/products/", FakeStoreProductDTO[].class);
             Product[] p =new Product[dto.length];
             for(int i=0;i<dto.length;i++){
                 p[i]=dto[i].getProduct();
             }
            return p;
    }
            
    public Product createProduct(long id, String title, double price, String description, String imageUrl, String category) {
        FakeStoreProductDTO newdto = new FakeStoreProductDTO();
        newdto.setId(id);
        newdto.setTitle(title);
        newdto.setPrice(price);
        newdto.setDescription(description);
        newdto.setImage(imageUrl);
        newdto.setCategory(category);

        Product p = restTemplate.postForObject("https://fakestoreapi.com/products", newdto, FakeStoreProductDTO.class).getProduct();
        return p;
    }



}

