package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_FW2 extends Entity{
    static GamePanel gp;
    public OBJ_FW2() {
        super(gp);
        name = "FW2";
        down1 = setup("res/object/Flower2");

        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = (int)1021/20;
        solidArea.height = (int)1648/20;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
        } 
    }

