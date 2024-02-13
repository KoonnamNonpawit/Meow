package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W18 extends Entity{
    
    public OBJ_W18() {

        name = "W18";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW18.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}