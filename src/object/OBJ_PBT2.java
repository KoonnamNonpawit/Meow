package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_PBT2 extends Entity {
    static GamePanel gp;

    public OBJ_PBT2() {
        super(gp);
        name = "PBT2";
        down1 = setup("res/plant/PlantBT2");

        solidArea.x = 10*3;
        solidArea.y = 14*3;
        solidArea.width = 7*3;
        solidArea.height = 8*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}