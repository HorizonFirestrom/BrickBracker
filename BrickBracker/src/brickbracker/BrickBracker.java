/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbracker;

import javax.swing.JFrame;

/**
 *
 * @author Md. Imran
 */
public class BrickBracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        obj.setSize(700,600);
        obj.setTitle("BreakOut Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        Gameplay gameplay = new Gameplay();
        obj.add(gameplay);
        
    }
    
}
