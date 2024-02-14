package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_RPB extends Entity{
    static GamePanel gp;
    public OBJ_RPB() {
        super(gp);
        name = "RPB";
        down1 = setup("res/props/PropsRPB");
        
    }
}
