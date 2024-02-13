package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_SBS extends Entity{
    
    public OBJ_SBS() {

        name = "SBS";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsSBS.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}