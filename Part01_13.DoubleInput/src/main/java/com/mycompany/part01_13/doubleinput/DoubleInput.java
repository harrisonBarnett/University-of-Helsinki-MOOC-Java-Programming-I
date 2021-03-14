/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_13.doubleinput;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        System.out.println("Give a number: ");
        double input = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + input);
        
    }
}
