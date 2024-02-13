package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_BT2 extends Entity{
    
    public OBJ_BT2() {

        name = "BT2";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsBT2.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}