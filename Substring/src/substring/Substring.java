/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;
import java.util.Scanner;
/**
 *
 * @author Oliver
 */
public class Substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Navigation mainMenu = new Navigation(new String[]{"1. Substring (FOR)", 
                                                          "2. Substring (DO - WHILE)",
                                                          "3. Substring (WHILE)",
                                                          "4. Exit"}, "Main Menu");
        String stringValue;
        int lettersCount;
                
        boolean flag = false;
        int optionMenu;
        while(flag == false){
            
            mainMenu.printMenu();
            optionMenu = mainMenu.getOption();

            switch(optionMenu){
                case 1:
                    System.out.print("String: ");
                    stringValue = input.nextLine();
                    
                    for (int i = 0; i < stringValue.length(); i++) {
                        System.out.println("Letter #" + i +":" + stringValue.substring(i, i+1));
                    }
                break;
                 
                case 2:
                    System.out.print("String: ");
                    stringValue = input.nextLine();
                    lettersCount = 1;
                    do{
                      System.out.println("Letter #" + lettersCount +":" + stringValue.substring(lettersCount, lettersCount+1));  
                      lettersCount++;
                    }while(lettersCount <= stringValue.length());
                break;
                    
                case 3:
                break;
                    
                case 4:
                    flag = true;
                break;
                    
                default:
                    System.out.println("Invalid Option!");
                break;
            }
        }
    }
    
}
