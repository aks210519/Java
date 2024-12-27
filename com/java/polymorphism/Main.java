package com.java.polymorphism;

//Method Overloading
class Sum{
    int addition(int a, int b)
    {
        return a+b;
    }
    int addition(int a, int b, int c)
    {
        return a+b+c;

    }
    float addition(float a, float b)
    {
        return a+b;
    }
}

public class Main {
    public static void main(String[] args) {
        Sum c1 = new Sum();
        System.out.println(c1.addition(2,3));
        System.out.println(c1.addition(4,5,8));
        System.out.println(c1.addition(4.5f,8.6f));
    }
}
