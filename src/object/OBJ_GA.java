package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_GA extends Entity{
    
    public OBJ_GA() {

        name = "GA";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsGA.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}