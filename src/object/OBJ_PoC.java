package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_PoC extends SuperObject{
    
    public OBJ_PoC() {

        name = "PoC";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBRR.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}