//3A
//JAVA program for scanner

import java.util.Scanner;

class Main{
    public static void main(String[] args){

        //creates an object
        Scanner input = new Scanner(System.in);

        //Takes input from keyboard
        String name = input.nextLine();

        //prints the name
        System.out.println("My name is "+name);
        input.close();
    }
}