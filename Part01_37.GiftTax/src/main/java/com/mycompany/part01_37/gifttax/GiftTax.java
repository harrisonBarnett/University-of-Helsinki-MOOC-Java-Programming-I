/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_37.gifttax;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.println("Value of the gift?");
        int input = Integer.valueOf(scanner.nextLine());
        
        if (input < 5000) {
            System.out.println("No tax!");
        } else if (input >= 5000 && input <= 25000) {
            System.out.println("Tax: " + (100 + (input - 5000)*.08));
        } else if (input >= 25000 && input <= 55000) {
            System.out.println("Tax: " + (1700 + (input - 25000)*.1));
        } else if (input >= 55000 && input <= 200000) {
            System.out.println("Tax: " + (4700 + (input - 55000)*.12));
        } else if (input >= 200000 && input <= 1000000) {
            System.out.println("Tax: " + (22100 + (input - 200000)*.15));
        } else if (input >= 1000000) {
            System.out.println("Tax: " + (142100 + (input - 1000000)*.17));
        }
    }
    
}
