package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Chest extends SuperObject{

    GamePanel gp;
    
    public OBJ_Chest(GamePanel gp) {

        name = "Chest";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsC.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
