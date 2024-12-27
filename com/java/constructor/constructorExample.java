package com.java.constructor;

public class constructorExample {
    constructorExample(String name) {
        System.out.println("Const. example"+name);
    }


    public static void main(String[] args) {
        constructorExample c1 = new constructorExample("Ramesh");
        constructorExample c2 = new constructorExample("amesh");

    }
}