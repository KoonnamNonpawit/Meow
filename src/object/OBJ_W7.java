package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_W7 extends SuperObject{
    
    public OBJ_W7() {

        name = "W7";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW7.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
