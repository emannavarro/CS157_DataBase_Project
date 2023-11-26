package com.example.databaseProject.studentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String stateAbbreviation;
    private String zipcode;
    private String country;
    private String emailAddress;

    public User() {
    }

    public User(int userID,
            String firstName,
            String lastName,
            String streetAddress,
            String city,
            String stateAbbreviation,
            String zipcode,
            String country,
            String emailAddress) {

        this.userID = userID;
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
    public User(
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

    public int getuserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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
        return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
                + ", streetAddress=" + streetAddress + ", city=" + city + ", stateAbbreviation=" + stateAbbreviation
                + ", zipcode=" + zipcode + ", country=" + country + ", emailAddress=" + emailAddress + "]";
    }

}