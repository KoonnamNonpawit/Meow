package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tile.TileManager;

import javax.swing.JPanel;

import data.SaveLoad;
import entity.Entity;
import entity.Player;
import object.OBJ_A;
import object.OBJ_BLM;
import object.OBJ_GC;
import object.OBJ_LM;
import object.OBJ_ST2;
import object.OBJ_ST4;
import object.OBJ_T3U;
import object.OBJ_W0;
import object.OBJ_W1;
import object.OBJ_W15;
import object.OBJ_W16;
import object.OBJ_W17;
import object.OBJ_W18;
import object.OBJ_W19;
import object.OBJ_W2;
import object.OBJ_W22;
import object.OBJ_W23;
import object.OBJ_W24;
import object.OBJ_W25;
import object.OBJ_W26;
import object.OBJ_W27;
import object.OBJ_W3;
import object.OBJ_W7;
import object.OBJ_W8;
import object.OBJ_W9;

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

    // FOR FULL SCREEN
    int screenWidth2 = screenWidth;
    int screenHeight2 = screenHeight;
    BufferedImage tempScreen;
    Graphics2D g2;
    public boolean fullScreenOn = false;

    // FPSa
    int FPS = 60;
    int fps;

    // SYSTEM
    TileManager tileM = new TileManager(this);
    public KeyHandler keyH = new KeyHandler(this);
    Sound music = new Sound();
    Sound se = new Sound();
    public UI ui = new UI(this);
    Thread gameThread;
    public CollisionChecker cChecker = new CollisionChecker(this);
    Config config = new Config(this);
    SaveLoad saveLoad = new SaveLoad(this);

    // ENTITY AND OBJECT
    public AssetSetter aSetter = new AssetSetter(this);
    public Player player = new Player(this,keyH);
    public Entity obj[] = new Entity[600];
    public ArrayList<Entity> entityList = new ArrayList<>();

    // public Entity entity;
    // public Player p;


    // GAME STATE
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int dialogueState = 3;
    public final int optionsState = 4;
    public final int characterState = 5;
    public final int gameOverState = 6;
    public final int puzzleState = 8;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void setupGame() {

        // Play music when on TITLE Screen
        if(gameState == titleState) {
            playMusic(1);
        }

        gameState = titleState;
        aSetter.setObject();

        tempScreen = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB);
        g2 = (Graphics2D)tempScreen.getGraphics();

        if(fullScreenOn == true) {
            setFullScreen();
        }

    }

    public void startOver() {
        player.setDefaultValues();
        player.setItems();
        aSetter.setObject();
        // restart puzzle progress
        player.resetProgress();
        update();
    }

    public void setFullScreen() {

        // GET LOCAL SCREEN DEVICE
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        gd.setFullScreenWindow(Main.window);

        // GET FULL SCREEN WIDTH AND HEIGHT
        screenWidth2 = Main.window.getWidth();
        screenHeight2 = Main.window.getHeight();
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
                drawToTempScreen(); // draw everything to the buffered image
                drawToScreen(); // draw the buffered image to the screen
                delta--;
                drawCount++;
                
            }

            if(timer >= 1000000000) {
                fps = drawCount;
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

    public void drawToTempScreen() {

        // Everything in paintComponent(Graphics g) get in there.
        // Except super.paintComponent(g);
        // Graphics2D g2 = (Graphics2D)g;
        // g2.dispose();

        // BACKGROUND

        // DEBUG
        long drawStart = 0;
        if(keyH.showDebugText == true) {
            drawStart = System.nanoTime();
        }
        
        // TITLE SCREEN
        if(gameState == titleState) {
            ui.draw(g2);
        } else {
            // TILE
            tileM.draw(g2);
        
            // // OBJECT
            // for(int i = 0; i < obj.length; i++) {
            //     if(obj[i] != null) {
            //         obj[i].draw(g2, this);
            //     }
            // }
                
            // // PLAYER
            // player.draw(g2);

            // ADD ENTITIES TO THE LIST
            entityList.add(player);

            for(int i = 0; i < obj.length; i++) {
                if(obj[i] != null && !(obj[i] instanceof OBJ_A) && !(obj[i] instanceof OBJ_BLM) && !(obj[i] instanceof OBJ_LM) && !(obj[i] instanceof OBJ_ST2) && !(obj[i] instanceof OBJ_ST4) && !(obj[i] instanceof OBJ_GC) && !(obj[i] instanceof OBJ_W0) && !(obj[i] instanceof OBJ_W1) && !(obj[i] instanceof OBJ_W2) && !(obj[i] instanceof OBJ_W3) && !(obj[i] instanceof OBJ_W7) && !(obj[i] instanceof OBJ_W8) && !(obj[i] instanceof OBJ_W9) && !(obj[i] instanceof OBJ_W18) && !(obj[i] instanceof OBJ_W19) && !(obj[i] instanceof OBJ_W22) && !(obj[i] instanceof OBJ_W26) && !(obj[i] instanceof OBJ_W27) && !(obj[i] instanceof OBJ_W15) && !(obj[i] instanceof OBJ_W16) && !(obj[i] instanceof OBJ_W17) && !(obj[i] instanceof OBJ_W23) && !(obj[i] instanceof OBJ_W24) && !(obj[i] instanceof OBJ_W25) && !(obj[i] instanceof OBJ_T3U)) {
                    entityList.add(obj[i]);
                }
                if(obj[i] instanceof OBJ_A || obj[i] instanceof OBJ_BLM || obj[i] instanceof OBJ_LM || obj[i] instanceof OBJ_ST2 || obj[i] instanceof OBJ_ST4 || obj[i] instanceof OBJ_GC || obj[i] instanceof OBJ_W0 || obj[i] instanceof OBJ_W1 || obj[i] instanceof OBJ_W2 || obj[i] instanceof OBJ_W3 || obj[i] instanceof OBJ_W7 || obj[i] instanceof OBJ_W8 || obj[i] instanceof OBJ_W9 || obj[i] instanceof OBJ_W18 || obj[i] instanceof OBJ_W19 || obj[i] instanceof OBJ_W22 || obj[i] instanceof OBJ_W26 || obj[i] instanceof OBJ_W27 || obj[i] instanceof OBJ_W15 || obj[i] instanceof OBJ_W16 || obj[i] instanceof OBJ_W17 || obj[i] instanceof OBJ_W23 || obj[i] instanceof OBJ_W24 || obj[i] instanceof OBJ_W25) {
                    obj[i].draw(g2, this);
                }
            }

            // SORT
            // Collections.sort(entityList, new Comparator<Entity>() {

            //     @Override
            //     public int compare(Entity e1, Entity e2) {
                    
            //         int result = Integer.compare(e1.worldX, e2.worldY);
            //         return result;
            //     }
                
            // });
            Collections.sort(entityList, new Comparator<Entity>() {
                @Override
                public int compare(Entity e1, Entity e2) {
                    return Integer.compare(e1.worldY, e2.worldY);
                }
            });

            // DRAW ENTITIES
            for (int i = 0; i < entityList.size(); i++) {
                entityList.get(i).draw(g2,this);
                // if(entityList.get(i) == player) {
                //     player.draw(g2);
                // }
                // else {
                //     SuperObject s = (SuperObject)(entityList.get(i));
                //     s.draw(g2);
                // }
            }
            // EMPTY ENTITY LIST
            for (int i = 0; i < entityList.size(); i++) {
                entityList.remove(i);
            }

            if(obj[426] instanceof OBJ_T3U) {
                obj[426].draw(g2, this);
            }
        
            // UI
            ui.draw(g2);
        
            // FPS
            g2.setColor(Color.CYAN);
            g2.setFont(new Font("Arial", Font.BOLD, 20));
        }

        // DEBUG
        if(keyH.showDebugText == true) {
            long drawEnd = System.nanoTime();
            long passed = drawEnd - drawStart;

            g2.setFont(new Font("Arial", Font.PLAIN, 20));
            g2.setColor(Color.cyan);
            int x = 1300;
            int y = 40;
            int lineHeight =20;

            g2.drawString("FPS: " + fps, x, y); y += lineHeight;
            g2.drawString("x : " + (player.worldX + player.solidArea.x)/tileSize, x, y); y += lineHeight;
            g2.drawString("y : " + (player.worldY + player.solidArea.y)/tileSize, x, y); y += lineHeight;
            g2.drawString("Draw Time: " + passed, x, y);
        }
        
    }

    public void drawToScreen() {

        Graphics g = getGraphics();
        g.drawImage(tempScreen, 0, 0, screenWidth2, screenHeight2, null);
        g.dispose();
    }

    public void playMusic(int i) {

        music.setFile(i);
        music.play();
        music.loop();
    }

    public void stopMusic() {

        music.stop();
    }

    // For sound effect
    // just call gp.playSE(_);
    public void playSE(int i) {

        se.setFile(i);
        se.play();
    }
}
