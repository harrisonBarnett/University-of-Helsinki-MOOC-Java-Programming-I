/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_27.ancient;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class Ancient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());
        
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
