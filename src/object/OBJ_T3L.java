package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_T3L extends SuperObject{
    
    public OBJ_T3L() {

        name = "T3L";
        try {
            image = ImageIO.read(new FileInputStream("res/plant/PlantT3L.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}