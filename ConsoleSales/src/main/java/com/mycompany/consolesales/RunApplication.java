/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.consolesales;

/**
 *
 * @author Student
 */
import java.util.*;
public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       while(true){
        System.out.print("\nSelect the beverage type");
        System.out.print("1) PS5");
        System.out.print("2) XBOX");
        System.out.print("3) SWITCH");
        System.out.print("Select Choice: ");
        
        int choice = 0;
        
        switch(choice){
            case 1: 
                System.out.print("Enter the store: ");
                String store = input.nextLine();
                System.out.print("Enter the total sales of PS5 consoles for number ");
                String sales = input.nextLine();
            
            case 2: 
                System.out.print("Enter the store: ");
                String store = input.nextLine();
                System.out.print("Enter the total sales of XBOX consoles for number ");
        }
            
            }
       }
    }
    
}
