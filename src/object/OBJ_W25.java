package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W25 extends Entity {
    static GamePanel gp;

    public OBJ_W25() {
        super(gp);
        name = "W25";
        down1 = setup("res/tiles/TilesetW25");
      
    }
}
