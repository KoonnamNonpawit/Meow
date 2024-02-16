package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W0 extends Entity{
    static GamePanel gp;
    public OBJ_W0() {
        super(gp);
        name = "W0";
        down1 = setup("res/tiles/TilesetW0");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 8*3;
        solidArea.height = 32*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
