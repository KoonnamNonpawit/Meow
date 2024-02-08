package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Angel extends SuperObject {

    // when create new object class add this line
    GamePanel gp;

    // and pass gp through the parameter
    public OBJ_Angel(GamePanel gp) {

        name = "Angel";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsS.png"));
            //this line is also added. 
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
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

