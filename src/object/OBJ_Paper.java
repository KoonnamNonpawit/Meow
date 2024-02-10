package object;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Paper extends SuperObject{
    
    public OBJ_Paper() {

        name = "Paper";
        try {
            BufferedImage originalImage = ImageIO.read(new FileInputStream("res/object/ObjectP.png"));

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
        solidArea.width = 53;
        solidArea.height = 55;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        description = "[" + name + "]\nCollect to solve the puzzles.";

    }
}
