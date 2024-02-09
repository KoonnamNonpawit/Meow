package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_W17 extends SuperObject{
    
    public OBJ_W17() {

        name = "W17";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW17.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
