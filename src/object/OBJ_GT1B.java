package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_GT1B extends SuperObject{
    
    public OBJ_GT1B() {

        name = "GT1B";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StructGT1B.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}