package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_StairsBLM extends SuperObject{
    
    public OBJ_StairsBLM() {

        name = "StairsBLM";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLM.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}