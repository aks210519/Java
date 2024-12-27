package com.abhi.has_a_reln;

public class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }
    public void showStudentData(){
        System.out.println("Student id is :"+studentId);
        System.out.println("Student name is :"+studentName);
        System.out.println("college name is :"+college.collegeName);
        System.out.println("college location is :"+college.collegeLocation);





    }
}
