package com.pantera.apiproducts.repository;

import com.pantera.apiproducts.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
