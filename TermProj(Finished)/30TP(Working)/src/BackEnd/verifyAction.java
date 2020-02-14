/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class verifyAction extends JFrame {

    private final JFXPanel jfxPanel = new JFXPanel();
    private WebEngine engine;

    public String url =  FrontEnd.Display.urlSet();

   

    public verifyAction() {
        super();
        initComponents();
        getContentPane().add(jfxPanel);
        setSize(500, 500);
// Kill everything on closing the frame
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    private void initComponents() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebView view = new WebView();
                engine = view.getEngine();
                engine.load(url);
                Scene scene = new Scene(view);
                jfxPanel.setScene(scene);
            }
        });
    }


   
}
