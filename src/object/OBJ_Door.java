package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Door extends SuperObject{
    
    public OBJ_Door() {

        name = "Door";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsWG.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
        solidArea.x = 0;
        solidArea.y = 25*3;
        solidArea.width = 37*3;
        solidArea.height = 25*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
