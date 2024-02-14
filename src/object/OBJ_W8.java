package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_W8 extends Entity{
    static GamePanel gp;
    public OBJ_W8() {
        super(gp);
        name = "W8";
        down1 = setup("res/tiles/TilesetW8");
        
    }
}
