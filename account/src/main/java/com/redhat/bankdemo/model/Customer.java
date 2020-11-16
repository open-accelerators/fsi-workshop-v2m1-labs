package com.redhat.bankdemo.model;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = -4797252086153559990L;

    private Long customerId;
    private String city;
    private String email;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String phone;
    private String state;
    private String street;
    private String zip;

    public Customer(String lastName, String firstName, String middleInitial, String street, String city, String state,
            String zip, String phone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public Customer(Long customerId, String lastName, String firstName, String middleInitial, String street,
            String city, String state, String zip, String phone, String email) {
        this.customerId = customerId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", lastName=" + lastName + ", firstName=" + firstName
                + ", middleInitial=" + middleInitial + ", city=" + city + ", email=" + email + "]";
    }

}
