/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_22.averageofthreenumbers;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class AverageOfThreeNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Write your code here
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
        
        double avg = (first + second + third) / 3.0;
        
        System.out.println("The average is " + avg);
    }   
}

// represting the denominator (i.e. the number you divide the
// sum by, 2) as a double (2.0) ensures that the quotient is
// also a double