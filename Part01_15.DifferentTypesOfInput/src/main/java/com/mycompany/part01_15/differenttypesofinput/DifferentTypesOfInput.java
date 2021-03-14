/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_15.differenttypesofinput;

import java.util.Scanner;
/**
 *
 * @author Harrison
 */
public class DifferentTypesOfInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Give a string: ");
        String input1 = scanner.nextLine();
        System.out.println("Give an integer: ");
        int input2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double input3 = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean input4 = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + input1);
        System.out.println("You gave the integer " + input2);
        System.out.println("You gave the double " + input3);
        System.out.println("You gave the boolean " + input4);
        
    }
}
/*
using Integer.valueOf() and Double.valueOf() are useful when receiving
input from a user as the entire line is parsed as an integer. nextInt()
can be used, but any extraneous input (such as whitespace) may be passed
onto the next scanner call.
*/
