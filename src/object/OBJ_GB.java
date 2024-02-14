package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_GB extends Entity {
    static GamePanel gp;

    public OBJ_GB() {
        super(gp);
        name = "GB";
        down1 = setup("res/props/PropsGB");

        solidArea.x = 4*3;
        solidArea.y = 23*3;
        solidArea.width = 18*3;
        solidArea.height = 17*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}