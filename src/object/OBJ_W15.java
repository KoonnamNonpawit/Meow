package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_W15 extends Entity {
    static GamePanel gp;

    public OBJ_W15() {
        super(gp);
        name = "W15";
        down1 = setup("res/tiles/TilesetW15");

        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 32*3;
        solidArea.height = 32*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
