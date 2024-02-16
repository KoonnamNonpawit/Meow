package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W26 extends Entity{
    static GamePanel gp;
    public OBJ_W26() {
        super(gp);
        name = "W26";
        down1 = setup("res/tiles/TilesetW26");
        
        solidArea.x = 24*3;
        solidArea.y = 0;
        solidArea.width = 8*3;
        solidArea.height = 32*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}