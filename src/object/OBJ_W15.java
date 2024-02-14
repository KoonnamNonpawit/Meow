package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W15 extends Entity {
    static GamePanel gp;

    public OBJ_W15() {
        super(gp);
        name = "W15";
        down1 = setup("res/tiles/TilesetW15");

    }
}
