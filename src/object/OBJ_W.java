package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_W extends Entity{
    static GamePanel gp;
    public OBJ_W() {
        super(gp);
        name = "W";
        down1 = setup("res/props/PropsW");
        
        solidArea.x = 0;
        solidArea.y = 11*3;
        solidArea.width = 55*3;
        solidArea.height = 38*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}