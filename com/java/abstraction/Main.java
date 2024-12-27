package com.java.abstraction;

abstract class Car {
    abstract public void fueltype();
    public void color(){
        System.out.println("Color of car is : Black");

    }
}
class Mahindra extends Car{
    public void fueltype(){
        System.out.println("Fuel type of Car is : Petrol");

    }
}

public class Main {
    public static void main(String[] args) {
        Mahindra SUV = new Mahindra();
        SUV.fueltype();
        SUV.color();

    }
}

// An absrtact class contains abstact keyword
//An abstract class contains abstract and non abstract methods
//An abstract method doesn't contains the body
//you cannot create instance of an abstract class directly
//An abstract class can be used by the subclass using the extend keyword and then we can create the object for the subclass to access the abstract method

