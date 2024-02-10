package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_StructGT1T extends SuperObject{
    
    public OBJ_StructGT1T() {

        name = "StructGT1T";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StructGT1T.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}