/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesales;

/**
 *
 * @author Student
 */
 import java.util.Scanner
public class ConsoleSales {

    public ConsoleSales(String consoleType, String storeName, double totalSales) {
    }

    public static void main(String[] args) {
    

// Interface
interface IConsoles {

    String getConsoleType();

    String getStore();

    double getTotalSales();
}


// Abstract Console class
abstract class Console implements IConsoles {

    // Variables
    protected String consoleType;
    protected String store;
    protected double totalSales;

    // Constructor
    public Console(String consoleType, String store, double totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Get console type
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // Get store name
    @Override
    public String getStore() {
        return store;
    }

    // Get total sales
    @Override
    public double getTotalSales() {
        return totalSales;
    }
}
// ConsoleSales subclass

    private void printReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




// Main application class
public class RunApplication {

    public static void main(String[] args) {

        // Display console options
        try (Scanner input = new Scanner(System.in)) {
            // Display console options
            System.out.println("NUMBER 1 ELECTRONICS");
            System.out.println("====================");
            System.out.println("Select a console device:");
            System.out.println("1. PS5");
            System.out.println("2. XBOX");
            System.out.println("3. SWITCH");
            
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            
            input.nextLine(); // Clear the input buffer
            
            String consoleType;
            
            // Determine console type
            switch (choice) {
                case 1:
                    consoleType = "PS5";
                    break;
                    
                case 2:
                    consoleType = "XBOX";
                    break;
                    
                case 3:
                    consoleType = "SWITCH";
                    break;
                    
                default:
                    System.out.println("Invalid console choice.");
                    input.close();
                    return;
            }
            
            // Get store name
            System.out.print("Enter store name: ");
            String storeName = input.nextLine();
            
            // Get total sales
            System.out.print("Enter total amount of sales: R");
            double totalSales = input.nextDouble();
            
            // Create ConsoleSales object
            ConsoleSales sales = new ConsoleSales(
                    consoleType,
                    storeName,
                    totalSales
            );
            
            // Print report
            sales.printReport();
        }
    }
}

    }

