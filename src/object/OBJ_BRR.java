package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BRR extends Entity{
    static GamePanel gp;
    public OBJ_BRR() {
        super(gp);
        name = "BRR";
        down1 = setup("res/struct/StairsBRR");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 8*3;
        solidArea.height = 96*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}