/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_29.adulthood;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class Adulthood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.println("How old are you?");
        int answer = Integer.valueOf(scanner.nextLine());
        
        if (answer >= 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }
    }
}
