package BackEnd;

import java.io.File;
import javax.swing.JFileChooser;

public class somethingtomp3 {

    public static String wavStr = "java.awt.event.itemevent[item_state_changed,item=wav,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=wav]";
    public static String wmaStr = "java.awt.event.itemevent[item_state_changed,item=wma,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=wma]";
    public static String flacStr = "java.awt.event.itemevent[item_state_changed,item=flac,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=flac]";

    public static void wavToMp3() {
        File toBeChanged = new File(FrontEnd.Display.jtffShow3.getText());
        String a = toBeChanged.toString();
        a = a.replace(".wav", ".mp3");
        toBeChanged.renameTo(new File(a));


    }

    public static void wmaToMp3() {
        File toBeChanged = new File(FrontEnd.Display.jtffShow3.getText());
        String a = toBeChanged.toString();
        a = a.replace(".wma", ".mp3");
        toBeChanged.renameTo(new File(a));
    }

    public static void flacToMp3() {
        File toBeChanged = new File(FrontEnd.Display.jtffShow3.getText());
        String a = toBeChanged.toString();
        a = a.replace(".flac", ".mp3");
        toBeChanged.renameTo(new File(a));
    }

    public static void selectFile() {
        JFileChooser fc = new JFileChooser();
        int returnValue = fc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();

            FrontEnd.Display.jtffShow3.setText(selectedFile.toString());
        }

    }

}
