package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_T3U extends Entity{
    
    public OBJ_T3U() {

        name = "T3U";
        try {
            image = ImageIO.read(new FileInputStream("res/plant/PlantT3U.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}