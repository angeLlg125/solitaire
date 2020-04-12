/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author angel
 */
public class Constants {
	
    public static int CARD_X_SIZE = 120;
    public static int CARD_Y_SIZE = 180;
    public static int CARD_DRAGG_SIZE = 20;
    public static int SHADOW_DISTANCE = 12;
    
    public static int WINDOW_X_SIZE = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int WINDOW_Y_SIZE = Toolkit.getDefaultToolkit().getScreenSize().height;
    
    public static Color groupsColor = new Color(80, 90, 70, 150);
    public static Color backGroundColor = new Color(51, 161, 73);
    public static Color selectedCardColor = new Color(69, 136, 245, 1);
    public static Color shadow = new Color(30, 30, 30, 150);
    
    public static int SPACE_BETWEEN_CARDS_IN_LIST = 30;
    public static int SPACE_BETWEEN_GROUPS = 200;
    public static int MENU_MIN_LENGT = 40;
    public static int MENU_MAX_LENGT = 200;
    
    public static boolean CHECK_GAME_GROUPS = true;
    
    public static class Sounds {
    	public static String CARD_OK = "button-click.wav";
    	public static String STROKE = "carton-impact-5.wav";
    	public static String DRAGGING = "smokearrodillandose-001.wav";
    	public static String CLICK_PROVIDER = "sinnett-card.wav";
        public static String MENU_CHANGE = "menu_change.wav";
        public static String MIX_DECK = "mix_deck.wav";
    }

}
