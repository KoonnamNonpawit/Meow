package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_W19 extends SuperObject{
    
    public OBJ_W19() {

        name = "W19";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW19.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}