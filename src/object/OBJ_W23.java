package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W23 extends Entity{
    static GamePanel gp;
    public OBJ_W23() {
        super(gp);
        name = "W23";
        down1 = setup("res/tiles/TilesetW23");
     
    }
}
