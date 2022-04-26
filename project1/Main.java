package project1;
import java.io.*;

/**
 *
 * @author Metz
 */
public class Main {
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader scan = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(scan);
        
        String nk, tanya;
        int i,j;
        int totalBayar = 0, uangBayar, uangKembali, jumlahBayar ;
        
        int[] kodeMakanan = new int[10];
        int[] porsiMakanan = new int[10];
        int[] kodeMinuman = new int[10];
        int[] porsiMinuman = new int[10];
        String[] namaMakanan = new String[10];
        int[] hargaMakanan = new int[10];
        String[] namaMinuman = new String[10];
        int[] hargaMinuman = new int[10];
        int[] totalMakanan = new int[10];
        int[] totalMinuman = new int[10];
        int[] subTotal = new int[10];
        
        do {
            System.out.println("~~~~~~~Warung Makan Ribut~~~~~~~");
            System.out.println("--------------------------------");
            System.out.println("Masukkan nama kasir : ");
            nk = input.readLine();
            System.out.println("Masukkan jumlah data : ");
            j = Integer.parseInt(input.readLine());
            
            for (i=1; i<=j; i++) {
                System.out.println("Data ke- " + i);
                System.out.println("Kode makanan [1/2/3] : ");
                kodeMakanan[i] = Integer.parseInt(input.readLine());
                System.out.println("Jumlah porsi makanan : ");
                porsiMakanan[i] = Integer.parseInt(input.readLine());
                System.out.println("Kode minuman [1/2/3] : ");
                kodeMinuman[i] = Integer.parseInt(input.readLine());
                System.out.println("Jumlah beli minuman : ");
                porsiMinuman[i] = Integer.parseInt(input.readLine());
                
                if (kodeMakanan[i] == 1) {
                    namaMakanan[i] = "Paket Dimsum";
                    hargaMakanan[i] = 25000;
                } else if (kodeMakanan[i] == 2) {
                    namaMakanan[i] = "Batagor Bandung";
                    hargaMakanan[i] = 20000;
                } else if (kodeMakanan[i] == 3) {
                    namaMakanan[i] = "Siomay Bandung";
                    hargaMakanan[i] = 24000;
                } else {
                    System.out.println("Kode salah!!!");
                    break;
                }
                
                switch (kodeMinuman[i]) {
                    case 1:
                        namaMinuman[i] = "The Botol";
                        hargaMinuman[i] = 10000;
                        break;
                    case 2:
                        namaMinuman[i] = "Jeruk Peras";
                        hargaMinuman[i] = 12000;
                        break;
                    case 3:
                        namaMinuman[i] = "Air Mineral";
                        hargaMinuman[i] = 7000;
                        break;
                    default:
                        System.out.println("Kode salah!!!");
                } 
                
                totalMakanan[i] = porsiMakanan[i] * hargaMakanan[i];
                totalMinuman[i] = porsiMinuman[i] * hargaMinuman[i];
                subTotal[i] = totalMakanan[i] + totalMinuman[i];
            }
            System.out.println("Warung Makan Ribut-------------------------------------------------------------------------");
            System.out.println("No. Nama          Jumlah         Nama        Jumlah        Total       Total       Subtotal");
            System.out.println("    Makanan       Porsi Makanan  Minuman     Beli Minuman  Makanan     Minuman");
            System.out.println("--------------------------------------------------------------------------------------------");
            
            for(i=1; i<=j; i++) {
                System.out.printf("%d   %s    %d          %s      %d        %d        %d       %d\n", i, namaMakanan[i], porsiMakanan[i], namaMinuman[i], porsiMinuman[i], totalMakanan[i], totalMinuman[i], subTotal[i]);
            }
            System.out.println("----------------------------------------------------------------------------------------");
            
            for (i=0; i<=subTotal[i]; i++) {
                totalBayar += subTotal[i];
            }
            
            System.out.println("Total bayar : Rp." + totalBayar);
            System.out.println("Masukkan uang bayar : Rp.");
            uangBayar = Integer.parseInt(input.readLine());
            uangKembali = uangBayar - totalBayar;
            System.out.println("Uang kembali : Rp." + uangKembali);
            System.out.println("Mau input data lagi?[y/t] : ");
            tanya = input.readLine();
            
        } while (tanya.equalsIgnoreCase("y"));
    }
}