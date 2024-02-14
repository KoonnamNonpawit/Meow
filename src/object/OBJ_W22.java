package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W22 extends Entity{
    static GamePanel gp;
    public OBJ_W22() {
        super(gp);
        name = "W22";
        down1 = setup("res/tiles/TilesetW22");
       
    }
}