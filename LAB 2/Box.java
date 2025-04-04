// Practice Problem
class Box{
    static int product(int l, int b, int h)
    {return l*b*h;
    }  
    static double product(double l, double b, double h)
    {return l*b*h;
    }

    public static void main (String[] args){
        System.out.println(Box.product(11,11,11));
        System.out.println(Box.product(12.3,12.6,12.8));
    }
}
