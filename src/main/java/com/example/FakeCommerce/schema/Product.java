package com.example.FakeCommerce.schema;

import java.math.BigDecimal;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremting primary key especially for MySQL
    private long id; // primary key

    @Column(nullable = false) // title is required always never null
    private String title;

    @Column(columnDefinition = "TEXT") // description can be long text
    private String description;

    @Column(nullable = false) // price is required always never null
    private BigDecimal price;

    private String image;

    private String category;

    private String rating;

}