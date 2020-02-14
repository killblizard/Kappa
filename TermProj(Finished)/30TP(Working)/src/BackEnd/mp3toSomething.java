/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author student
 */
public class mp3toSomething {

    // add drop down menu for the different options ie (mp3, wav, flv, flac)
    public static String wavStr = "java.awt.event.itemevent[item_state_changed,item=wav,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=wav]";
    public static String wmaStr = "java.awt.event.itemevent[item_state_changed,item=wma,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=wma]";
    public static String flacStr = "java.awt.event.itemevent[item_state_changed,item=flac,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=flac]";

    public static void convertToWav() {
        if (FrontEnd.Display.jcbStatus.equalsIgnoreCase(wavStr)) {
//             gets the wav file needed and then changes it
            File toBeChanged = new File(FrontEnd.Display.jtffshow2.getText());
            String a = toBeChanged.toString();
            a = a.replace(".mp3", ".wav");
            toBeChanged.renameTo(new File(a));

        }
    }

    public static void convertToWma() {
        if (FrontEnd.Display.jcbStatus.equalsIgnoreCase(wmaStr)) {
            File toBeChanged = new File(FrontEnd.Display.jtffshow2.getText());
            String a = toBeChanged.toString();
            a = a.replace(".mp3", ".wma");
            toBeChanged.renameTo(new File(a));
        }
    }

    public static void convertToFlac() {
        if (FrontEnd.Display.jcbStatus.equalsIgnoreCase(flacStr)) {
            File toBeChanged = new File(FrontEnd.Display.jtffshow2.getText());
            String a = toBeChanged.toString();
            a = a.replace(".mp3", ".flac");
            toBeChanged.renameTo(new File(a));

        }
    }

    public static void selectFile() {
        JFileChooser fc = new JFileChooser();
        int returnValue = fc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();

            FrontEnd.Display.jtffshow2.setText(selectedFile.toString());
        }

    }

}
