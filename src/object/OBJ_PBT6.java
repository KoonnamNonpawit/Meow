package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_PBT6 extends Entity {
    static GamePanel gp;

    public OBJ_PBT6() {
        super(gp);
        name = "PBT6";
        down1 = setup("res/plant/PlantBT6");

        solidArea.x = 14*3;
        solidArea.y = 17*3;
        solidArea.width = 10*3;
        solidArea.height = 12*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}