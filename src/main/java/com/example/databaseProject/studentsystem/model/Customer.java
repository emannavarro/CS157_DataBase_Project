package com.example.databaseProject.studentsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerID, firstName, lastName, streetAddress, city, stateAbbreviation,
            zipcode, country, emailAddress;

    public Customer() {
    }

    public Customer(String customerID,
            String firstName,
            String lastName,
            String streetAddress,
            String city,
            String stateAbbreviation,
            String zipcode,
            String country,
            String emailAddress) {

        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.stateAbbreviation = stateAbbreviation;
        this.zipcode = zipcode;
        this.country = country;
        this.emailAddress = emailAddress;
    }

    // Constructor without ID b/c db creates ID
    public Customer(
            String firstName,
            String lastName,
            String streetAddress,
            String city,
            String stateAbbreviation,
            String zipcode,
            String country,
            String emailAddress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.stateAbbreviation = stateAbbreviation;
        this.zipcode = zipcode;
        this.country = country;
        this.emailAddress = emailAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
                + ", streetAddress=" + streetAddress + ", city=" + city + ", stateAbbreviation=" + stateAbbreviation
                + ", zipcode=" + zipcode + ", country=" + country + ", emailAddress=" + emailAddress + "]";
    }

}