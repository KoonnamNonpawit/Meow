package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_W extends Entity{
    
    public OBJ_W() {

        name = "W";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsW.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}