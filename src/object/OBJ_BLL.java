package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_BLL extends Entity{
    
    public OBJ_BLL() {

        name = "BLL";
        try {
            image = ImageIO.read(new FileInputStream("res/struct/StairsBLL.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}