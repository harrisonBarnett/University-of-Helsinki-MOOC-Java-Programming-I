/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_08.greeting;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        String input = scanner.nextLine();

        System.out.println("Hi " + input);
    }
}
