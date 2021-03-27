/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_18.sumofthreenumbers;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class SumOfThreeNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
        
        int sum = first + second + third;
        
        System.out.println("The sum of the numbers is " + sum);
        
    }
}
