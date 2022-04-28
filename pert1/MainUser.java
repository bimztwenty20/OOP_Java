/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert1;

import java.util.Scanner;

/**
 *
 * @author Metz
 */
public class MainUser {
    
    public static void main(String[] args) {
        
        User pengguna= new User();
            //membuat objek input menggunakan scanner
        Scanner input= new Scanner(System.in);
        
        System.out.println("Masukkan Username: ");
        //mengisi data kedalam objek dengan metode set
        pengguna.setUsername(input.nextLine());
        
        System.out.println("Masukkan Password: ");
        //mengisi data kedalam objek dengan metode set
        pengguna.setPassword(input.nextLine());
        
        //memanggil data username dan password dengan metode get
        System.out.println("Username: " + pengguna.getUsername());
        System.out.println("Password: " + pengguna.getPassword());
    }

    public MainUser() {
    }
    
}
