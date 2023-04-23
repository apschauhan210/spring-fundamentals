package com.learningspring.springdata.repositories;

import com.learningspring.springdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public List<Product> findProductByName(String name);

}
