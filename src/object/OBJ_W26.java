package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W26 extends Entity{
    
    public OBJ_W26() {

        name = "W26";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW26.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}