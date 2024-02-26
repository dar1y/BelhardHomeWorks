package com.company.professionals;

public class Driver {
    String fullName;
    int yearsOfExperience;

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    public Driver(String fullName, int yearsOfExperience) {
        this.fullName = fullName;
        this.yearsOfExperience = yearsOfExperience;
    }
}
