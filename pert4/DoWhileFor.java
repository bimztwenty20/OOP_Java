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
public class DoWhileFor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i,jd;
        String [] nim = new String[3];
        int[] ntugas = new int[3];
        String tanya;
        
        do {
            System.out.println("Masukkan jumlah data : ");
            jd = input.nextInt();
            for(i=1; i<=jd; i++){
                System.out.println("Data ke- " +i);
                System.out.println("Masukkan NIM : ");
                nim[i] = input.next();
                System.out.println("Nilai tugas : ");
                ntugas[i] = input.nextInt();
            }    
                System.out.println("Tampil Data Nilai-----------------");
                System.out.println("No.     NIM     Nilai Tugas");
            for(i=1; i<=jd; i++){
                System.out.printf("%d      %s      %d\n",i,nim[i],ntugas[i]);
            }  
            System.out.println("Mau input data lagi? ");
            tanya = input.next();
        }
        while(tanya.equalsIgnoreCase("ya"));
    }
    
}
