package com.company;

/**
 * This class defines an Address.
 * Created by jsadi on 11/3/2018
 * @author Jordan Sadi
 * @version 2018 1103 1
 */
public class Address {
    private String streetAddress;
    private int zipCode;
    private String state;
    private String phone;

    /**
     * This constructor defines an Address.
     * @param streetAddress String the street address for the Address
     * @param zipCode int the zip code of the Address
     * @param state String the state for the Address
     * @param phone String the phone number associated with the Address
     */
    public Address(String streetAddress, int zipCode, String state, String phone) {
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.state = state;
        this.phone = phone;
    }

    /**
     * This method returns the streetAddress of an Address
     * @return String the streetAddress of a given Address
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * This method sets the streetAddress to a specified value
     * @param streetAddress String the intended new streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * This method returns the zipCode of an Address
     * @return int the zipCode of a given Address
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * This method sets the zipCode to a specified value
     * @param zipCode int the intended new zipCode
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * This method returns the state of an Address
     * @return String the state of a given Address
     */
    public String getState() {
        return state;
    }

    /**
     * This method sets the state to a specified value
     * @param state String the intended new state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method returns the phone associated with an address
     * @return String the phone of a given address
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method sets the phone to a specified value
     * @param phone String the intended new phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
