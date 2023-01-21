package com.glo.q1.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address {
    @Value("${address.house_no}")
    private String house_no;
    @Value("${address.street}")
    private String street;
    @Value("${address.city}")
    private String city;

    public Address() {
    }

    public Address(String house_no, String street, String city) {
        this.house_no = house_no;
        this.street = street;
        this.city = city;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
