package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_FW3 extends SuperObject{
    
    public OBJ_FW3() {

        name = "FW3";
        try {
            image = ImageIO.read(new FileInputStream("res/object/Flower3.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
