public class Exnullpt{
    void display(){
    try{
    String str = null;
    System.out.println(str.length());
    }catch (NullPointerException e){
    System.out.println(e);
    }
    System.out.println("Exception Handeled");
    }    
    public static void main(String args[]){
    Exnullpt obj = new Exnullpt();
    obj.display();
    }
}    