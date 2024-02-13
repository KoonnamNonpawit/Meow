package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;

public class OBJ_A extends SuperObject{
    
    public OBJ_A() {

        name = "A";
        try {
            image = ImageIO.read(new FileInputStream("res/props/PropsA.png"));
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
    // super(gp);

    //  name = "A";
    //  down1 = setup("dres/props/PropsA");
}
