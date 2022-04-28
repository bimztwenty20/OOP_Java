/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert5;
import java.io.*;

/**
 *
 * @author Metz
 */
public class Latihan1 {
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader scan = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(scan);
        
        String nk;
        int i,j;
        int ti=0, tk=0;
        
        int[] pilihan = new int[10];
        String[] jenis = new String[10];
        int[] jb = new int[10];
        int[] harga = new int[10];
        int[] tb = new int[10];
        String[] bonus = new String[10];
        
        System.out.println("\t\tTOKO HERBAL ALIBABA");
        System.out.println("------------------------------------");
        System.out.println("1. MADU HUTAN");
        System.out.println("2. TEH HIJAU");
        System.out.println("3. SARI KURMA");
        System.out.println("------------------------------------");
        
        System.out.println("Nama kasir : ");
        nk = input.readLine();
        System.out.println("Masukkan jumlah data : ");
        j = Integer.parseInt(input.readLine());
        
        for (i=1; i<=j; i++) {
            System.out.println("Data ke- " + i);
            System.out.println("Pilihan [1/2/3] : ");
            pilihan[i] = Integer.parseInt(input.readLine());
            System.out.println("Jumlah beli : ");
            jb[i] = Integer.parseInt(input.readLine());
            
            if (pilihan[i] == 1){
                jenis[i] = "MADU HUTAN";
                harga[i] = 120000;
            } else if (pilihan[i] == 2){
                jenis[i] = "TEH HIJAU";
                harga[i] = 20000;
            } else {
                jenis[i] = "SARI KURMA";
                harga[i] = 80000;
            }
            
            if (jb[i]>=10) {
                bonus[i] = "Pouch Cantik";
            } else {
                bonus[i] = "Tidak Dapat Bonus!!!";
            }
            
            tb[i] = jb[i] * harga[i];
            
        }
        
        System.out.println("\t\t\tTOKO HERBAL ALIBABA");
        System.out.println("Nama kasir : " + nk);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("No. Jenis          Harga       Jumlah Beli     Total Bayar     Bonus");
        
        for (i=1; i<=j; i++) {
            System.out.printf("%d   %s      %d        %d           Rp. %d      %s\n", i, jenis[i], harga[i], jb[i], tb[i], bonus[i]);
            ti = ti+1;
            tk = tk+tb[i];
        }
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Total item : " + ti);
        System.out.println("Total keseluruhan : " + tk);
        
    }
    
}
