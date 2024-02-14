package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W1 extends Entity{
    static GamePanel gp;
    public OBJ_W1() {
        super(gp);
        name = "W1";
        down1 = setup("res/tiles/TilesetW1");
        
    }
}
