package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W2 extends Entity{
    static GamePanel gp;
    public OBJ_W2() {
        super(gp);
        name = "W2";
        down1 = setup("res/tiles/TilesetW2");
       
    }
}
