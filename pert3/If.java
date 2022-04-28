/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert3;
import java.util.Scanner;

/**
 *
 * @author Metz
 */
public class If {
    public static void main(String[] args) {
        
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Total belanjaan : Rp");
        belanja = scan.nextInt();
        
        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }
        
        System.out.println("Terimakasih...");
        
    }
    
}
