package com.example.proyecto.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="products")
@NoArgsConstructor
@AllArgsConstructor
public class models {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Type")
    private String prodType;
    @Column (name = "Price")
    private Float price;


}