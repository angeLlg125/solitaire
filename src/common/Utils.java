/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author angel
 */
public class Utils {
    
    public static void playSound(String soundName) {
    String gongFile = "src/assets/sound/"+soundName;
        InputStream in;
        try {
            in = new FileInputStream(gongFile);
            AudioStream audioStream = new AudioStream(in);

            AudioPlayer.player.start(audioStream);
        } catch (Exception ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static BufferedImage readImage(String path){
        try {
           return ImageIO.read(new File("src/assets/images/"+path));
        } catch (IOException e) {
        }
        return null;
    }
}
