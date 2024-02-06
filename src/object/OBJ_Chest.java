package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Chest extends SuperObject{
    
    public OBJ_Chest() {

        name = "Chest";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsC.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
