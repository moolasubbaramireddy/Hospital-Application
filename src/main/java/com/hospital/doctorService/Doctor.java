package com.hospital.doctorService;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "doctor_name")
    private String name;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone_number")
    private String phone;
}
