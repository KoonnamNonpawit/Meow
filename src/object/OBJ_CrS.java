package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_CrS extends Entity {
    
    static GamePanel gp;

    public OBJ_CrS() {

        super(gp);

        name = "CrS";
        down1 = setup("res/props/PropsCrS");

        solidArea.x = 0;
        solidArea.y = 20*3;
        solidArea.width = 26*3;
        solidArea.height = 19*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
    
}
