package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W8 extends Entity{
    
    public OBJ_W8() {

        name = "W8";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW8.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
