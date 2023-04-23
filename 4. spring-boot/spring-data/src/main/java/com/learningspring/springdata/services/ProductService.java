package com.learningspring.springdata.services;

import com.learningspring.springdata.entities.Product;
import com.learningspring.springdata.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> allProducts() {
        return repository.findAll();
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> sortedProduct() {
        return repository.findAll(Sort.by("name").ascending());
    }

    public List<Product> productsByPage(int page, int size) {
        return repository.findAll(PageRequest.of(page, size)).getContent();
    }

    public List<Product> getPagedProductSortedByName(int page, int size) {
        Sort sort = Sort.by("name");
        return repository.findAll(PageRequest.of(page, size, sort)).getContent();
    }

    public List<Product> getProductByName(String name) {
        return repository.findProductByName(name);
    }
}
