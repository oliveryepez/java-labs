/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Oliver
 */
public class Leaf extends JLabel{
    private final Integer width = 20;
    private final Integer height = 30;
   
    private Integer leafQty;
    private Integer boardWidth;
    private Integer boardHeight;
    
    public Leaf(){
    }
    public Leaf(Integer leafQty, Integer boardWidth, Integer boardHeight){
       this.leafQty = leafQty;
       this.boardWidth = boardWidth;
       this.boardHeight = boardHeight;
    }
    
    /**
     *
     */
    @Override
    public void paint(Graphics g){
        try{
            BufferedImage leafImage = ImageIO.read(new File(getClass().getResource("/assets/leaf.png").toURI()));
            ImageIcon leafIcon = new ImageIcon(leafImage.getScaledInstance(this.width, this.height, 0));
            this.setIcon(leafIcon);
        }catch(IOException | URISyntaxException ex){
            Logger.getLogger(Leaf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    /*public JLabel getLeaf(){
        /*BufferedImage leafImage = null;
        Graphics2D graphics = (Graphics2D) g;
        Random randomGen = new Random();
        Integer randomX;
        Integer randomY;
        
        try{
            leafImage = ImageIO.read(new File(getClass().getResource("/assets/leaf.png").toURI()));
        }catch(IOException | URISyntaxException ex){
            Logger.getLogger(Leaf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int repeater = 1; repeater <= this.leafQty ; repeater++){
            randomX = randomGen.nextInt(this.boardWidth);
            randomY = randomGen.nextInt(this.boardWidth);
            g.drawImage(leafImage, randomX, randomY, this.width, this.height, null);
        }
         
        
        return leafLabel;
    }*/
}
