package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Paper extends SuperObject{
    
    public OBJ_Paper() {

        name = "Paper";
        try {
            image = ImageIO.read(new FileInputStream("res/object/ObjectP.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
