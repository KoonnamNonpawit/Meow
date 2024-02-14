package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W26 extends Entity{
    static GamePanel gp;
    public OBJ_W26() {
        super(gp);
        name = "W26";
        down1 = setup("res/tiles/TilesetW26");
        
    }
}