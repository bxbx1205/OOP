//3C
//JAVA program to generate Banking System

import java.util.Scanner;

public class Bank {
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\nWelcome to the Banking System\n");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    System.out.println("Thank you");
                    scanner.close();
                    
                    return;
                default:
                    System.out.println("Invalid");
                    // goto :2
            }
        }
    }

    private static void checkBalance() {
        System.out.println("\nYour current balance is: $" + balance);
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("\nEnter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("\nInsufficient balance.");
        } else {
            balance -= amount;
            System.out.println("\nWithdrawal successful. New balance: $" + balance);
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("\nEnter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("\nDeposit successful.--> New balance: Rs." + balance);
    }
}
