/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import javax.swing.*;

/**
 *
 * @author student
 */
public class helpButtonClass {
    
    public static void helpAction(){
    JFrame f = new JFrame();
    f.setSize(250,250);
    JTextArea jta = new JTextArea();
    f.add(jta);
    
    jta.setText("Instructions"
            + "\n1. You can search videos and get the link by clicking share under the video"
            + "\n2. Using the link from step 1 paste it into the download field"
            + "\n3. Downloads as an mp4 which you convert "
            
            );
    
    
    
    
    
    f.setVisible(true);
    jta.setEditable(false);
    };
    
}
