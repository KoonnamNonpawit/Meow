package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W0 extends Entity{
    
    public OBJ_W0() {

        name = "W0";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW0.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
