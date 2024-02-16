package object;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_BT1 extends Entity{
    static GamePanel gp;
    public OBJ_BT1() {
        super(gp);
        name = "BT1";
        down1 = setup("res/props/PropsBT1");

        try {
            BufferedImage originalImage = ImageIO.read(new FileInputStream("res/props/PropsBT1.png"));

            int newWidth = 85;
            int newHeight = 85;

            image = new BufferedImage(newWidth, newHeight, originalImage.getType());

            Graphics2D g2d = image.createGraphics();

            g2d.drawImage(originalImage, 0, 0, newWidth, newHeight, null);

            g2d.dispose();
        }catch(IOException e) {
            e.printStackTrace();
        }

        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 18*3;
        solidArea.height = 16*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;

        description = "A brick";
       
    }
}