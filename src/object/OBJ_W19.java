package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W19 extends Entity{
    static GamePanel gp;
    public OBJ_W19() {
        super(gp);
        name = "W19";
        down1 = setup("res/tiles/TilesetW19");
     
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 32*3;
        solidArea.height = 8*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}