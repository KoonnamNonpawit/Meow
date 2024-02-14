package main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundImage extends JPanel{

    public Image Pic;

    public BackgroundImage() {
        ImageIcon obj = new ImageIcon("res/background/BG.png");
        Pic = obj.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Pic, 0, 0, null);
    }
    
}
