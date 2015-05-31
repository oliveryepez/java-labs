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
public class Nest {
   private Integer qty = 0; 
   
   public void add(){
       ++qty;
   }
  
   public void delete(){
       --qty;
   }
}
