/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadexample;

/**
 *
 * @author Oliver
 */
public class Figure {
     
    Figure(){}
    
    public double getArea(double length, double width){
        double area;
        
        area = length * width;
        return area;
    }
    
    
    public double getArea(double length){
        double area;
        area = Math.pow(length, 2);
        
        return area;
        
    }
   
}
