package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_SCV extends SuperObject{
    
    public OBJ_SCV() {

        name = "SCV";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsSCV.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
