package com.hospital.patientService;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_Id")
    private Long id;
    @Column(name = "patient_Name", nullable = false)
    private String name;
    @Column(name = "patient_email", unique = true)
    private  String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "patient_diseases",
            joinColumns = @JoinColumn(name = "patient_Id"),
            inverseJoinColumns = @JoinColumn(name = "disease_id")
    )
    private List<Disease> diseases;
}
