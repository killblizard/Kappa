/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class downloadMusic {

    public static void download() throws IOException {

        Runtime rt = Runtime.getRuntime();
        String downUrl = FrontEnd.Display.jtfDow.getText();
       // Process pr = rt.exec("/media/VirtualHome/student/Downloads/30TP(Working) -c youtube-dl.exe " + downUrl);
        Process pr = rt.exec("youtube-dl.exe " + downUrl);

        BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        BufferedReader error = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
        String s = null;
        while ((s = input.readLine()) != null) {
            System.out.println(s);
        }
        while ((s = error.readLine()) != null) {
            System.out.println(s);
        }
    }
}
