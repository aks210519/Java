package com.java.inheritance;
class A{
    void display(){
        System.out.println("Method of class A");
    }

}
class B extends A{
    void show(){
        System.out.println("Method of class B");
    }
}
class C extends B{
    void showdetails(){
        System.out.println("Method of class c");
    }
}


public class multilevelInheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.showdetails();
        c1.show();
        c1.display();

    }
}
