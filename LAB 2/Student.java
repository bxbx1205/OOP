//2C
public class Student{
    int id;
    String name;
    Student(){
        System.out.println("This is default counstructor");
    }
    Student(int i,String n){
        id = i;
        name = n;
    }
    public static void main(String[] args){
        Student s = new Student();
        System.out.println("\nDefault Constructor values:\n");
        System.out.println("Student id : "+s.id +"\nStudent name : "+s.name);
        System.out.println("\nParameterized Constructor values:\n");
        Student student = new Student(10,"Rohan");
        System.out.println("Student ID : "+student.id+"\nStudent name : "+student.name);
    }
}