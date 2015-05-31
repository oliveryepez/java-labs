/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadexample;
import java.util.Scanner;

/**
 *
 * @author Oliver Yepez Prieto
 */
public class Navigation {
    
    private String [] labelOptions;
    private String name;

    
    public  Navigation(String [] p_labelOptions, String p_name){
        labelOptions = p_labelOptions;
        name = p_name;
    }

    public String[] getLabelOptions() {
        return labelOptions;
    }

    public void setLabelOptions(String[] labelOptions) {
        this.labelOptions = labelOptions;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getOption(){
        int in_Option;
        Scanner input = new Scanner(System.in);
        in_Option = input.nextInt();
        
        return in_Option;
    }
    
    public int getNumbOptions(){
        return labelOptions.length;
    }
    
    public void printMenu(){
         
        System.out.println("==================================");
        System.out.println(              name                );
        System.out.println("==================================");
        System.out.println("  Options:                        ");
        
        for(int r_option = 0; r_option < labelOptions.length; r_option++){
           
            System.out.println("           " + labelOptions[r_option]);
        }
        System.out.println("==================================");
        System.out.print("Option: ");
    }
}
