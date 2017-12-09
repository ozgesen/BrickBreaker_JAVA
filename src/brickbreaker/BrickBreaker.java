/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import javax.swing.JFrame;

/**
 *
 * @author asus
 */
public class BrickBreaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame= new JFrame("Brick Breaker");
       
        BrickBreakerPanel panel =new BrickBreakerPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        frame.setSize(490,600);
        frame.setResizable(false);
    }
    
}
