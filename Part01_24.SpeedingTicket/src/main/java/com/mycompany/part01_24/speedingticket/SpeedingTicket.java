/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_24.speedingticket;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class SpeedingTicket {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        if(speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
