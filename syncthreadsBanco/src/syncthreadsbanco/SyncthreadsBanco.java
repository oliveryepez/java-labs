/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncthreadsbanco;

/**
 *
 * @author Oliver
 */
public class SyncthreadsBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Nest myNest = new Nest();
       Ant ant_1 = new Ant("Oliver", myNest);
       Ant ant_2 = new Ant("Victo", myNest);
       
       Thread thread_ant_1 = new Thread(ant_1);
       Thread thread_ant_2 = new Thread(ant_2);
    }
    
}
