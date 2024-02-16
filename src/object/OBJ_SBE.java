package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_SBE extends Entity{
    static GamePanel gp;
    public OBJ_SBE() {
        super(gp);
        name = "SBE";
        down1 = setup("res/props/PropsSBE");
        
        solidArea.x = 8*3;
        solidArea.y = 11*3;
        solidArea.width = 19*3;
        solidArea.height = 50*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}