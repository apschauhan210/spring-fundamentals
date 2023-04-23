package com.learningspring.springdata.controllers;

import com.learningspring.springdata.entities.Product;
import com.learningspring.springdata.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return service.allProducts();
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product newProduct = service.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @GetMapping("/all/sorted")
    public ResponseEntity<List<Product>> getSortedProduct() {
        return new ResponseEntity<>(service.sortedProduct(), HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<List<Product>> getPagedProduct(@RequestParam int page, @RequestParam int size) {
        return new ResponseEntity<>(service.productsByPage(page, size), HttpStatus.OK);
    }

    @GetMapping("/sortedpage")
    public ResponseEntity<List<Product>> getPagedProductSortedByName(@RequestParam int page, @RequestParam int size) {
        return new ResponseEntity<>(service.getPagedProductSortedByName(page, size), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProductByName(@RequestParam String name) {
        return new ResponseEntity<>(service.getProductByName(name), HttpStatus.OK);
    }
}
