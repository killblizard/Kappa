/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.File;
import it.sauronsoftware.jave.*;
import javax.swing.JFileChooser;

/**
 *
 * @author student
 */
public class mp4Tomp3 {

    static String path = "";

    public static void ConvertToAudio(File video) throws IllegalArgumentException, EncoderException {
        File target = new File(path);
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(128000);
        audio.setChannels(2);
        audio.setSamplingRate(44100);
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        encoder.encode(video, target, attrs);
    }

    public static void selectFile() {
        JFileChooser fc = new JFileChooser();
        int returnValue = fc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            path = selectedFile.getName().replace(".mp4", "") + ".mp3";
            FrontEnd.Display.jtffShow.setText(selectedFile.toString());

        }
    }
;
}
