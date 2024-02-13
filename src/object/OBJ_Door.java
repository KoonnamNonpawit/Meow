package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_Door extends Entity{
    
    public OBJ_Door() {

        name = "Door";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsWG.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 37*3;
        solidArea.height = 50*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
