package com.company.simplerestapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int Id;
    private String type;
    private String make;
    private String model;
    private String colour;
    private String vin;
    private int tare_weight;
    private String gross_mass;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getTare_weight() {
        return tare_weight;
    }

    public void setTare_weight(int tare_weight) {
        this.tare_weight = tare_weight;
    }

    public String getGross_mass() {
        return gross_mass;
    }

    public void setGross_mass(String gross_mass) {
        this.gross_mass = gross_mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return tare_weight == vehicle.tare_weight &&
                Objects.equals(type, vehicle.type) &&
                Objects.equals(make, vehicle.make) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(colour, vehicle.colour) &&
                Objects.equals(vin, vehicle.vin) &&
                Objects.equals(gross_mass, vehicle.gross_mass);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, make, model, colour, vin, tare_weight, gross_mass);
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", vin='" + vin + '\'' +
                ", tare_weight=" + tare_weight +
                ", gross_mass='" + gross_mass + '\'' +
                '}';
    }
}
