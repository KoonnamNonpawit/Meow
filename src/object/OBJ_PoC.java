package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_PoC extends Entity{
    
    public OBJ_PoC() {

        name = "PoC";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsPoC.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}