package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_StairsBLL extends SuperObject{
    
    public OBJ_StairsBLL() {

        name = "StairsBLL";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLL.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}