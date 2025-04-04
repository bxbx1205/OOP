// 3.B
// JAVA program for calculater using the concept of inheritence (overloading)


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator!");
        
        while (true) {
            // Get the operation
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);
            
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            
            double result = 0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }
            
            System.out.println("The result is: " + result);
            
            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String response = sc.next();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        sc.close();
        System.out.println("Goodbye!");
      }
}

