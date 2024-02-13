package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_Chest extends Entity{
    
    public OBJ_Chest() {

        name = "Chest";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsC.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
