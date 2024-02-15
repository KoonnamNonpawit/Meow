package object;



import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_FW3 extends Entity{
    static GamePanel gp;
    public OBJ_FW3() {
        super(gp);
        name = "FW3";
        down1 = setup("res/object/Flower3");

        try {
            BufferedImage originalImage = ImageIO.read(new FileInputStream("res/object/Flower3.png"));

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
        solidArea.width = (int)1256/25;
        solidArea.height = (int)1648/25;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;

        description = "collect 3 of them.";
    }
}
