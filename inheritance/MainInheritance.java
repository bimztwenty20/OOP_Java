/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Metz
 */
public class MainInheritance {
    
    public static void main(String[] args) {
        
        B b=new B();
        b.myAtribut1=10;
        b.myAtribut2=100;
        b.myMethod1();
        b.myMethod2();
        
        C c=new C();
        c.myMethod3();
        
        D d=new D();
        d.myMethod4();
    }
    
}
