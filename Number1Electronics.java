/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programmingproject;

/**
 *
 * @author Student
 */


    
        public class Number1Electronics {

    public static void main(String[] args) {

        // Single-dimensional array containing the city names
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        // Single-dimensional array containing console names


        // Two-dimensional array containing sales
        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        // Display the report heading
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------");

        // Display the column headings
        System.out.printf("%-18s%-10s%-10s%-10s%n",
                "CITY", "PS5", "XBOX", "SWITCH");

        // Display the sales data
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-10d%-10d%-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------");

        int highestTotal = 0;
        String cityWithMostSales = "";

        // Calculate and display total sales for each city
        for (int i = 0; i < cities.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            System.out.printf("%-18s%d%n", cities[i], total);

            // Find city with the highest sales
            if (total > highestTotal) {
                highestTotal = total;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
    }
}

    

