package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_RPB extends Entity{
    static GamePanel gp;
    public OBJ_RPB() {
        super(gp);
        name = "RPB";
        down1 = setup("res/props/PropsRPB");
        down2 = setup("res/props/PropsRPX3");
        down3 = setup("res/props/PropsRPX36");
        
        solidArea.x = 0;
        solidArea.y = 47*3;
        solidArea.width = 26*3;
        solidArea.height = 19*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
