package com.corenetwork.examen_19_09_2024Ejercicio2.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "socios")
public class Socios extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idsocio;
}
