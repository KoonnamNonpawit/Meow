package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Cr extends Entity {
    
    static GamePanel gp;

    public OBJ_Cr() {

        super(gp);

        name = "Cr";
        down1 = setup("res/props/PropsCr");
    }
    
}