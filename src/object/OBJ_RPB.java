package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_RPB extends SuperObject{
    
    public OBJ_RPB() {

        name = "RPB";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsRPB.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
