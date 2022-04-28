/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataKaryawan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Metz
 */
public class BufferReader {
    
    public static void main(String[] args) throws IOException{
        
        String nama;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Inputkan nama : ");
        nama = br.readLine();
        
        System.out.println("Nama kamu adalah : " + nama);
    }
    
}
