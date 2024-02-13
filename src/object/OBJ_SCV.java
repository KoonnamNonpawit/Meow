package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_SCV extends Entity{
    
    public OBJ_SCV() {

        name = "SCV";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsSCV.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 32*3;
        solidArea.height = 57*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
