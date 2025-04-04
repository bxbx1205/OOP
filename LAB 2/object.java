//2A
public class object  {
    int i = 5;
    object(){
        i = 5;
        System.out.println("constructor is called");
    }
    public static void main(String[] args){
        object O = new object();
        System.out.println("value of i : + 0.i");
        System.out.println(O);

    }
}