/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import common.Constants;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import structure.Board;
import structure.Deck;
import structure.Menu;

/**
 *
 * @author angel
 */
public class MyCanvas extends JPanel implements  MouseMotionListener, MouseListener{
    
    private final Board board = new Board();
    private final Deck deck = new Deck();
    private final Menu menu = new Menu();
    
    public MyCanvas(){

        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        
        board.addCards(deck.getCards());
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Constants.backGroundColor);
        g.fillRect(0, 0, Constants.WINDOW_X_SIZE, Constants.WINDOW_Y_SIZE);
        
        board.drawBoard(g, this);
       
        menu.drawMenu(g);
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if (!menu.isIsActive()) {
            this.board.draggImages(me.getX(), me.getY());
        }else{
            menu.showHideMenu(this);
        }
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        // If we click menu
        if(me.getX() <= menu.getSize()){
            if(menu.isIsActive()){
                menu.clickOption(me.getX(), me.getY(), this);
            }
            menu.showHideMenu(this);
        }
        if(!menu.isIsActive()){
            board.clickProvider(me.getX(), me.getY());
        }else{
            menu.showHideMenu(this);
        }
        
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        if (!menu.isIsActive()) {
            this.board.releaseCards(me.getX(), me.getY());
        }
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}
