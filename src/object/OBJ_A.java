package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_A extends Entity {
    
    static GamePanel gp;

    public OBJ_A() {

        super(gp);

        name = "A";
        down1 = setup("res/props/PropsA");
        down2 = setup("res/props/PropsA1");
        down3 = setup("res/props/PropsA2");
        down4 = setup("res/props/PropsA3");
        down5 = setup("res/props/PropsA4");
    }
    
}
