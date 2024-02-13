package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_BML extends Entity{
    
    public OBJ_BML() {

        name = "BML";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBML.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}