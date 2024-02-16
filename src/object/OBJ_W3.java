package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W3 extends Entity{
    static GamePanel gp;
    public OBJ_W3() {
        super(gp);
        name = "W3";
        down1 = setup("res/tiles/TilesetW3");
        
        solidArea.x = 24*3;
        solidArea.y = 0;
        solidArea.width = 8*3;
        solidArea.height = 32*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}