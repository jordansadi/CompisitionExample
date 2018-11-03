package com.company;

/**
 * This class defines a Student.
 * Created by jsadi on 11/3/2018
 * @author Jordan Sadi
 * @version 2018 1103 1
 */
public class Student {
    private String name;
    private int age;
    private Address address;

    /**
     * This constructor defines a Student
     * Each student must have a streetAddress, zipCode, state, phone, name, and age
     * @param streetAddress String the streetAddress for the Student
     * @param zipCode int the zipCode for the Student
     * @param state String the state for the Student
     * @param phone String the phone number for the Student
     * @param name String the name of the Student
     * @param age int the age of the Student
     */
    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        address = new Address(streetAddress, zipCode, state, phone);
        this.name = name;
        this.age = age;
    }

    /**
     * This method returns the name of a Student
     * @return String the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name of a Student to a specified value
     * @param name String the intended new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the age of a Student
     * @return int the age of the Student
     */
    public int getAge() {
        return age;
    }

    /**
     * This method sets the age of a Student to a specified value
     * @param age int the intended new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method returns the streetAddress of a Student
     * @return String the streetAddress of the Student
     */
    public String getStreetAddress() {
        return address.getStreetAddress();
    }

    /**
     * This method sets the streetAddress of a Student to a specified value
     * @param streetAddress String the intended new streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        address.setStreetAddress(streetAddress);
    }

    /**
     * This method returns the zipCode of a Student
     * @return int the zipCode of a Student
     */
    public int getZipCode() {
        return address.getZipCode();
    }

    /**
     * This method sets the zipCode of a Student to a specified value
     * @param zipCode int the intended new zipCode
     */
    public void setZipCode(int zipCode) {
        address.setZipCode(zipCode);
    }

    /**
     * This method returns the state of a Student
     * @return String the state of a student
     */
    public String getState() {
        return address.getState();
    }

    /**
     * This method sets the state of a Student to a specified value
     * @param state String the intended new state
     */
    public void setState(String state) {
        address.setState(state);
    }

    /**
     * This method returns the phone of a Student
     * @return String the phone of a Student
     */
    public String getPhone() {
        return address.getPhone();
    }

    /**
     * This method sets the phone of a Student to a specified value
     * @param phone String the intended new phone
     */
    public void setPhone(String phone) {
        address.setPhone(phone);
    }
}
