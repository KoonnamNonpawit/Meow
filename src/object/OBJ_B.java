package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_B extends Entity {
    
    static GamePanel gp;

    public OBJ_B() {

        super(gp);

        name = "B";
        down1 = setup("res/props/PropsB");
    }
    
}