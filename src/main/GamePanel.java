package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import tile.TileManager;

import javax.swing.JPanel;

import entity.Player;
import object.SuperObject;

public class GamePanel extends JPanel implements Runnable {

    // SCREEN SETTING
    final int originalTileSize = 32; //16
    public final int scale = 3;

    public final int tileSize = originalTileSize * scale; 
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 9;
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize * maxScreenRow; 

    // WORLD MAP SETTINGS
    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;
    //public final int worldWidth = tileSize * maxScreenCol;
    //public final int worldHeight = tileSize * maxScreenRow;

    // FPS
    int FPS = 60;
    int fps;

    // SYSTEM
    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Sound sound = new Sound();
    public UI ui = new UI(this);
    Thread gameThread;
    public CollisionChecker cChecker = new CollisionChecker(this);

    // ENTITY AND OBJECT
    public AssetSetter aSetter = new AssetSetter(this);
    public Player player = new Player(this,keyH);
    public SuperObject obj[] = new SuperObject[10];


    // GAME STATE
    public int gameState;
    public final int playState = 1;
    public final int pauseState = 2;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void setupGame() {

        // pass index of the song
        playMusic(0);

        aSetter.setObject();
        gameState = playState;
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000/FPS; 
        double delta = 0;
        double lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;
        
        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1) {  

                update();
                repaint();
                delta--;
                drawCount++;
                
            }

            if(timer >= 1000000000) {
                fps = drawCount;
                System.out.println("FPS:" + drawCount);
                drawCount = 0;
                timer = 0;

            }
        }
    }

    public void update() {

        if(gameState == playState) {
            player.update();
        }
        if(gameState == pauseState) {
            // nothing
        }
    
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        // DEBUG
        long drawStart = 0;
        if(keyH.checkDrawTime == true) {
            drawStart = System.nanoTime();
        }

        // TILE
        tileM.draw(g2);

        // OBJECT
        for(int i = 0; i < obj.length; i++) {
            if(obj[i] != null) {
                obj[i].draw(g2, this);
            }
        }
        
        // PLAYER
        player.draw(g2);

        // UI
        ui.draw(g2);

        // FPS
        g2.setColor(Color.CYAN);
        g2.setFont(new Font("Arial", Font.BOLD, 20));
        g2.drawString("FPS: " + fps, 1440, 40);

        // DEBUG
        if(keyH.checkDrawTime == true) {
            long drawEnd = System.nanoTime();
            long passed = drawEnd - drawStart;
            g2.setColor(Color.white);
            g2.drawString("Draw Time: " + passed, 10, 400);
            System.out.println("Draw Time: " + passed); 
        }
        
        g2.dispose();
    }

    public void playMusic(int i) {

        sound.setFile(i);
        sound.play();
        sound.loop();
    }

    public void stopMusic() {

        sound.stop();
    }

    // For sound effect
    // just call gp.playSE(_);
    public void playSE(int i) {

        sound.setFile(i);
        sound.play();
    }
}
