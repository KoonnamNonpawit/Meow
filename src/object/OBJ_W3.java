package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W3 extends Entity{
    
    public OBJ_W3() {

        name = "W3";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW3.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}