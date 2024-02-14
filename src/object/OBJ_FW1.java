package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_FW1 extends Entity{
    static GamePanel gp;
    public OBJ_FW1() {
        super(gp);
        name = "FW1";
        down1 = setup("res/object/Flower1");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = (int)1138/20;
        solidArea.height = (int)1451/20;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
