/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

/**
 *
 * @author asus
 */
public class Animate implements Runnable {

    BrickBreakerPanel bp;

    Animate(BrickBreakerPanel b) {
        bp = b;
    }

  
    @Override
    public void run() {
        while (true) {
            bp.update();
            try {
                Thread.sleep(10);             
          }catch (InterruptedException e){
              e.printStackTrace();
       
       }
    }
    
}}
