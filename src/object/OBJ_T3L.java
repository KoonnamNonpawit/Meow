package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_T3L extends Entity{
    
    public OBJ_T3L() {

        name = "T3L";
        try {
            image = ImageIO.read(new FileInputStream("res/plant/PlantT3L.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}