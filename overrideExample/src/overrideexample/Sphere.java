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
public class Sphere extends Circle {
    
    static int constant = 4;
    
    Sphere(double ratio){
        this.ratio = ratio;
    }
    
    @Override
    protected double getArea(){
        double area;
        
        area = constant * this.pi * (Math.pow(this.ratio, 2));
        return area;
    }
    
}
