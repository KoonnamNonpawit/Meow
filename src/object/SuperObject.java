package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import entity.Entity;
import main.GamePanel;

public class SuperObject extends Entity{
    
    // public BufferedImage image,image1,image2,image3,image4,image5,image6;
    // public String name;
    // public boolean collision = false;
    // public int worldX, worldY;
    // public Rectangle solidArea = new Rectangle();
    // public int solidAreaDefaultX;
    // public int solidAreaDefaultY;

    // GamePanel gp;

    // ITEM ATTRIBUTES
    public String description;

    // public void draw(Graphics2D g2) {

    //     int screenX = worldX - gp.player.worldX + gp.player.screenX;
    //     int screenY = worldY - gp.player.worldY + gp.player.screenY;

    //     if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
    //        worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
    //        worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
    //        worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

    //         if(name == "Angel") {
    //             g2.drawImage(image, screenX, screenY, 37 * gp.scale, 73 * gp.scale, null); 
    //         }
    //         if(name == "A") {
    //             g2.drawImage(image, screenX, screenY, 94 * gp.scale, 72 * gp.scale, null); 
    //         }
    //         if(name == "RPX3") {
    //             g2.drawImage(image, screenX, screenY, 26 * gp.scale, 66 * gp.scale, null); 
    //         }
    //         if(name == "RPB") {
    //             g2.drawImage(image, screenX, screenY, 26 * gp.scale, 38 * gp.scale, null); 
    //         }
    //         if(name == "SCV") {
    //             g2.drawImage(image, screenX, screenY, 32 * gp.scale, 57 * gp.scale, null); 
    //         }
    //         if(name == "T3U") {
    //             g2.drawImage(image, screenX, screenY, 113 * gp.scale, 75 * gp.scale, null); 
    //         }
    //         if(name == "T3L") {
    //             g2.drawImage(image, screenX, screenY, 113 * gp.scale, 64 * gp.scale, null); 
    //         }
    //         if(name == "W0") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W8") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W15") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W23") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W17") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W25") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W1") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W2") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W7") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W3") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W9") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W19") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W26") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W27") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W18") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "W22") {
    //             g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null); 
    //         }
    //         if(name == "LM") {
    //             g2.drawImage(image, screenX, screenY, 49 * gp.scale, 96 * gp.scale, null); 
    //         }
    //         if(name == "GT1B") {
    //             g2.drawImage(image, screenX, screenY, 64 * gp.scale, 45 * gp.scale, null); 
    //         }
    //         if(name == "GT1T") {
    //             g2.drawImage(image, screenX, screenY, 64 * gp.scale, 19 * gp.scale, null); 
    //         }
    //         if(name == "BLL") {
    //             g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
    //         }
    //         if(name == "BLM") {
    //             g2.drawImage(image, screenX, screenY, 49 * gp.scale, 96 * gp.scale, null); 
    //         }
    //         if(name == "BLR") {
    //             g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
    //         }
    //         if(name == "BML") {
    //             g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
    //         }
    //         if(name == "BRR") {
    //             g2.drawImage(image, screenX, screenY, 8 * gp.scale, 96 * gp.scale, null); 
    //         }

            
    //         if(name == "Door") {
    //             g2.drawImage(image, screenX, screenY, 37 * gp.scale, 50 * gp.scale, null); 
    //         }
    //         if(name == "Chest") {
    //             g2.drawImage(image, screenX, screenY, 32 * gp.scale, 31 * gp.scale, null); 
    //         }
    //         if(name == "Paper") {
    //             g2.drawImage(image, screenX, screenY, 53 , 55, null); 
    //         }

    //         if(name == "BT1") {
    //             g2.drawImage(image, screenX, screenY, 18 * gp.scale, 16 * gp.scale, null); 
    //         }
    //         if(name == "BT2") {
    //             g2.drawImage(image, screenX, screenY, 19 * gp.scale, 16 * gp.scale, null); 
    //         }
    //         if(name == "GA") {
    //             g2.drawImage(image, screenX, screenY, 30 * gp.scale, 41 * gp.scale, null); 
    //         }
    //         if(name == "GB") {
    //             g2.drawImage(image, screenX, screenY, 26 * gp.scale, 40 * gp.scale, null); 
    //         }
    //         if(name == "GC") {
    //             g2.drawImage(image, screenX, screenY, 30 * gp.scale, 29 * gp.scale, null); 
    //         }
    //         if(name == "P") {
    //             g2.drawImage(image, screenX, screenY, 32 * gp.scale, 77 * gp.scale, null); 
    //         }
    //         if(name == "PB") {
    //             g2.drawImage(image, screenX, screenY, 32 * gp.scale, 57 * gp.scale, null); 
    //         }
    //         if(name == "PoC") {
    //             g2.drawImage(image, screenX, screenY, 21 * gp.scale, 32 * gp.scale, null); 
    //         }
    //         if(name == "SBS") {
    //             g2.drawImage(image, screenX, screenY, 56 * gp.scale, 41 * gp.scale, null); 
    //         }
    //         if(name == "SL") {
    //             g2.drawImage(image, screenX, screenY, 22 * gp.scale, 38 * gp.scale, null); 
    //         }
    //         if(name == "W") {
    //             g2.drawImage(image, screenX, screenY, 58 * gp.scale, 49 * gp.scale, null); 
    //         }
    //         if(name == "FW1") {
    //             g2.drawImage(image, screenX, screenY, (int)(1138/20), (int)(1451/20), null); 
    //         }
    //         if(name == "FW2") {
    //             g2.drawImage(image, screenX, screenY, (int)(1021/20), (int)(1648/20), null); 
    //         }
    //         if(name == "FW3") {
    //             g2.drawImage(image, screenX, screenY, (int)(1256/25), (int)(1648/25), null); 
    //         }
            
    //     }

    // }
}
