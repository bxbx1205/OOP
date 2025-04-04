//3D (optional)
//Method Overriding


public class Vehicle {
    void run() {
        System.out.println("Vechile is running");
    }

    class Bike extends Vehicle {
        void run() {
            System.out.println("Bike is running");
        }
    }

    public static void main(String[] args) {
        Vehicle vechile = new Vehicle();
        Vehicle.Bike bike = vechile.new Bike();
        bike.run();
    }
}