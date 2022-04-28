/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert4;

import java.io.*;

/**
 *
 * @author Metz
 */
public class Latihan {
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader scan = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(scan);
        
        String np;
        int i,j;
        
        String[] nb = new String[10];
        int[] hb = new int[10];
        int[] jb = new int[10];
        
        System.out.println("Input Data Barang------------");
        System.out.println("Nama pembeli : ");
        np = input.readLine();
        System.out.println("Banyaknya pembelian : ");
        j = Integer.parseInt(input.readLine());
        
        for(i=1; i<=j; i++) {
            System.out.println("Pembelian ke- " + i);
            System.out.println("Nama barang : ");
            nb[i] = input.readLine();
            System.out.println("Harga barang Rp. ");
            hb[i] = Integer.parseInt(input.readLine());
            System.out.println("Jumlah : ");
            jb[i] = Integer.parseInt(input.readLine());
            
        }
        
        System.out.println("Rekap pembelian-------------");
        System.out.println("No.     Nama Barang     Harga Barang    Jumlah Beli");
        
        for(i=1; i<=j; i++){
            System.out.printf("%d       %s            %d            %d\n",i,nb[i],hb[i],jb[i]);
        }
    }
    
}
