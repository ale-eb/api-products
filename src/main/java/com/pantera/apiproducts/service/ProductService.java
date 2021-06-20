package com.pantera.apiproducts.service;

import com.pantera.apiproducts.domain.Product;

import java.util.List;

public interface ProductService {

  List<Product> findAll();
  Product findById(Long id);
}
