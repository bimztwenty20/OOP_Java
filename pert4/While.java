/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert4;

import java.util.Scanner;

/**
 *
 * @author Metz
 */
public class While {
    
    public static void main(String[] args) {
        
        boolean running = true;
        int i = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while (running) {            
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [ya/tidak] ");
            
            jawab = scan.nextLine();
            
            if (jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            i++;
        }
    System.out.println("Anda sudah melakukan perulangan sebanyak " +i+ " kali");    
    }
    
}
