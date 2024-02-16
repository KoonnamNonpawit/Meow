package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_T3L extends Entity{
    static GamePanel gp;
    public OBJ_T3L() {
        super(gp);
        name = "T3L";
        down1 = setup("res/plant/PlantT3L");
        
        solidArea.x = 51*3;
        solidArea.y = 32*3;
        solidArea.width = 9*3;
        solidArea.height = 32*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}