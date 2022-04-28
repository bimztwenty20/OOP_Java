/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert3;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Metz
 */
public class SwitchCase {
    
    public static void main(String[] args) {
        
        int lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inputkan nama warna [1/2/3] : ");
        lampu = scan.nextInt();
        switch (lampu) {
            
            case 1:
                System.out.println("Lampu merah, berhenti!");
                break;
                
            case 2:
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
                
            case 3:
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
        
    }
    
}
