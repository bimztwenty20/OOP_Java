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
public class Latihan2 {
    
    public static void main(String[] args) throws IOException{
        InputStreamReader scan = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(scan);
        
        int i,j;
        String tanya;
        
        String[] np = new String[10];
        String[] hp = new String[10];
        String[] kk = new String[10];
        int[] kl = new int[10];
        String[] nk = new String[10];
        String[] level = new String[10];
        String[] jp = new String[10];
        int[] bk = new int[10];
        
        do {
            System.out.println("Form Pendaftaran LPK Serba Bisa");
            System.out.println("----------------------------------------");
            System.out.println("Masukkan Banyaknya Data Kursus : ");
            j = Integer.parseInt(input.readLine());
            
            for (i=1; i<=j; i++){
                System.out.println("Data ke- " + i);
                System.out.println("Nama pendaftar : ");
                np[i] = input.readLine();
                System.out.println("Nomor Handphone : ");
                hp[i] = input.readLine();
                
                System.out.println("Pilih kode kursus[OPK/DSG] : ");
                kk[i] = input.readLine();
                System.out.println("Pilih kode level[1/2/3] : ");
                kl[i] = Integer.parseInt(input.readLine());
                
                if  (kk[i].equalsIgnoreCase("OPK")){
                    nk[i] = "Operator Komputer";
                    jp[i] = "8 kali";
                    
                    if (kl[i] == 1) {
                        level[i] = "Level-Dasar";
                        bk[i] = 700000;
                    } else if (kl[i] == 2) {
                        level[i] = "Level-Lanjut";
                        bk[i] = 800000;
                    } 
                    else {
                        level[i] = "Level-Mahir";
                        bk[i] = 1000000;
                    }
                } else if (kk[i].equalsIgnoreCase("DSG")){
                    nk[i] = "Desain Grafis";
                    jp[i] = "10 kali";
                    
                    if (kl[i] == 1) {
                        level[i] = "Level-Dasar";
                        bk[i] = 900000;
                    } else if (kl[i] == 2) {
                        level[i] = "Level-Lanjut";
                        bk[i] = 1000000;
                    } 
                    else {
                        level[i] = "Level-Mahir";
                        bk[i] = 1500000;
                    }
                }
                else {
                    System.out.println("Kode yang anda masukkan salah!!!");
                    break;
                }
            }
            System.out.println("LPK Kursus Serba Bisa------------------------------------------------");
            System.out.println("No. Nama        Nomor           Kursus yang         Level       Biaya");
            System.out.println("    Pendaftar   Handphone       Diikuti             Kursus      Kursus");
            System.out.println("----------------------------------------------------------------------");
            
            for (i=1; i<=j; i++){
                System.out.printf("%d   %s        %s     %s      %s      %d\n", i, np[i], hp[i], nk[i], level[i], bk[i]);
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Mau input data lagi? [y/t] : ");
            tanya = input.readLine();
        }
        while(tanya.equalsIgnoreCase("y"));
    }
    
}
