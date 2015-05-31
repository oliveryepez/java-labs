/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
/**
 *
 * @author Oliver
 */
public class Cell extends JPanel {
    private final Integer cellWidth  = 60;
    private final Integer cellHeight = 60 ;
    private Integer boardWidth;
    private Integer boardHeight;
    
    
    
    public Cell(Integer boardWidth, Integer boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        
    }
    
    @Override
    public void paint(Graphics g){
        setLayout(new GridLayout(4,4));
        this.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));  
    }
  /* public void paint(Graphics g){
     
         BufferedImage groundImage = null;
         Graphics2D graphics = (Graphics2D) g;
         
         
        try {
            groundImage = ImageIO.read(new File(getClass().getResource("/assets/Grama.png").toURI()));
            
        }catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Cell.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        for(int rows = 0; rows <= this.boardWidth; rows += this.cellHeight){
            for(int columns = 0; columns <= this.boardHeight; columns += this.cellWidth){
                TexturePaint groundImageTP = new TexturePaint(groundImage, new Rectangle(rows, columns, this.cellWidth, this.cellHeight));
                graphics.setPaint(groundImageTP);
                graphics.fillRect(rows, columns, this.cellWidth, this.cellHeight);
            }
        }
   }*/
}
