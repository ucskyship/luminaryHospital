package com.hospital.luminary;

import com.hospital.luminary.enums.HealthProfessionalType;
import com.hospital.luminary.models.Doctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    @Test
    void shouldReturnDoctorType() {
        Doctor doctor = new Doctor("John");
        assertEquals(HealthProfessionalType.DOCTOR, doctor.getHealthProfessionalType());
    }
}