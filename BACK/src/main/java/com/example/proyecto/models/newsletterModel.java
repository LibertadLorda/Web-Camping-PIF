package com.example.proyecto.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="newsletter")
@NoArgsConstructor
@AllArgsConstructor
public class modelsNewsletter
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "NameSurname")
    private String nameSurname;
    @Column(name ="Email")
    private String email;
    @Column (name = "Phone")
    private Float phone;
    @Column (name = "Language")
    private String language;


}
