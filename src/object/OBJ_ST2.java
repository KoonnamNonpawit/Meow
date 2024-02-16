package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST2 extends Entity{
    static GamePanel gp;
    public OBJ_ST2() {
        super(gp);
        name = "ST2";
        down1 = setup("res/props/PropsST2");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 16*3;
        solidArea.height = 14*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}