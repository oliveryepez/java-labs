/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideexample;
import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class OverrideExample {

    public static void main(String[] args) {
        Navigation mainMenu = new Navigation(new String[]{"1. Get 'Circle' Area",
                                                          "2. Get 'Sphere' Area",
                                                          "3. Exit"}, "Main Menu");
        Scanner input = new Scanner(System.in);
        
        boolean exitFlag = false;
        int option;
        double inputRatio;
        
        while(exitFlag == false){
            mainMenu.printMenu();
            option = mainMenu.getOption();
            
            switch(option){
                case 1:
                    System.out.print("Ratio: ");
                    inputRatio = input.nextDouble();
                    Circle myCircle = new Circle(inputRatio);
                    
                    System.out.println("The Area is: " + myCircle.getArea() + " m2");
                break;
                    
                case 2:
                    System.out.print("Ratio: ");
                    inputRatio = input.nextDouble();
                    Sphere mySphere = new Sphere(inputRatio);
                    
                    System.out.println("The Area is: " + mySphere.getArea() + " m2");
                break;
                    
                case 3:
                    exitFlag = true;
                break;
                    
                default:
                    System.out.println("Invalid option!");
                break;
            }
        }
    }
    
}
