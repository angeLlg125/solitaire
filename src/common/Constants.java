/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.Color;

/**
 *
 * @author angel
 */
public class Constants {
    public static int CARD_X_SIZE = 120;
    public static int CARD_Y_SIZE = 180;
    
    public static int WINDOW_X_SIZE = 1500;
    public static int WINDOW_Y_SIZE = 1000;
    
    public static Color groupsColor = new Color(166, 38, 49, 100);
    public static Color backGroundColor = new Color(51, 161, 73);
    public static Color selectedCardColor = new Color(227, 98, 106, 100);
    public static Color menuColor = new Color(83, 178, 181, 200);
    public static Color optionColor = new Color(40, 40, 40, 200);
    
    public static int SPACE_BETWEEN_CARDS_IN_LIST = 30;
    public static int SPACE_BETWEEN_GROUPS = 200;
    public static int MENU_MIN_LENGT = 40;
    public static int MENU_MAX_LENGT = 200;
    
    public static class Sounds {
    	public static String CARD_OK = "button-click.wav";
    	public static String STROKE = "carton-impact-5.wav";
    	public static String DRAGGING = "smokearrodillandose-001.wav";
    	public static String CLICK_PROVIDER = "sinnett-card.wav";
    }

}
