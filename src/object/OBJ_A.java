package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_A extends Entity {
    
    static GamePanel gp;

    public OBJ_A() {

        super(gp);

        name = "A";
        down1 = setup("res/props/PropsA");
    }
    
}
