/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_31.gradesandpoints;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // Write your code below
        
        System.out.println("Give points [0-100]: ");
        int grade = Integer.valueOf(scanner.nextLine());
        
        if (grade < 0) {
            System.out.println("Grade: impossible!");
        } else if (grade >= 0 && grade <= 49) {
            System.out.println("Grade: failed");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println("Grade: 1");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Grade: 2");        
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Grade: 3");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Grade: 4");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
        
    }
    
}
