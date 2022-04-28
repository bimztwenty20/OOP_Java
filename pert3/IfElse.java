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
public class IfElse {
    
    public static void main(String[] args) {
        
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nama : ");
        nama = scan.nextLine();
        System.out.println("Nilai : ");
        nilai = scan.nextInt();
        
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
    }
        
    }
    
}
