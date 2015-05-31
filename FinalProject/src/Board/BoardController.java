package Board;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Oliver
 */
public class BoardController extends JPanel{
    private int width;
    private int height;



    public BoardController(int width, int height) {
       
        this.width = width;
        this.height = height;
    }
    
    
    public void printBoard(){
        JFrame Board = new JFrame("Main Board");
        
        Board.setSize(width, height);
        Board.setVisible(true);
        Board.setResizable(false);
        Board.getContentPane().add(new Layout(10, 5));
        //Board.getContentPane().add(leaf.getLeaf(), null);
        Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
   
}
