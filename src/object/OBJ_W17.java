package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_W17 extends Entity{
    static GamePanel gp;
    public OBJ_W17() {
        super(gp);
        name = "W17";
        down1 = setup("res/tiles/TilesetW17");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 32*3;
        solidArea.height = 32*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
