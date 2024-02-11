package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_FW1 extends SuperObject{
    
    public OBJ_FW1() {

        name = "FW1";
        try {
            image = ImageIO.read(new FileInputStream("res/object/Flower1.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
