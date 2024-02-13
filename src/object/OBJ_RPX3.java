package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_RPX3 extends Entity{
    
    public OBJ_RPX3() {

        name = "RPX3";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsRPX3.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
        solidArea.x = 0;
        solidArea.y = 47*3;
        solidArea.width = 26*3;
        solidArea.height = 19*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
