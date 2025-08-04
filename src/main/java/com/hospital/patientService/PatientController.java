package com.hospital.patientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    public PatientService service;

    @GetMapping
    public List<Patient> getAllPatients(){
        return service.getAllPatients();
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient){
        return service.addPatient(patient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePatient(@PathVariable Long id){
        service.deletePatient(id);
        return ResponseEntity.ok().build();
    }
}
