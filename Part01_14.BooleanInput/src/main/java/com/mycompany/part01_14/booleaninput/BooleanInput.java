/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_14.booleaninput;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        System.out.println("Write something: ");
        boolean input = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + input);
        
    }
}

// boolean input will only return true if the input provided
// by the user is literally "true"
