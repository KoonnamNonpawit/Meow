package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_GB extends Entity{
    
    public OBJ_GB() {

        name = "GB";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsGB.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}