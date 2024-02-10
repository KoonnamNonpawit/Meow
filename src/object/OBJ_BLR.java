package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_BLR extends SuperObject{
    
    public OBJ_BLR() {

        name = "BLR";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLR.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}