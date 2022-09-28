package com.hospital.luminary.models;

import com.hospital.luminary.enums.HealthProfessionalType;

public class Doctor extends HealthProfessional{

    public Doctor(String name){
        super(name);
    }


    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.DOCTOR;
    }
}
