/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class Deck {
    private LinkedList<Card> mainStack = new LinkedList<>();
    public static final Card HIDDEN_SIDE = new Card("src/assets/images/back-1.png", 0, 0);

    public Deck(){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                mainStack.add(new Card("src/assets/images/"+i+"-"+j+".png", 0, 0, (i%2 != 0), j, i));
            }
        }
        Collections.shuffle(mainStack);
    }
    
    public LinkedList<Card> getCards(){
        return mainStack;
    }
    
    public void barajear(){
        
    }
    
    public void resetGame(){
        
    }
    
    public void newGame(){
        
    }
    
    public void animation(){
        
    }
    
}
