package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_PB extends Entity{
    
    public OBJ_PB() {

        name = "PB";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsPB.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}