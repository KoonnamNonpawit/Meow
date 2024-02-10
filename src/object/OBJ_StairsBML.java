package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_StairsBML extends SuperObject{
    
    public OBJ_StairsBML() {

        name = "StairsBML";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBML.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}