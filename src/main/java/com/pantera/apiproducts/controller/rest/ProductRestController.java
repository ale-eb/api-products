package com.pantera.apiproducts.controller.rest;

import com.pantera.apiproducts.domain.Product;
import com.pantera.apiproducts.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductRestController {

  private final ProductService productService;

  @GetMapping
  public List<Product> findAll() {
    return productService.findAll();
  }

  @GetMapping("/{id}")
  public Product findById(@PathVariable Long id) {
    return productService.findById(id);
  }
}
