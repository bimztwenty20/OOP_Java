/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataKaryawan;
import java.util.Scanner;

/**
 *
 * @author Metz
 */
public class DataKaryawan {
    
    public static void main(String[] args) {
        String nama, alamat;
        int usia, gaji;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("### Pendataan Karyawan PT Mencari Cinta Sejati ###");
        System.out.println("Nama karyawan: ");
        
        nama = keyboard.nextLine();
        
        System.out.println("Alamat: ");
        alamat = keyboard.nextLine();
        
        System.out.println("Usia: ");
        usia = keyboard.nextInt();
        
        System.out.println("Gaji: ");
        gaji = keyboard.nextInt();
        
        System.out.println("--------------------");
        System.out.println("Nama karyawan = "+ nama);
        System.out.println("Alamat = " + alamat);
        System.out.println("Usia = " + usia + "tahun");
        System.out.println("Gaji = Rp" + gaji);
        
    }
    
}
