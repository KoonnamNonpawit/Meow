package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Angle extends SuperObject {
    public OBJ_Angle() {

        name = "Angle";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsS.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
        // solidArea.x = 0;
        // solidArea.y = 25*3;
        // solidArea.width = 37*3;
        // solidArea.height = 25*3;
        // solidAreaDefaultX = solidArea.x;
        // solidAreaDefaultY = solidArea.y;
        // collision = true;
    }
}

