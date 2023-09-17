package com.example.proyecto.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="booking")
@NoArgsConstructor
@AllArgsConstructor
public class bookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column (name = "Name")
    private String name;
    @Column (name = "Phone")
    private Integer phone;
    @Column (name = "Email")
    private String email;
    @Column(name ="FechaEntrada")
    private String entryDate;
    @Column(name = "FechaSalida")
    private String exitDate;
    @Column (name = "Comentarios")
    private String comments;
}
