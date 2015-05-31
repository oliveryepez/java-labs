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
public class Wheel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyWheel wheel = new MyWheel("Rubber", 15.3, 0.93, "GoodYear");
        wheel.getDimensions();
    }
    
}
