package com.abhi.has_a_reln;

public class Main {
    public static void main(String[]args){
    College c1 = new College("GLA Institue","UP");
    Student s1=new Student(1,"Abhi",c1);
    s1.showStudentData();
}}
