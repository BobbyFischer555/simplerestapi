package com.company.simplerestapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MainElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    private String plate_number;
    @OneToOne(fetch = FetchType.EAGER)
    private Registration registration;
    @OneToOne(fetch = FetchType.EAGER)
    private Vehicle vehicle;
    @OneToOne(fetch = FetchType.EAGER)
    private Insurer insurer;

    public String getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(String plate_number) {
        this.plate_number = plate_number;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Insurer getInsurer() {
        return insurer;
    }

    public void setInsurer(Insurer insurer) {
        this.insurer = insurer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainElement that = (MainElement) o;
        return Objects.equals(plate_number, that.plate_number) &&
                Objects.equals(registration, that.registration) &&
                Objects.equals(vehicle, that.vehicle) &&
                Objects.equals(insurer, that.insurer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate_number, registration, vehicle, insurer);
    }
}
