/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajera;

/**
 *
 * @author Oliver
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
       Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

       // Tiempo inicial de referencia
       long initialTime = System.currentTimeMillis();
       
       new Thread(new Cajera("Cajera 1", cliente1, initialTime)).start();
       new Thread(new Cajera("Cajera 2", cliente1, initialTime)).start();
       
       
       

     
   }
    
}
