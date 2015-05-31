/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideexample;

/**
 *
 * @author Oliver
 */
public class Circle {
    protected double ratio;
    protected double pi = 3.14;
    
    Circle(){}
    
    Circle(double ratio){
        this.ratio = ratio;
    }
    
    
    protected double getArea(){
        double area;
        
        area = this.pi * Math.pow(this.ratio, 2);
        return area;
    }
}
