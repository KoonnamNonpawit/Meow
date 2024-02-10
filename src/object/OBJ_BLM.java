package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_BLM extends SuperObject{
    
    public OBJ_BLM() {

        name = "BLM";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLM.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}