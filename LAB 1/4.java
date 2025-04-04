class Employee {

    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insert(101, "Rohan", 45000);
        e2.insert(202, "Karan", 50000);
        e3.insert(303, "Aryan", 40000);

        e1.display();
        e2.display();
        e3.display();
    }
}
