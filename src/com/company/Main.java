package com.company;

/**
 * This is the driver class for this package.
 * It creates two instances of the Student class, then prints their name and home state.
 * Created by jsadi on 11/3/2018
 * @author Jordan Sadi
 * @version 2018 1103 1
 */
public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student("750 Main St.",55555, "Wisconsin",
                "414-262-5555", "Sue Shoe",  23);
        Student student2 = new Student("555 1st North St.",51515, "Illinois",
                "262-414-5555", "Bob Fredrickson",  32);

        System.out.println(student1.getName() + " is from " + student1.getState());
        System.out.println(student2.getName() + " is from " + student2.getState());
    }
}
