package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BT2 extends Entity{
    static GamePanel gp;
    public OBJ_BT2() {
        super(gp);
        name = "BT2";
        down1 = setup("res/props/PropsBT2");
       
    }
}