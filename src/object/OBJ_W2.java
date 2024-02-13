package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W2 extends Entity{
    
    public OBJ_W2() {

        name = "W2";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW2.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
