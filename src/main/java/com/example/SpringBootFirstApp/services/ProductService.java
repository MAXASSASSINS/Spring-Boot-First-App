package com.example.SpringBootFirstApp.services;

import com.example.SpringBootFirstApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products =  new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 70000),
            new Product(102, "S23", 43000),
            new Product(103, "Macbook", 92999)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream().filter(product -> product.getId() == id).toList().getFirst();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        for(int i = 0; i<products.size(); i++){
            if(products.get(i).getId() == product.getId()){
                products.set(i, product);
            }
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
