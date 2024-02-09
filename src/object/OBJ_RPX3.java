package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_RPX3 extends SuperObject{
    
    public OBJ_RPX3() {

        name = "RPX3";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsRPX3.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
