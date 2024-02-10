package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_W1 extends SuperObject{
    
    public OBJ_W1() {

        name = "W1";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW1.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
