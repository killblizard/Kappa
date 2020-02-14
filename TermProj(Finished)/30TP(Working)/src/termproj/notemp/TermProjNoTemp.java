package termproj.notemp;

import FrontEnd.*;
import java.io.IOException;
import javax.swing.UIManager;

/**
 *
 * @author student
 */
public class TermProjNoTemp {

    public static void main(String[] args) throws IOException {
        

        FrontEnd.Display.makeFrame();
        BackEnd.MakesProgramWork.actions();
        FrontEnd.Display.urlSet();
    }

}
