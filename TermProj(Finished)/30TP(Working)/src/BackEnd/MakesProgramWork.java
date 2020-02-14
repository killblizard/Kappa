package BackEnd;

import FrontEnd.Display;
import it.sauronsoftware.jave.EncoderException;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class MakesProgramWork extends Display {

    private static class searchButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            verifyAction main = new verifyAction();
            main.setVisible(true);
        }
    }

    private static class helpButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            BackEnd.helpButtonClass.helpAction();
        }

    }

    private static class downloadButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                BackEnd.downloadMusic.download();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }

    private static class fileChooseButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            BackEnd.mp4Tomp3.selectFile();
        }
    }

    private static class fileChooseButton2 implements ActionListener {// for mp3 to 

        @Override
        public void actionPerformed(ActionEvent ae) {
            BackEnd.mp3toSomething.selectFile();
        }
    }

    private static class fileChooseButton3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            BackEnd.somethingtomp3.selectFile();
        }

    }

    private static class videoToAudio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            File f = new File(FrontEnd.Display.jtffShow.getText());
            try {
                BackEnd.mp4Tomp3.ConvertToAudio(f);
            } catch (IllegalArgumentException ex) {
                throw new RuntimeException(ex);
            } catch (EncoderException ex) {
                throw new RuntimeException(ex);
            }

        }

    }

    private static class convertMp3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (FrontEnd.Display.jcbStatus.equalsIgnoreCase(BackEnd.mp3toSomething.wavStr)) {
                BackEnd.mp3toSomething.convertToWav();
            } else if (FrontEnd.Display.jcbStatus.equalsIgnoreCase(BackEnd.mp3toSomething.flacStr)) {
                BackEnd.mp3toSomething.convertToFlac();
            } else if (FrontEnd.Display.jcbStatus.equalsIgnoreCase(BackEnd.mp3toSomething.wmaStr)) {
                BackEnd.mp3toSomething.convertToWma();
            }
            // 
        }
    }

    private static class ConvertToMp3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (FrontEnd.Display.jcbStatus2.equalsIgnoreCase(BackEnd.mp3toSomething.wavStr)) {
                BackEnd.somethingtomp3.wavToMp3();
            } else if (FrontEnd.Display.jcbStatus2.equalsIgnoreCase(BackEnd.mp3toSomething.flacStr)) {
                BackEnd.somethingtomp3.flacToMp3();
            } else if (FrontEnd.Display.jcbStatus2.equalsIgnoreCase(BackEnd.mp3toSomething.wmaStr)) {
                BackEnd.somethingtomp3.wmaToMp3();
            }
        }
    }

    private static class supportButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Desktop.getDesktop().browse(new URL("https://www.kickstarter.com/projects/1788192490/753198173?ref=6ygo11&token=e27e4a94").toURI());
            } catch (IOException | URISyntaxException ex) {
               // throw new RuntimeException(ex);
            }
        }
    }

    public static void actions() {
        searchButton.addActionListener(new searchButtonAction());
        helpButton.addActionListener(new helpButtonAction());
        downButton.addActionListener(new downloadButtonAction());
        selFileButton.addActionListener(new fileChooseButton());
        selFile2Button.addActionListener(new fileChooseButton2());
        selFile3Button.addActionListener(new fileChooseButton3());
        convertButton.addActionListener(new videoToAudio());
        convertmp3Button.addActionListener(new convertMp3());
        convertToMp3Button.addActionListener(new ConvertToMp3());
        supportButton.addActionListener(new supportButton());

    }
}
