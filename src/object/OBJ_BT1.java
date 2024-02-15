package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BT1 extends Entity{
    static GamePanel gp;
    public OBJ_BT1() {
        super(gp);
        name = "BT1";
        down1 = setup("res/props/PropsBT1");

        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 18*3;
        solidArea.height = 16*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
       
    }
}