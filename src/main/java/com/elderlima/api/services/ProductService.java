package com.elderlima.api.services;

import com.elderlima.api.entities.Product;
import com.elderlima.api.entities.User;
import com.elderlima.api.repositories.ProductRepository;
import com.elderlima.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
