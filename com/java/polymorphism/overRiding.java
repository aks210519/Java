package com.java.polymorphism;

public class overRiding {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        s1.show();
    }

    }



   class Super {
    public void show()
    {
        System.out.println("Super class show method");
    }
}
class Sub extends Super{
    public void show()
    {
        //super.show();    -->> for showing super class show method
        System.out.println("Sub class show method");
    }
}

