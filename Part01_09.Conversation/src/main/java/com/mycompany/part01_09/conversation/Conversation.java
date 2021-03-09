/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_09.conversation;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class Conversation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        
        System.out.println("Greetings! How are you doing?");
        String responseOne = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String responseTwo = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
