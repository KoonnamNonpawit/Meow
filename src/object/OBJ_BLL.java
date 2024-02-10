package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_BLL extends SuperObject{
    
    public OBJ_BLL() {

        name = "BLL";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLL.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}