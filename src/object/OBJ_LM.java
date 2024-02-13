package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_LM extends Entity{
    
    public OBJ_LM() {

        name = "LM";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsLM.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}