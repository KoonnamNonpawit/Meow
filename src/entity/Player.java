package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;
import main.UtilityTool;

public class Player extends Entity{
    
    GamePanel gp;
    KeyHandler keyH;

    // Indicate where we draw player on the screen (camera).
    public final int screenX;
    public final int screenY;
    public int hasPaper = 0;

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
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
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
        // syntax to add image 
        //varName = setup("image name");

        up1 = setup("PlayerU1");
        up2 = setup("PlayerU2");
        up3 = setup("PlayerU3");
        up4 = setup("PlayerU4");
        up5 = setup("PlayerU5");
        up6 = setup("PlayerU6");
        down1 = setup("PlayerD1");
        down2 = setup("PlayerD2");
        down3 = setup("PlayerD3");
        down4 = setup("PlayerD4");
        down5 = setup("PlayerD5");
        down6 = setup("PlayerD6");
        left1 = setup("PlayerL1");
        left2 = setup("PlayerL2");
        left3 = setup("PlayerL3");
        left4 = setup("PlayerL4");
        left5 = setup("PlayerL5");
        left6 = setup("PlayerL6");
        right1 = setup("PlayerR1");
        right2 = setup("PlayerR2");
        right3 = setup("PlayerR3");
        right4 = setup("PlayerR4");
        right5 = setup("PlayerR5");
        right6 = setup("PlayerR6");

    }

    public BufferedImage setup(String imageName) {

        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;
        try {
            image = ImageIO.read(new FileInputStream("res/player/" + imageName +".png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
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

            // CHECK OBJECT COLLISION
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);

            if(objIndex == 6) {
                interactOBJ(objIndex);
            }

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

            switch (objectName) {
                case "Paper":
                    hasPaper++;
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a paper!");
                    break;
            }
        }
    }
    public void interactOBJ(int i) {

        if(i != 999) {
            if(gp.keyH.enterPressed == true) {
                gp.gameState = gp.dialogueState;
                if(i == 6) {
                    gp.ui.currentDialogue = "Hello \nmewo";
                }
            }
            
        }
        gp.keyH.enterPressed = false;
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
