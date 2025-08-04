package com.hospital.doctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public Doctor addDoctor(Doctor doctor){
        return  doctorRepository.save(doctor);
    }

    public void deleteDoctorById(Long id){
         doctorRepository.deleteById(id);
    }
}
