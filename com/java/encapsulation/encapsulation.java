package com.java.encapsulation;

class Employee{
    private int empID;
    private String empName;
    private double salary;
    public int getEmpID(){
        return empID;
    }
    public String getEmpName(){
        return empName;
    }
    public double getSalary(){
        return salary;
    }
    public void setEmpID(int empID)
    {
        this.empID=empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}




public class encapsulation {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        //Employee emp2 = new Employee();
        //For First emp
        emp1.setEmpID(111);
        emp1.setEmpName("Ravi");
        emp1.setSalary(50000.75);

        Employee emp2 = new Employee();
        //For 2nd Emp
        emp2.setEmpID(222);
        emp2.setEmpName("avi");
        emp2.setSalary(60000.87);


        // Getting and printing employee details of First Emp
        System.out.println("Employee ID: " + emp1.getEmpID());
        System.out.println("Employee Name: " + emp1.getEmpName());
        System.out.println("Employee Salary: " + emp1.getSalary());
        System.out.println();
         //Display details of Employee 2
        System.out.println("Employee 2 ID: " + emp2.getEmpID());
        System.out.println("Employee 2 Name: " + emp2.getEmpName());
        System.out.println("Employee 2 Salary: " + emp2.getSalary());
    }
}
