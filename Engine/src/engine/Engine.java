/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 *
 * @author Oliver
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyEngine engine = new MyEngine(6,"85", "Gas");
        
        engine.tellEngineType();
    }
    
}
