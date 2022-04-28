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
public class IfElseIf {
    
    public static void main(String[] args) {
        
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inputkan nilai : ");
        nilai = scan.nextInt();
        
        if (nilai >= 90){
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } 
        else {
            grade = "E";
        }
        
        System.out.println("Grade : " + grade);
        
    }
    
}
