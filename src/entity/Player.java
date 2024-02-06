package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{
    
    GamePanel gp;
    KeyHandler keyH;

    // Indicate where we draw player on the screen (camera).
    public final int screenX;
    public final int screenY;
    public int hasKey = 0;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;

        // doesn't change throughout the game (how big camera is).
        // locate at the middle of the screen.
        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);

        solidArea = new Rectangle();
        solidArea.x = 42;
        solidArea.y = 99;
        solidArea.width = 63;
        solidArea.height = 45;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues() {

        worldX = gp.tileSize * 30;
        worldY = gp.tileSize * 20;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage() {

        try {

            up1 = ImageIO.read(new FileInputStream("res/player/PlayerU1.png"));
            up2 = ImageIO.read(new FileInputStream("res/player/PlayerU2.png"));
            up3 = ImageIO.read(new FileInputStream("res/player/PlayerU3.png"));
            up4 = ImageIO.read(new FileInputStream("res/player/PlayerU4.png"));
            up5 = ImageIO.read(new FileInputStream("res/player/PlayerU5.png"));
            up6 = ImageIO.read(new FileInputStream("res/player/PlayerU6.png"));
            down1 = ImageIO.read(new FileInputStream("res/player/PlayerD1.png"));
            down2 = ImageIO.read(new FileInputStream("res/player/PlayerD2.png"));
            down3 = ImageIO.read(new FileInputStream("res/player/PlayerD3.png"));
            down4 = ImageIO.read(new FileInputStream("res/player/PlayerD4.png"));
            down5 = ImageIO.read(new FileInputStream("res/player/PlayerD5.png"));
            down6 = ImageIO.read(new FileInputStream("res/player/PlayerD6.png"));
            left1 = ImageIO.read(new FileInputStream("res/player/PlayerL1.png"));
            left2 = ImageIO.read(new FileInputStream("res/player/PlayerL2.png"));
            left3 = ImageIO.read(new FileInputStream("res/player/PlayerL3.png"));
            left4 = ImageIO.read(new FileInputStream("res/player/PlayerL4.png"));
            left5 = ImageIO.read(new FileInputStream("res/player/PlayerL5.png"));
            left6 = ImageIO.read(new FileInputStream("res/player/PlayerL6.png"));
            right1 = ImageIO.read(new FileInputStream("res/player/PlayerR1.png"));
            right2 = ImageIO.read(new FileInputStream("res/player/PlayerR2.png"));
            right3 = ImageIO.read(new FileInputStream("res/player/PlayerR3.png"));
            right4 = ImageIO.read(new FileInputStream("res/player/PlayerR4.png"));
            right5 = ImageIO.read(new FileInputStream("res/player/PlayerR5.png"));
            right6 = ImageIO.read(new FileInputStream("res/player/PlayerR6.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void update() {

        if(keyH.upPressed == true || keyH.downPressed == true || 
           keyH.leftPressed == true || keyH.rightPressed == true) {
            if(keyH.upPressed == true) {
                direction = "up";
            }
            else if(keyH.downPressed == true) {
                direction = "down";
            }
            else if(keyH.leftPressed == true) {
                direction = "left";
            }
            else if(keyH.rightPressed == true) {
                direction = "right";
            }

            // CHECK TILE COLLISION
            collisionOn = false;
            gp.cChecker.checkTile(this);

            // IF COLLISION IS FALSE, PLAYER CAN MOVE
            if (collisionOn == false) {
                
                switch (direction) {
                case "up": worldY -= speed; break;
                case "down": worldY += speed; break;
                case "left": worldX -= speed; break;
                case "right": worldX += speed; break;
                }
            }
        }
        spriteCounter++;
        if(spriteCounter > 9) {
            if(spriteNum == 1) {
                spriteNum = 2;
            }
            else if(spriteNum == 2) {
                spriteNum = 3;
            }
            else if(spriteNum == 3) {
                spriteNum = 4;
            }
            else if(spriteNum == 4) {
                spriteNum = 5;
            }
            else if(spriteNum == 5) {
                spriteNum = 6;
            }
            else if(spriteNum == 6) {
                spriteNum = 1;
            }
            spriteCounter = 0;
        }
    }
    public void pickUpObject(int i) {

        if(i != 999) {

            String objectName = gp.obj[i].name;

        }
    }
    public void draw(Graphics2D g2) {

        int playerTileSize = 48 * gp.scale;

        BufferedImage image = null;

        switch (direction) {
            case "up": 
                if(spriteNum == 1) {
                    image = up1;
                }
                if(spriteNum == 2) {
                    image = up2;
                }
                if(spriteNum == 3) {
                    image = up3;
                }
                if(spriteNum == 4) {
                    image = up4;
                }
                if(spriteNum == 5) {
                    image = up5;
                }
                if(spriteNum == 6) {
                    image = up6;
                }
                break;
            case "down":
                if(spriteNum == 1) {
                    image = down1;
                }
                if(spriteNum == 2) {
                    image = down2;
                }
                if(spriteNum == 3) {
                    image = down3;
                }
                if(spriteNum == 4) {
                    image = down4;
                }
                if(spriteNum == 5) {
                    image = down5;
                }
                if(spriteNum == 6) {
                    image = down6;
                }
                break; 
            case "left":
                if(spriteNum == 1) {
                    image = left1;
                }
                if(spriteNum == 2) {
                    image = left2;
                }
                if(spriteNum == 3) {
                    image = left3;
                }
                if(spriteNum == 4) {
                    image = left4;
                }
                if(spriteNum == 5) {
                    image = left5;
                }
                if(spriteNum == 6) {
                    image = left6;
                }
                break;
            case "right":
                if(spriteNum == 1) {
                    image = right1;
                }
                if(spriteNum == 2) {
                    image = right2;
                }
                if(spriteNum == 3) {
                    image = right3;
                }
                if(spriteNum == 4) {
                    image = right4;
                }
                if(spriteNum == 5) {
                    image = right5;
                }
                if(spriteNum == 6) {
                    image = right6;
                }
                break;
        }
        g2.drawImage(image, screenX, screenY, playerTileSize, playerTileSize, null);
    }
}
