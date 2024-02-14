package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_PBT6 extends Entity {
    static GamePanel gp;

    public OBJ_PBT6() {
        super(gp);
        name = "PBT6";
        down1 = setup("res/plant/PlantBT6");

    }
}