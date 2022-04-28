/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Metz
 */
public class MainWindow extends JFrame{
    
    public MainWindow(){
        this.setTitle("Jendela Utama");
        this.setSize(600, 320);
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        
        this.setLocation(x, y);
    }
    
    public static void main(String[] args) {
        MainWindow mWindow = new MainWindow();
        mWindow.setVisible(true);
    }
}
