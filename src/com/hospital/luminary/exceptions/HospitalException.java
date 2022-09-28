package com.hospital.luminary.exceptions;

public class HospitalException extends Exception {
    public HospitalException(String message) {
        super(message);
    }

    public HospitalException(){
    }

    public HospitalException(Throwable cause){
        super(cause);
    }

    public HospitalException(String message, Throwable cause){
        super(message, cause);
    }
}
