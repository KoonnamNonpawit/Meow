package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_BT1 extends SuperObject{
    
    public OBJ_BT1() {

        name = "BT1";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsBT1.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}