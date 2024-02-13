package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_RPB extends Entity{
    
    public OBJ_RPB() {

        name = "RPB";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsRPB.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
