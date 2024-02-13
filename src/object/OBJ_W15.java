package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W15 extends Entity{
    
    public OBJ_W15() {

        name = "W15";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW15.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
