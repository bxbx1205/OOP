class Box {
    double length; 
    double width;
    double height;


 Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double calculateVolume() {
        return length * width * height;
    }
}

public class Box2 {
    public static void main(String[] args) {
        Box intBox = new Box(5, 4, 3);
        System.out.println("Volume (int): " + intBox.calculateVolume());

        Box doubleBox = new Box(5.5, 4.2, 3.8);
        System.out.println("Volume (double): " + doubleBox.calculateVolume());
    }
}