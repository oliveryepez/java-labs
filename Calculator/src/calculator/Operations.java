/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Oliver
 */
public class Operations {
    
    
    private int result;
    
    
    Operations(){
        this.result = 0;
    }
    
    
    public void add(int x, int y){
        
        this.result = x + y;
        
        System.out.println("The Result is: " + this.result);
    }
    
    public void substract (int x, int y){
        
        this.result = x - y;
        
        System.out.println("The Result is: " + this.result);
    }
    
    public void multiplication(int x, int y){
        
        this.result = x * y;
        System.out.println("The Result is: " + this.result);
    }
    
    public void divide(int x, int y){
      
        this.result = x / y;
        System.out.println("The Result is: " + this.result);
    }
    
}
