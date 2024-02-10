package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_GT1T extends SuperObject{
    
    public OBJ_GT1T() {

        name = "GT1T";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StructGT1T.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}