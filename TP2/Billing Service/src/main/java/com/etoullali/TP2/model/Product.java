package com.etoullali.TP2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private long price;
    private long quantity;
}
