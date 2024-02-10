package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_W27 extends SuperObject{
    
    public OBJ_W27() {

        name = "W27";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW27.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}