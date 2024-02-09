package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_W25 extends SuperObject{
    
    public OBJ_W25() {

        name = "W25";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW25.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}

