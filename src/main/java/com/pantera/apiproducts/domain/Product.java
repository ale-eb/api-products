package com.pantera.apiproducts.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double price;

  @Column(name = "create_at")
  @Temporal(TemporalType.DATE)
  private Date createAt;
}
