package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_SBW extends Entity{
    static GamePanel gp;
    public OBJ_SBW() {
        super(gp);
        name = "SBW";
        down1 = setup("res/props/PropsSBW");
        
        solidArea.x = 0;
        solidArea.y = 11*3;
        solidArea.width = 19*3;
        solidArea.height = 50*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}