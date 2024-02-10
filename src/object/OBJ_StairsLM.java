package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_StairsLM extends SuperObject{
    
    public OBJ_StairsLM() {

        name = "StairsLM";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsLM.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}