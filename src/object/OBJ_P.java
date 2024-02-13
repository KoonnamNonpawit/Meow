package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_P extends Entity{
    
    public OBJ_P() {

        name = "P";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsP.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}