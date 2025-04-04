//6D
// Write a java program with the serializationwith static members

class Employee implements Serializable{
    int id;
    String name;
    static String company = "SSS IT Pvt Ltd";
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
}