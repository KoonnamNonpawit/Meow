package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Angel extends SuperObject {
    public OBJ_Angel() {

        name = "Angel";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsS.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
        solidArea.x = 0;
        solidArea.y = 48*3;
        solidArea.width = 37*3;
        solidArea.height = 25*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}

