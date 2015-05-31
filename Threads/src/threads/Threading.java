/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author Oliver
 */
public class Threading implements Runnable{

    private JTextArea ctrlTextArea;
    private JProgressBar ctrlProgressBar;
    private JSlider ctrlSlider;
    private String text;
    
    public Threading(){}
    
    public Threading(JTextArea ctrlTextArea, JProgressBar ctrlProgessBar, JSlider ctrlSlider){
        this.ctrlTextArea = ctrlTextArea;
        this.ctrlProgressBar = ctrlProgessBar;
        this.ctrlSlider = ctrlSlider;
        this.text = text;
    }
    
    @Override
    public void run() {
        try {
            this.controlElements();
        } catch (InterruptedException ex) {
            Logger.getLogger(Threading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void controlElements() throws InterruptedException{
       int counter = 1;
        
       for(int count = 0; count <= 100 ; count+=20){
         Thread.sleep(500);
         this.ctrlTextArea.append("Append Tex #" + counter + "\n");
         this.ctrlSlider.setValue(count);
         this.ctrlProgressBar.setValue(count);
         counter++;
       }
       
    }
    
    
}
