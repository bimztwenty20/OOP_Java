/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Metz
 */
public class MainPolymorphism {
    
    public static void main(String[] args) {
        
        Hewan hewan = new Hewan();
        Kuda kuda = new Kuda();
        Ayam ayam = new Ayam();
        Kucing kucing = new Kucing();
        
        hewan.suara();
        
        hewan=kuda;
        hewan.suara();
        
        hewan=ayam;
        hewan.suara();
        
        hewan=kucing;
        hewan.suara();
    }
    
}
