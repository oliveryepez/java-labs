/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncthreadsbanco;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oliver
 */
public class Ant implements Runnable{
    private Nest nest;
    private String name;
    
   /**
     * @return the nest
   */
    public Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    public void setNest(Nest nest) {
        this.nest = nest;
    }
    
    public Ant(String name, Nest nest){
        this.name = name;
        this.nest = nest;
    }
    
     @Override
    public void run() {
       Random rnd = new Random();
       int value = rnd.nextInt(3);
       
       while(true){
           if(value > 1){
            nest.add();
            System.out.println("Ant (" + name + ") Adding");
            }else{
                nest.delete();
                System.out.println("Ant (" + name + ") Deleting");
            }
           try {
               Thread.sleep(3000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Ant.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}
