package com.example.SpringBootFirstApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private String category;
    private BigDecimal price;
    private Date release_date;
    private int quantity;
    private boolean available;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
