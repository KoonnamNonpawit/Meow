package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Angel extends Entity {

    static GamePanel gp;

    public OBJ_Angel() {

        super(gp);

        name = "Angel";
        down1 = setup("res/props/PropsS");

        solidArea.x = 0;
        solidArea.y = 48*3;
        solidArea.width = 37*3;
        solidArea.height = 25*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}

