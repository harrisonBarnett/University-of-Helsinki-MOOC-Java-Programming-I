/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_34.same;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.println("Enter the first string: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String input2 = scanner.nextLine();
        
        if (input1.equals(input2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
    
}
