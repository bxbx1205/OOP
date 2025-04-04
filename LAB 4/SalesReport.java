//4C
/* JAVA program thats prompt for and reads in the scale of 5 salespeople in a company .It then 
   prints out id and amount of sales for each salesperson and the total sales.Find and print the 
   maximum sale ,minimum sale and average sale. 
*/ 

   import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numSalespeople = 5;
        int[] sales = new int[numSalespeople];
        int[] ids = new int[numSalespeople];
        int totalSales = 0;
        int maxSale = Integer.MIN_VALUE;
        int minSale = Integer.MAX_VALUE;
        int maxSaleId = -1;
        int minSaleId = -1;

        // Input sales data
        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter salesperson ID: ");
            ids[i] = scanner.nextInt();
            System.out.print("Enter sales amount for salesperson " + ids[i] + ": ");
            sales[i] = scanner.nextInt();
            
            totalSales += sales[i];
            
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleId = ids[i];
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleId = ids[i];
            }
        }

        // Print sales data
        System.out.println("\nSales Report:");
        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Salesperson ID: " + ids[i] + ", Sales: " + sales[i]);
        }

        double averageSale = (double) totalSales / numSalespeople;
        System.out.println("\nTotal Sales: " + totalSales);
        System.out.println("Maximum Sale: " + maxSale + " (Salesperson ID: " + maxSaleId + ")");
        System.out.println("Minimum Sale: " + minSale + " (Salesperson ID: " + minSaleId + ")");
        System.out.printf("Average Sale: %.2f\n", averageSale);

        scanner.close();
    }
}
