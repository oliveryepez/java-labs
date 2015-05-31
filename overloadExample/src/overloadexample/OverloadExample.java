/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadexample;

import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class OverloadExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Navigation mainMenu = new Navigation(new String[]{"1. Get 'Rectangle' Area",
                                                          "2. Get 'Square' Area",
                                                          "3. Exit"}, "Main Menu");
        Figure myFigure = new Figure();
        Scanner input = new Scanner(System.in);
        
        boolean exitFlag = false;
        int option;
        double in_length;
        double in_width;
        double area;
        
        while(exitFlag == false){
            mainMenu.printMenu();
            option = mainMenu.getOption();
            
            switch(option){
                case 1:
                    System.out.print("Length: ");
                    in_length = input.nextDouble();
                    
                    System.out.println("");
                    
                    System.out.print("Width: ");
                    in_width = input.nextDouble();
                    
                    area = myFigure.getArea(in_length, in_width);
                    System.out.println("The area is: " + area);
                break;
                    
                case 2:
                    System.out.print("Length: ");
                    in_length = input.nextDouble();
                    
                    area = myFigure.getArea(in_length);
                    System.out.println("The area is: " + area);
                break;
                    
                    
                case 3:
                    exitFlag = true;
                break;
                   
                   
                default:
                    System.out.println("Invalid Option!");
                break;
            }
        }
    }
    
}
