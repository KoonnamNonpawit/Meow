package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST6 extends Entity{
    static GamePanel gp;
    public OBJ_ST6() {
        super(gp);
        name = "ST6";
        down1 = setup("res/props/PropsST6");
        
        solidArea.x = 0;
        solidArea.y = 17*3;
        solidArea.width = 27*3;
        solidArea.height = 10*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}