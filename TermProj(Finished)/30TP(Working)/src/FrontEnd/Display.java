package FrontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author student
 */
public class Display {

    public static JFrame frame;
    public static JButton searchButton;
    public static ImageIcon imgLogo;
    public static JButton logo;
    public static JButton downButton;
    public static JButton helpButton;
    public static JButton convertButton;
    public static JButton selFileButton;
    public static JButton selFile2Button;
    public static JButton selFile3Button;
    public static JButton convertmp3Button;
    public static JButton supportButton;
    public static JButton convertToMp3Button;
    public static JEditorPane jep;
    public static JTextField jtfVer;
    public static JTextField jtffshow2;
    public static JTextField jtffShow;
    public static JTextField jtffShow3;
    public static JTextField jtfDow;
    public static String urlSearch;
    public static JComboBox jcb;
    public static JComboBox jcb2;

    public static String jcbStatus = "java.awt.event.itemevent[item_state_changed,item=wav,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=wav]";
    public static String jcbStatus2 = "java.awt.event.itemevent[item_state_changed,item=wav,statechange=selected] on javax.swing.jcombobox[,130,283,65x20,layout=javax.swing.plaf.metal.metalcomboboxui$metalcomboboxlayoutmanager,alignmentx=0.0,alignmenty=0.0,border=,flags=328,maximumsize=,minimumsize=,preferredsize=,iseditable=false,lightweightpopupenabled=true,maximumrowcount=8,selecteditemreminder=wav]";

    public static void makeFrame() throws IOException {
        // combo box array;
        String[] jcbArr = {"Wav", "Wma", "Flac"};
        String[] jcbArr2 = {"Wav", "Wma", "Flac"};
        //initialize the variables
        frame = new JFrame("MP3Shuttle");
        jep = new JEditorPane();
        searchButton = new JButton();
        downButton = new JButton();
        helpButton = new JButton();
        convertmp3Button = new JButton();
        convertToMp3Button = new JButton();
        convertButton = new JButton();
        selFile2Button = new JButton();
        selFileButton = new JButton();
        selFile3Button = new JButton();
        supportButton = new JButton();
        jtfVer = new JTextField();
        jtffshow2 = new JTextField();
        jtffShow3 = new JTextField();
        jtfDow = new JTextField();
        jtffShow = new JTextField();
        imgLogo = new ImageIcon("/media/VirtualHome/student/Downloads/Comp sci 30/TermProj(NoTemp)");
        logo = new JButton();
        jcb = new JComboBox(jcbArr);
        jcb2 = new JComboBox(jcbArr2);

        // edititing things         
        frame.setSize(850, 550);
        frame.add(new JScrollPane(jep));
        frame.setLocation(400, 150);

        jep.add(searchButton);
        jep.add(downButton);
        jep.add(helpButton);
        jep.add(convertButton);
        jep.add(selFileButton);
        jep.add(convertmp3Button);
        jep.add(convertToMp3Button);
        jep.add(selFile2Button);
        jep.add(selFile3Button);
        jep.add(supportButton);
        jep.add(jtfVer);
        jep.add(jtfDow);
        jep.add(jtffshow2);
        jep.add(jtffShow3);
        jep.add(logo);
        jep.add(jtffShow);
        jep.add(jcb);
        jep.add(jcb2);
        jep.setBackground(new java.awt.Color(255, 191, 100));

        searchButton.setLocation(500, 190);
        searchButton.setSize(105, 25);
        searchButton.setBackground(Color.black);
        searchButton.setText("Search");
        searchButton.setForeground(Color.white);

        downButton.setLocation(500, 220);
        downButton.setSize(105, 25);
        downButton.setBackground(Color.black);
        downButton.setText("Download");
        downButton.setForeground(Color.white);

        helpButton.setLocation(700, 470);
        helpButton.setSize(105, 25);
        helpButton.setBackground(Color.white);
        helpButton.setText("Help");
        helpButton.setForeground(Color.black);
        
        supportButton.setLocation(575, 470);
        supportButton.setSize(105, 25);
        supportButton.setBackground(Color.white);
        supportButton.setText("Donate $");
        supportButton.setForeground(Color.black);

        convertButton.setLocation(500, 250);
        convertButton.setSize(105, 25);
        convertButton.setBackground(Color.black);
        convertButton.setText("Convert");;
        convertButton.setForeground(Color.white);

        convertmp3Button.setLocation(500, 280);
        convertmp3Button.setSize(105, 25);
        convertmp3Button.setBackground(Color.black);
        convertmp3Button.setText("Convert");;
        convertmp3Button.setForeground(Color.white);

        convertToMp3Button.setLocation(500, 310);
        convertToMp3Button.setSize(105, 25);
        convertToMp3Button.setBackground(Color.black);
        convertToMp3Button.setText("Convert");
        convertToMp3Button.setForeground(Color.white);

        selFileButton.setLocation(200, 250);
        selFileButton.setSize(107, 25);
        selFileButton.setBackground(Color.black);
        selFileButton.setText("Select File");;
        selFileButton.setForeground(Color.white);

        selFile2Button.setLocation(200, 280);
        selFile2Button.setSize(107, 25);
        selFile2Button.setBackground(Color.black);
        selFile2Button.setText("Select File");
        selFile2Button.setForeground(Color.white);

        selFile3Button.setLocation(200, 310);
        selFile3Button.setSize(107, 25);
        selFile3Button.setBackground(Color.black);
        selFile3Button.setText("Select File");
        selFile3Button.setForeground(Color.white);

        logo.setLocation(480, 15);
        logo.setSize(84, 114);
        logo.setIcon(new ImageIcon("rocket.png"));
        logo.setBorderPainted(false);
        logo.setFocusPainted(false);
        logo.setOpaque(false);
        logo.setContentAreaFilled(false);
        logo.setBorderPainted(false);

//MP3-Rocket
        //Editing textFields
        jtfVer.setLocation(200, 190);
        jtfVer.setSize(285, 25);
        jtfDow.setLocation(200, 220);
        jtfDow.setSize(285, 25);

        jtffShow.setLocation(310, 250);
        jtffShow.setSize(175, 25);
        jtffShow.setEditable(false);

        jtffshow2.setLocation(310, 280);
        jtffshow2.setSize(175, 25);
        jtffshow2.setEditable(false);

        jtffShow3.setLocation(310, 310);
        jtffShow3.setSize(175, 25);
        jtffShow3.setEditable(false);

        jcb.setLocation(130, 283);
        jcb.setSize(65, 20);
        jcb.setVisible(true);

        jcb2.setLocation(75, 313);
        jcb2.setSize(65, 20);
        jcb2.setVisible(true);
        //setting the different sets of editable
        jep.setEditable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        jtfVer.setVisible(true);
        jtfDow.setVisible(true);

        //any extras methods for displays
        makeLabel();
        jcbMethod();
        jcbMethod2();

    }

    public static void makeLabel() {
        //version label
        JLabel jl1 = new JLabel("Beta Test 2.1.9.");
        jl1.setLocation(0, 475);
        jl1.setSize(500, 50);
        jep.add(jl1);

        // video search here label
        JLabel jl2 = new JLabel("Video Search:");
        jl2.setLocation(100, 178);
        jl2.setSize(500, 50);
        jep.add(jl2);

        // Title label
        JLabel jl3 = new JLabel("MP4Shuttle");
        jl3.setLocation(300, 20);
        jl3.setSize(500, 50);
        jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        jep.add(jl3);

        // download here label
        JLabel jl4 = new JLabel("Download Here:");
        jl4.setLocation(84, 208);
        jl4.setSize(500, 50);
        jep.add(jl4);

        // mp4 to mp3 label
        JLabel jl5 = new JLabel("Mp4 to mp3:");
        jl5.setLocation(110, 238);
        jl5.setSize(500, 50);
        jep.add(jl5);

        // mp3 to (DropDownMenu) 
        JLabel jl6 = new JLabel("Mp3 to ");
        jl6.setLocation(75, 268);
        jl6.setSize(500, 50);
        jep.add(jl6);

        // (DropDownMenu) to mp3
        JLabel jl7 = new JLabel(" to Mp3:");
        jl7.setLocation(140, 295);
        jl7.setSize(500, 50);
        jep.add(jl7);

        jl1.setVisible(true);
        jl2.setVisible(true);
        jl3.setVisible(true);
        jl4.setVisible(true);
        jl5.setVisible(true);
        jl5.setVisible(true);

    }

    public static String urlSet() {
        String a = jtfVer.getText();

        urlSearch = "https://www.youtube.com/results?search_query=" + a;

        return urlSearch;
    }

    public static void jcbMethod() {
        jcb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    // to do code 
                    // make it so that once there is text in the textbox then it runs the thing and so that it can use the convert(maybe move the jcb to another package)
                    jcbStatus = event.toString().toLowerCase();

                }
            }
        }
        );

    }

    public static void jcbMethod2() {
        jcb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    // to do code 
                    // make it so that once there is text in the textbox then it runs the thing and so that it can use the convert(maybe move the jcb to another package)
                    jcbStatus2 = event.toString().toLowerCase();

                }
            }
        }
        );

    }

}
// ty julio for all the help
