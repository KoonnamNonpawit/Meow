package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_W16 extends Entity{
    static GamePanel gp;
    public OBJ_W16() {
        super(gp);
        name = "W16";
        down1 = setup("res/tiles/TilesetW16");
        
    }
}