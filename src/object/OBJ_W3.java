package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W3 extends Entity{
    static GamePanel gp;
    public OBJ_W3() {
        super(gp);
        name = "W3";
        down1 = setup("res/tiles/TilesetW3");
        
    }
}