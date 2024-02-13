package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_SL extends Entity{
    
    public OBJ_SL() {

        name = "SL";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsSL.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}