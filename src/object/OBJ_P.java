package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_P extends Entity{
    static GamePanel gp;
    public OBJ_P() {
        super(gp);
        name = "P";
        down1 = setup("res/props/PropsP");
         
        solidArea.x = 0;
        solidArea.y = 50*3;
        solidArea.width = 32*3;
        solidArea.height = 27*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}