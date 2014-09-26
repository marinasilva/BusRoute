/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package googlemaps;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserFactory;
import java.awt.BorderLayout;
import javafx.scene.layout.Border;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GoogleMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.setVisible(true);
       /* System.setProperty("teamdev.license.info", "true");
        Browser browser = BrowserFactory.create();
        
        JFrame frame = new JFrame("JxBrowser Google Maps");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browser.getView().getComponent(), BorderLayout.CENTER);
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        browser.loadURL("https://www.google.com.br/maps/place/R.+Humberto+de+Campos,+204+-+Sagrado+Coracao+de+Jesus,+Lages+-+SC,+88508-190/@-27.8070827,-50.3174462,17z/data=!3m1!4b1!4m2!3m1!1s0x94e01f327fd6b987:0x9f5f8e3417c47e46");
    */}
}
