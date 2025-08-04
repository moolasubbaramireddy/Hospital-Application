package com.hospital.patientService;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "diseases")
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "disease_name", nullable = false)
    private String name;

}
