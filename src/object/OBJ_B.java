package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_B extends Entity {
    
    static GamePanel gp;

    public OBJ_B() {

        super(gp);

        name = "B";
        down1 = setup("res/props/PropsB");

        solidArea.x = 1*3;
        solidArea.y = 25*3;
        solidArea.width = 26*3;
        solidArea.height = 11*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
    
}