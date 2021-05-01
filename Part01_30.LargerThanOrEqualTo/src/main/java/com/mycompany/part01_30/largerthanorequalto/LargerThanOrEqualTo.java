/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_30.largerthanorequalto;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        
        if (first > second) {
            System.out.println("Greater number is " + first);
        }
        else {
            System.out.println("Greatest number is " + second);
        }
    }
}
