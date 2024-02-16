package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Cr extends Entity {
    
    static GamePanel gp;

    public OBJ_Cr() {

        super(gp);

        name = "Cr";
        down1 = setup("res/props/PropsCr");

        solidArea.x = 0;
        solidArea.y = 23*3;
        solidArea.width = 32*3;
        solidArea.height = 23*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
    
}