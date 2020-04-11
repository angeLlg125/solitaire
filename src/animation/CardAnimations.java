/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import common.Constants;
import common.Utils;
import forms.MyCanvas;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.Card;
import structure.CardsGroup;
import structure.Deck;

/**
 *
 * @author angel
 */
public class CardAnimations implements Runnable{
    private String animationType = null;
    private int x1, y1, x2, y2;
    private MyCanvas myCanvas;
    public void drawReleaseCards(String type, int x1, int y1, int x2, int y2, MyCanvas myCanvas){
        this.animationType = type;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.myCanvas = myCanvas;
        new Thread(this).start();
    }

    // TODO: This can be used to create an efect of moving one x1,y2 point to a x2, y2 point
    @Override
    public void run() {
       int x1 = this.x1, y1 = this.y1, x2 = this.x2, y2 = this.y2, stepNo = 0;

        switch(this.animationType){
            case "release":
                
                float distancex, distancey, deltax, deltay, steps;
                if(x2==x1)
                {
                  deltax = 0.0f;
                  distancex=0;
                  distancey = y2-y1;
                  deltay = .5f; //Any value you wish
                  steps = distancey/deltay;
                  steps = Math.abs(steps);
                }
                else
                {
                  distancex = (x2-x1);
                  distancey = (y2-y1);
                  deltax = 0.5f;
                  if(x2<x1)
                  deltax = -deltax;
                  steps = distancex/deltax;
                  deltay = distancey/steps;
                  steps = Math.abs(steps);
                } 

                int x, y;
                do{
                    /*System.out.println("distancex : = " + distancex);
                    System.out.println("distancey : = " + distancey);
                    System.out.println("deltax : = " + deltax);
                    System.out.println("deltay : = " + deltay);
                    System.out.println("steps: = " + steps);*/
                    stepNo++;
                    x = (int)(this.x1 + (deltax*stepNo));
                    y = (int)(this.y1 + (deltay*stepNo));
                    
                    //set x location to object
                    //set y location to object
                    this.myCanvas.repaint();
                    /*try {
                        TimeUnit.NANOSECONDS.sleep(1);
                        //TimeUtils.sleepFor(1, TimeUnit.SECONDS);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CardAnimations.class.getName()).log(Level.SEVERE, null, ex);
                    }*/
                }while(true);
        }
    }
}
