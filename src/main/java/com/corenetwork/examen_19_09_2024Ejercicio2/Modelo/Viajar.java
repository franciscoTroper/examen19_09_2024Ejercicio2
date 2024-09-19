package com.corenetwork.examen_19_09_2024Ejercicio2.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "viajar")
public class Viajar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String destino;
    @Column(name = "fSalida")
    private LocalDate fechaSalida;
    @Column(name = "hsalida")
    private Date horaSalida;
}
