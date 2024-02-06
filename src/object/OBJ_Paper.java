package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Paper extends SuperObject{
    
    public OBJ_Paper() {

        name = "Paper";
        try {
            image = ImageIO.read(new FileInputStream("res/object/ObjectP.png"));
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
