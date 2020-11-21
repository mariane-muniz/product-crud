package com.store.product.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    private Integer id;
    
    @Column(nullable = false)
    private String code;
    
    @Column(nullable = false)
    private String name;
}