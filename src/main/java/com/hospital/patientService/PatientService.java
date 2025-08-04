package com.hospital.patientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    public PatientRepo patientRepo;

    public List<Patient> getAllPatients(){
        return patientRepo.findAll();
    }

    public Patient addPatient(Patient patient){
        return patientRepo.save(patient);
    }

    public void deletePatient(Long id){
        patientRepo.deleteById(id);
    }
}
