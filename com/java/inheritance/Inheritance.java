package com.java.inheritance;

class Vehicle{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println("Price is : "+price);
        System.out.println("Milege is : "+mileage);
        System.out.println("Color is : "+color);
    }
}
class Car extends Vehicle{
    String carName;
    int modelYear;
    String fuelType;
    Boolean sunRoof;
   void showCarDetails(){
       System.out.println("Car name is : "+carName);
       System.out.println("Model year is :"+modelYear);
       System.out.println("Fuel type is : "+fuelType);
   }
}

public class Inheritance {
    public static void main(String[] args) {
        Car Nexon = new Car();
        Nexon.price=1200000.50;
        Nexon.mileage=35;
        Nexon.color="Silver";
        Nexon.carName="Tata Nexon";
        Nexon.modelYear=2023;
        Nexon.fuelType="Diesel";
        Nexon.sunRoof=true;
        Nexon.display();
        Nexon.showCarDetails();

    }
}
