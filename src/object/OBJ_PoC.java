package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PoC extends Entity{
    static GamePanel gp;
    public OBJ_PoC() {
        super(gp);
        name = "PoC";
        down1 = setup("res/props/PropsPoC");
       
        solidArea.x = 1*3;
        solidArea.y = 22*3;
        solidArea.width = 19*3;
        solidArea.height = 11*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}