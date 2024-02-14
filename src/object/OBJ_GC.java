package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_GC extends Entity {
    static GamePanel gp;

    public OBJ_GC() {
        super(gp);
        name = "GC";
        down1 = setup("res/props/PropsGC");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 30*3;
        solidArea.height = 29*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}