package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W22 extends Entity{
    static GamePanel gp;
    public OBJ_W22() {
        super(gp);
        name = "W22";
        down1 = setup("res/tiles/TilesetW22");
       
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 8*3;
        solidArea.height = 8*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}