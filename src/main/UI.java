package main;

import java.awt.Font;
import java.awt.Graphics2D;
import java.text.DecimalFormat;

public class UI {
    

    GamePanel gp;
    Graphics2D g2;
    Font arial_40;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;


    public UI(GamePanel gp) {
        this.gp = gp;

        arial_40 = new Font("Arial", Font.PLAIN, 40);
        
    }

    public void showMessage(String text) {

        message = text;
        messageOn = true;
    }
    public void draw(Graphics2D g2) {

    }
}
