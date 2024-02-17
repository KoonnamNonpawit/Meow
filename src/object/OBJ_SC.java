package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_SC extends Entity {
    
    static GamePanel gp;

    public OBJ_SC() {

        super(gp);

        name = "SC";
        down1 = setup("res/props/PropsSC");

        solidArea.x = 0;
        solidArea.y = 23*3;
        solidArea.width = 31*3;
        solidArea.height = 23*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
    
}