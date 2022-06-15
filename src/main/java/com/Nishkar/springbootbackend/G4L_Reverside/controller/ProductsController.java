package com.Nishkar.springbootbackend.G4L_Reverside.controller;

import com.Nishkar.springbootbackend.G4L_Reverside.exception.ResouceNotFoundException;
import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.Product;
import com.Nishkar.springbootbackend.G4L_Reverside.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product Product) {
        return productRepository.save(Product);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
        Product Product = productRepository.findById(id)
                .orElseThrow(() ->
                        new ResouceNotFoundException("Product ID " + id + " does not exist"));
        return ResponseEntity.ok(Product);
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product ProductDetails) {
        Product updateProduct = productRepository.findById(id)
                .orElseThrow(
                        () -> new ResouceNotFoundException("Product ID " + id + " does not exist"));
        updateProduct.setName(ProductDetails.getName());
        updateProduct.setDesc(ProductDetails.getDesc());
        updateProduct.setSku(ProductDetails.getSku());
        updateProduct.setCatergory(ProductDetails.getCatergory());
        updateProduct.setPrice(ProductDetails.getPrice());
        updateProduct.setCreatedAt(ProductDetails.getCreatedAt());
        productRepository.save(updateProduct);
        return ResponseEntity.ok(updateProduct);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable Integer id) {
        Product deleteProduct = productRepository.findById(id)
                .orElseThrow(
                        () -> new ResouceNotFoundException("Product ID " + id + " does not exist"));
        productRepository.delete(deleteProduct);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

