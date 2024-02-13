package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W23 extends Entity{
    
    public OBJ_W23() {

        name = "W23";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW23.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
