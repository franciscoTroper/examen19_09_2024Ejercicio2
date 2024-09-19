package com.corenetwork.examen_19_09_2024Ejercicio2.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Inheritance
@Entity
@Table("persona")
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String dini;
    @Column(name = "asociado")
    private String asociado;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;

}
