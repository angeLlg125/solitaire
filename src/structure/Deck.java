/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

import common.Utils;
import java.awt.image.BufferedImage;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class Deck {
    private LinkedList<Card> mainStack = new LinkedList<>();
    public static final BufferedImage HIDDEN_SIDE = Utils.readImage("back-1.png");
    //public static final BufferedImage NEW_GAME = Utils.readImage("new_game.png");

	public Deck() {
		// this.newGame();
		this.newShuffleGame();
		// this.newOrderedGame();
	}

    public LinkedList<Card> getCards(){
        return mainStack;
    }
    
    public void barajear(){
        
    }
    
    public void resetGame(){
        
    }

	public void newGame() {
		mainStack.clear();
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 14; j++) {
				String path = String.format("%d-%d.png", i, j);
				mainStack.add(new Card(path, 0, 0, (i % 2 == 0), j, i));
			}
		}
	}

    public void newShuffleGame() {
    	this.newGame();
        Collections.shuffle(this.mainStack);
    }

	public void newOrderedGame() {
		for (int i = 4; i > 0; i--) {
			for (int j = 13; j > 0; j--) {
				String path = String.format("%d-%d.png", i, j);
				mainStack.add(new Card(path, 0, 0, (i % 2 == 0), j, i));
			}
		}
	}
	
    public void animation(){
        
    }
    
}
