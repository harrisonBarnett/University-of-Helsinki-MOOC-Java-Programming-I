/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_35.checkingtheage;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.println("How old are you? ");
        int age = Integer.valueOf(scanner.nextLine());
        
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
