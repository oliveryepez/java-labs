/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.*;

/**
 *
 * @author Oliver
 */
public class Layout extends JPanel{
    private int Rows;
    private int Columns;
    
    public Layout(int rows, int columns){
        super(new GridLayout(rows, columns));
        
        this.Rows = rows; 
        this.Columns = columns;
        
       this.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
       
       for(int row = 0; row < this.Rows; row++){
           for(int column = 0; column < this.Columns; column++){
               JLabel label = new JLabel();
               if(row == 0){
                   if(column == 0){
                       label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                   }else{
                       label.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.BLACK));
                   }
               }else{
                   if(column == 0){
                       label.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
                   }else{
                       label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
                   }
               }
               
                this.add(label);
           }
       }
    }
    
    @Override
    public void paintComponent(Graphics g){
        try{
            super.paintComponent(g);
            BufferedImage background = ImageIO.read(new File(getClass().getResource("/assets/ground.jpg").toURI()));
            g.drawImage(background, 0, 0, null);
        }catch(IOException | URISyntaxException ex){
            Logger.getLogger(Leaf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
