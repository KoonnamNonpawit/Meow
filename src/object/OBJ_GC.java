package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_GC extends SuperObject{
    
    public OBJ_GC() {

        name = "GC";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsGC.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}