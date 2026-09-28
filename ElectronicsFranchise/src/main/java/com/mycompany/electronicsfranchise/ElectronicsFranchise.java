/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsfranchise;

/**
 *
 * @author Student
 */
import java.util.*;
public class ElectronicsFranchise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] city = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[][] sales = new int[3][3];
        int total = 0;
        int max = sales[0][0];
        for(int i = 0; i < city.length; i++){
            System.out.print("Enter number of sales of PS5 for " + city[i] + ": ");
            sales[i][0] = input.nextInt();
            System.out.print("Enter number of sales of XBOX for " + city[i] + ": ");
            sales[i][1] = input.nextInt();
            System.out.print("Enter number of sales of SWITCH for " + city[i] + ": ");
            sales[i][2] = input.nextInt();
        }
        
        System.out.println(" ");
        System.out.println("---------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------");
        
        System.out.printf("%-15s %-15s %-15s %-15s%n", " ", "PS5", "XBOX", "SWITCH");
        for(int i = 0; i < city.length; i++){
            System.out.printf("%-15s %-15d %-15d %-15d%n", city[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        
        System.out.println("---------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------");
        
         
        for(int i = 0; i < sales.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                total += sales[i][j];
            System.out.printf("%-15s %-15d%n", city[i], total);
            System.out.println(" ");
            if(sales[i][j] > max){
                max = sales[i][j];
            }
            System.out.println("CITY WITH THE MOST SALES: " + max );
            }
        }
        
        
    }
}
