//7C
//JAVA program to display priority of threads 

import java.lang.*;
public class ThreadPriorityExample extends Thread{
    public void run()
    {
        System.out.println("Inside the run() method");
    }
    public static void main(String[] args){
        ThreadPriorityExample th1=new ThreadPriorityExample();
        ThreadPriorityExample th2=new ThreadPriorityExample();
        ThreadPriorityExample th3=new ThreadPriorityExample();
        System.out.println("Priority of the thread th1 is :"+ th1.getPriority());
        System.out.println("Priority of the thread th2 is :"+ th2.getPriority());
        System.out.println("Priority of the thread th3 is :"+ th3.getPriority());    
    } 
}