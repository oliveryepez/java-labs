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
public class MyEngine {
    private int bombType;
    private String fluidType;
    private String fuel;

    public MyEngine(int bombType, String fluidType, String fuel) {
        this.bombType = bombType;
        this.fluidType = fluidType;
        this.fuel = fuel;
    }
    
 
    public void tellEngineType(){
    
        switch(this.bombType){
            case 0:
                System.out.println("No hay establecido un valor\n" + "definido para el tipo de bomba");
            break;
                
            case 1:
                System.out.println("“La bomba es una bomba de agua");
            break;
                
            case 2:
                System.out.println("La bomba es una bomba de\n" + "gasolina");
            break;
                
            case 3:
                System.out.println("“La bomba es una bomba de\n" + "hormigón");
            break;
                
            case 4:
                System.out.println("La bomba es una bomba de pasta\n" + "alimenticia");
            break;
           
            default:
                System.out.println("No existe un valor válido para tipo\n" + "de bomba");
            break;
        }
    
    }
}
