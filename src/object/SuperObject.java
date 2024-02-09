package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import main.GamePanel;

public class SuperObject {
    
    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    public Rectangle solidArea = new Rectangle();
    public int solidAreaDefaultX;
    public int solidAreaDefaultY;

    public void draw(Graphics2D g2, GamePanel gp) {

        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

        if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
           worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
           worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
           worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

            if(name == "Paper") {
                g2.drawImage(image, screenX, screenY, 53 , 55, null); 
            }
            if(name == "Door") {
                g2.drawImage(image, screenX, screenY, 37 * gp.scale, 50 * gp.scale, null); 
            }
            if(name == "Chest") {
                g2.drawImage(image, screenX, screenY, 32 * gp.scale, 31 * gp.scale, null); 
            }
            if(name == "Angel") {
                g2.drawImage(image, screenX, screenY, 37 * gp.scale, 73 * gp.scale, null); 
            }
        }

    }
}
