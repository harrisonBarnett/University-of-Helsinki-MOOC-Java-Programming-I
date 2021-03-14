/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_12.integerinput;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + input);

    }
}
