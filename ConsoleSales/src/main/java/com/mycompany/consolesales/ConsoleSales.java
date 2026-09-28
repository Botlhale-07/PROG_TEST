/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesales;

/**
 *
 * @author Student
 */
import java.util.*;
public abstract class ConsoleSales extends ConsoleInfo implements IConsole {
    Scanner input = new Scanner(System.in);
    public ConsoleSales(String storeName, String deviceType, int totalSales){
        super(storeName, deviceType, totalSales);
    }
       
    public String setConsoleType(String deviceType){
        this.deviceType = deviceType;
    }
}
