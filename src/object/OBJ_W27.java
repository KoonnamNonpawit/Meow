package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_W27 extends Entity{
    static GamePanel gp;
    public OBJ_W27() {
        super(gp);
        name = "W27";
        down1 = setup("res/tiles/TilesetW27");
     
    }
}