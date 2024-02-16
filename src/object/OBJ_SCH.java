package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_SCH extends Entity{
    static GamePanel gp;
    public OBJ_SCH() {
        super(gp);
        name = "SCH";
        down1 = setup("res/props/PropsSCH");
        
        solidArea.x = 0;
        solidArea.y = 11*3;
        solidArea.width = 64*3;
        solidArea.height = 25*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
