//6A
// Write a java program for serialization

import java.io.*;

class Person implements Serializable {  
    int id;
    String name;
    
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {  
    String course;
    int fee;

    public Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }
}

public class SerializeISA {  
    public static void main(String args[]) {  
        try {
            Student s1 = new Student(211, "Ravi", "Engineering", 50000);
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            
            out.writeObject(s1);
            out.flush();
            out.close();
            fout.close();
            
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();
            
            System.out.println(s.id + " " + s.name + " " + s.course + " " + s.fee);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}