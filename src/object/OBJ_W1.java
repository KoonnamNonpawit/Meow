package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W1 extends Entity{
    
    public OBJ_W1() {

        name = "W1";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW1.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
