package com.corenetwork.examen_19_09_2024Ejercicio2.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table("patrones")

public class Patrones extends Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String carnet;
    @Column(name = "hrsnavegadas",nullable = false)
    private int horasnavegadas;
    @Column(name = "direccion",nullable = false,length = 90)
    private String direccion;
}
