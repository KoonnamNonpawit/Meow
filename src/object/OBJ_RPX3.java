package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_RPX3 extends Entity{
    static GamePanel gp;
    public OBJ_RPX3() {
        super(gp);
        name = "RPX3";
        down1 = setup("res/props/PropsRPX3");
        
        solidArea.x = 0;
        solidArea.y = 47*3;
        solidArea.width = 26*3;
        solidArea.height = 19*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
