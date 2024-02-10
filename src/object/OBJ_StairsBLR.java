package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_StairsBLR extends SuperObject{
    
    public OBJ_StairsBLR() {

        name = "StairsBLR";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLR.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}