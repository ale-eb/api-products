package com.pantera.apiproducts.service.impl;

import com.pantera.apiproducts.domain.Product;
import com.pantera.apiproducts.repository.ProductRepository;
import com.pantera.apiproducts.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Product> findAll() {
    return productRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Product findById(Long id) {
    return productRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No existe el producto buscado"));
  }
}
