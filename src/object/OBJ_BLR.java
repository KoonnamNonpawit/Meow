package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_BLR extends Entity{
    
    public OBJ_BLR() {

        name = "BLR";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLR.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}