package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BT1 extends Entity{
    static GamePanel gp;
    public OBJ_BT1() {
        super(gp);
        name = "BT1";
        down1 = setup("res/props/PropsBT1");
       
    }
}