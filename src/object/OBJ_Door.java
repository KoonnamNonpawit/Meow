package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Door extends SuperObject{
    
    public OBJ_Door() {

        name = "Door";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsWG.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
