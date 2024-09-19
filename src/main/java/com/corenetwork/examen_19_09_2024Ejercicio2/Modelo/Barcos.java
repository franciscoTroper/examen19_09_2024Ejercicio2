package com.corenetwork.examen_19_09_2024Ejercicio2.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table("barcos")

public class Barcos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String matricula;
    @Column(name = "amarre",nullable = false,length = 30)
    private String amarre;
    @Column (name = "nombre",nullable = false,length = 30)
    private String nombre;
    @Column (name = "cuota",nullable = false)
    private double cuota;


}
