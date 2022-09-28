package com.hospital.luminary.models;

import com.hospital.luminary.enums.HealthProfessionalType;

public class Nurse extends HealthProfessional{

    public Nurse(String name) {
        super(name);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.NURSE;
    }
}
