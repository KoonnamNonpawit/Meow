package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_BT2 extends SuperObject{
    
    public OBJ_BT2() {

        name = "BT2";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBRR.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}