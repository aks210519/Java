public class VariablesInJava {
    int marks;
    String name;
    Double weight;
    public void  student(String name, int marks, Double weight)
    {

        System.out.println("name : "+" "+name+" "+"marks :"+marks+" "+ "weight : "+weight);
//        System.out.println("marks"+" "+marks);
//        System.out.println("weight"+" "+weight);
    }
    public static void main(String[]args){
        VariablesInJava v1=new VariablesInJava();
        VariablesInJava v2=new VariablesInJava();

        v1.student("John",89,65.5);
        v2.student("Anil", 87,78.6);
    }


}
