package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_GB extends Entity {
    static GamePanel gp;

    public OBJ_GB() {
        super(gp);
        name = "GB";
        down1 = setup("res/props/PropsGB");

    }
}