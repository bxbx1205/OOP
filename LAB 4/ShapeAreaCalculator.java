//4A


interface Shape {
    double calculateArea();
}


class Rectangle implements Shape {
    double length;
    double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    
    public double calculateArea() {
        return length * width;
    }
}


class Circle implements Shape {
    private double r;

    
    public Circle(double r) {
        this.r = r;
    }

    
    
    public double calculateArea() {
        return Math.PI * r * r;
    }
}


public class ShapeAreaCalculator {
    public static void main(String[] args) {
        
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        
        Shape circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
