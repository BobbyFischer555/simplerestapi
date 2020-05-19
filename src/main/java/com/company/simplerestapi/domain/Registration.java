package com.company.simplerestapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Registration {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int Id;
    private boolean expired;
    private String expiry_date;

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "expired=" + expired +
                ", expiry_date='" + expiry_date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return expired == that.expired &&
                Objects.equals(expiry_date, that.expiry_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expired, expiry_date);
    }
}
