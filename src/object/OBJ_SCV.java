package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_SCV extends Entity{
    static GamePanel gp;
    public OBJ_SCV() {
        super(gp);
        name = "SCV";
        down1 = setup("res/props/PropsSCV");
        
        solidArea.x = 0;
        solidArea.y = 11*3;
        solidArea.width = 32*3;
        solidArea.height = 46*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
