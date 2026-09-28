/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesales;

/**
 *
 * @author Student
 */
public abstract class ConsoleInfo {
    public static void main(String[] args) {
    private String storeName;    
    private String deviceType;
    private int totalSales;
    
    public ConsoleInfo(String storeName, String deviceType, int totalSales){
        this.storeName = storeName;
        this.deviceType = deviceType;
        this.totalSales = totalSales;
    }
} 
}
