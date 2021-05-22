/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_36.leapyear;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());
        
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
