package org.learningSpring.respositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void addProduct(String name) {
        String query = "INSERT INTO Products VALUES (NULL, ?)";
        jdbcTemplate.update(query, name);
    }

//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void addProduct(String name) {
//        String query = "INSERT INTO Products VALUES (NULL, ?)";
//        jdbcTemplate.update(query, name);
//    }
}
