package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_P extends SuperObject{
    
    public OBJ_P() {

        name = "P";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBRR.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}