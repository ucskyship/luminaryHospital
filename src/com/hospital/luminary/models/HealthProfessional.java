package com.hospital.luminary.models;

import com.hospital.luminary.enums.HealthProfessionalType;

public abstract class HealthProfessional {
    private int professionalId;
    private String firstName;
    private String lastName;
    private HealthProfessionalType healthProfessionalType;
    public abstract HealthProfessionalType getHealthProfessionalType();

    public HealthProfessional(String name) {
        this.firstName = name;
    }

    private HealthProfessionalType professionalType() {
        return null;
    }
    
    
    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
