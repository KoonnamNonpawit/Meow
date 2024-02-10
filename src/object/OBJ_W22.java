package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_W22 extends SuperObject{
    
    public OBJ_W22() {

        name = "W22";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW22.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}