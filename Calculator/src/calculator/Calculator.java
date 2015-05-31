/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Oliver
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Navigation mainMenu = new Navigation(new String[]{"1. Add",
                                                        "2. Deduct",
                                                        "3. Multiply",
                                                        "4. Divide",
                                                        "5. Exit"}, "MAIN MENU");
      Operations myCalculator = new Operations();
      int optionMenu;
      int value_1;
      int value_2;
      Scanner input_1 = new Scanner(System.in);
      Scanner input_2 = new Scanner(System.in);
      boolean flag = false;
      
      while(flag == false){
         mainMenu.printMenu();
         optionMenu = mainMenu.getOption();
         switch(optionMenu){
             
             case 1:
                 System.out.println("1st Value");
                 input_1 = new Scanner(System.in);
                 value_1 = input_1.nextInt();
                 
                 System.out.println("2nd Value");
                 input_2 = new Scanner(System.in);
                 value_2 = input_2.nextInt();
                 
                 
                 myCalculator.add(value_1, value_2);

             break;
                 
             case 2:
                 System.out.println("1st Value");
                 input_1 = new Scanner(System.in);
                 value_1 = input_1.nextInt();
                 
                 System.out.println("2nd Value");
                 input_2 = new Scanner(System.in);
                 value_2 = input_2.nextInt();
                 
                 
                 myCalculator.substract(value_1, value_2);

             break;
                 
             case 3:
                 System.out.println("1st Value");
                 input_1 = new Scanner(System.in);
                 value_1 = input_1.nextInt();
                 
                 System.out.println("2nd Value");
                 input_2 = new Scanner(System.in);
                 value_2 = input_2.nextInt();
                 
                 
                 myCalculator.multiplication(value_1, value_2);
             break;
                 
             case 4:
                System.out.println("1st Value");
                 input_1 = new Scanner(System.in);
                 value_1 = input_1.nextInt();
                 
                 System.out.println("2nd Value");
                 input_2 = new Scanner(System.in);
                 value_2 = input_2.nextInt();
                 
                 
                 myCalculator.divide(value_1, value_2);
             break;
                 
             case 5:
                 flag = true;
             break;
                 
             default:
                 System.out.println("Invalid Option!");
             break;
         
         }
      
      }
    }
    
}
