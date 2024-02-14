package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Entity {
    
    GamePanel gp;
    Player p;

    public int worldX, worldY;
    public int speed;

    public BufferedImage up1, up2, up3, up4, up5, up6, down1, down2, down3, down4, down5, down6, left1, left2, left3, left4, left5, left6, right1, right2, right3, right4, right5, right6;
    public String direction = "down";
    
    public int spriteCounter = 0;
    public int spriteNum = 1;
    public Rectangle solidArea = new Rectangle();;
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collisionOn = false;
    public String dialogues[][] = new String[20][20];
    public int dialoguesSet;
    public int dialoguesIndex;

    public int start;

    public BufferedImage image,image1,image2,image3,image4,image5,image6;
    public String name;
    public boolean collision = false;
    public String description;

    public Entity() {
        
    }

    public Entity(GamePanel gp) {
        this.gp = gp;
    }

    public void draw (Graphics2D g2, GamePanel gp) {
        int playerTileSize = 48 * gp.scale;
        BufferedImage image = null;
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

        if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
           worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
           worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
           worldY - gp.tileSize < gp.player.worldY + gp.player.screenY ) {

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
            
            if(name == "Angel") {
                g2.drawImage(image, screenX, screenY, 37 * gp.scale, 73 * gp.scale, null); 
            }
            if(name == "A") {
                g2.drawImage(image, screenX, screenY, 94 * gp.scale, 72 * gp.scale, null); 
            }
            if(name == "RPX3") {
                g2.drawImage(image, screenX, screenY, 26 * gp.scale, 66 * gp.scale, null); 
            }
            if(name == "RPB") {
                g2.drawImage(image, screenX, screenY, 26 * gp.scale, 38 * gp.scale, null); 
            }
            if(name == "SCV") {
                g2.drawImage(image, screenX, screenY, 32 * gp.scale, 57 * gp.scale, null); 
            }
            if(name == "T3U") {
                g2.drawImage(image, screenX, screenY, 113 * gp.scale, 75 * gp.scale, null); 
            }
            if(name == "T3L") {
                g2.drawImage(image, screenX, screenY, 113 * gp.scale, 64 * gp.scale, null); 
            }
            if(name == "W0") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W8") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W15") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W23") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W17") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W25") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W1") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W2") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W7") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W3") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W9") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W19") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W26") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W27") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W18") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "W22") {
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
            }
            if(name == "LM") {
                g2.drawImage(image, screenX, screenY, 49 * gp.scale, 96 * gp.scale, null); 
            }
            if(name == "GT1B") {
                g2.drawImage(image, screenX, screenY, 64 * gp.scale, 45 * gp.scale, null); 
            }
            if(name == "GT1T") {
                g2.drawImage(image, screenX, screenY, 64 * gp.scale, 19 * gp.scale, null); 
            }
            if(name == "BLL") {
                g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
            }
            if(name == "BLM") {
                g2.drawImage(image, screenX, screenY, 49 * gp.scale, 96 * gp.scale, null); 
            }
            if(name == "BLR") {
                g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
            }
            if(name == "BML") {
                g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
            }
            if(name == "BRR") {
                g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
            }

            
            if(name == "Door") {
                g2.drawImage(image, screenX, screenY, 37 * gp.scale, 50 * gp.scale, null); 
            }
            if(name == "Chest") {
                g2.drawImage(image, screenX, screenY, 32 * gp.scale, 49 * gp.scale, null); 
            }
            if(name == "Paper" && gp.obj[22] != null) {
                g2.drawImage(image, screenX, screenY, 53 , 55, null); 
            }

            if(name == "BT1") {
                g2.drawImage(image, screenX, screenY, 18 * gp.scale, 16 * gp.scale, null); 
            }
            if(name == "BT2") {
                g2.drawImage(image, screenX, screenY, 19 * gp.scale, 16 * gp.scale, null); 
            }
            if(name == "GA") {
                g2.drawImage(image, screenX, screenY, 30 * gp.scale, 41 * gp.scale, null); 
            }
            if(name == "GB") {
                g2.drawImage(image, screenX, screenY, 26 * gp.scale, 40 * gp.scale, null); 
            }
            if(name == "GC") {
                g2.drawImage(image, screenX, screenY, 30 * gp.scale, 29 * gp.scale, null); 
            }
            if(name == "P") {
                g2.drawImage(image, screenX, screenY, 32 * gp.scale, 77 * gp.scale, null); 
            }
            if(name == "PB") {
                g2.drawImage(image, screenX, screenY, 32 * gp.scale, 57 * gp.scale, null); 
            }
            if(name == "PoC") {
                g2.drawImage(image, screenX, screenY, 21 * gp.scale, 32 * gp.scale, null); 
            }
            if(name == "SBS") {
                g2.drawImage(image, screenX, screenY, 56 * gp.scale, 41 * gp.scale, null); 
            }
            if(name == "SL") {
                g2.drawImage(image, screenX, screenY, 22 * gp.scale, 38 * gp.scale, null); 
            }
            if(name == "W") {
                g2.drawImage(image, screenX, screenY, 58 * gp.scale, 49 * gp.scale, null); 
            }
            if(name == "FW1" && gp.obj[384] != null) {
                g2.drawImage(image, screenX, screenY, (int)(1138/20), (int)(1451/20), null); 
            }
            if(name == "FW2" && gp.obj[383] != null) {
                g2.drawImage(image, screenX, screenY, (int)(1021/20), (int)(1648/20), null); 
            }
            if(name == "FW3" && gp.obj[385] != null) {
                g2.drawImage(image, screenX, screenY, (int)(1256/25), (int)(1648/25), null); 
            }

            if(name == "player") {
                g2.drawImage(image, screenX, screenY, playerTileSize, playerTileSize, null);
            }
        }
    }

    public BufferedImage setup(String imagePath) {

        BufferedImage image = null;

        try {
            image = ImageIO.read(new FileInputStream(imagePath + ".png"));

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
