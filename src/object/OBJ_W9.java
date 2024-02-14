package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_W9 extends Entity{
    static GamePanel gp;
    public OBJ_W9() {
        super(gp);
        name = "W9";
        down1 = setup("res/tiles/TilesetW9");
     
    }
}