/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wheel;

/**
 *
 * @author Oliver
 */
public class MyWheel {
    private String type;
    private double thickness;
    private double diameter;
    private String brand;

    
    public MyWheel(String type, double thickness, double diameter, String brand) {
        this.type = type;
        this.thickness = thickness;
        this.diameter = diameter;
        this.brand = brand;
    }
    
    
    public void getDimensions(){
    if(this.diameter > 1.4){
        System.out.println("The Wheel is for a big Vehicle");
    }else{
            if((this.diameter > 0.8) && (this.diameter <= 1.4)){
                System.out.println("The Wheel is for a average vehicle");
            }else{
                System.out.println("The Wheel is for a small vehicle");
            }
        }
    
     if((this.diameter > 1.4 && this.thickness < 0.4) || 
         (this.diameter > 0.8 && this.diameter <= 1.4 && this.thickness < 0.25)){
            System.out.println("The Thickness of the Wheel is not the recommended");
      }
    } 
}
