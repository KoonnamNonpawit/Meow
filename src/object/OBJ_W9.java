package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W9 extends Entity{
    
    public OBJ_W9() {

        name = "W9";
        try {
            image = ImageIO.read(new FileInputStream("res/tiles/TilesetW9.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}