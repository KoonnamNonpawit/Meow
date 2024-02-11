package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_FW2 extends SuperObject{
    
    public OBJ_FW2() {

        name = "FW2";
        try {
            image = ImageIO.read(new FileInputStream("res/object/Flower2.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
