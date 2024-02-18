package main;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static JFrame window;

    public static void main(String[] args) {

        
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Meow");
        new Main().setIcon();

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        gamePanel.config.loadConfig();
        if(gamePanel.fullScreenOn == true) {
            window.setUndecorated(true);
        }

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setupGame();
        gamePanel.startGameThread();
        
    }
    
    public void setIcon() {
        try {
            ImageIcon icon = new ImageIcon(ImageIO.read(new FileInputStream("res/background/Icon2.png")));
            window.setIconImage(icon.getImage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}