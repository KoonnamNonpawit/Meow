package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Paper extends SuperObject{

    GamePanel gp;
    
    public OBJ_Paper(GamePanel gp) {

        name = "Paper";
        try {
            image = ImageIO.read(new FileInputStream("res/object/ObjectP.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        }catch(IOException e) {
            e.printStackTrace();
        } 
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 16*3;
        solidArea.height = 16*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
}
