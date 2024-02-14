package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BLR extends Entity{
    static GamePanel gp;
    public OBJ_BLR() {
        super(gp);
        name = "BLR";
        down1 = setup("res/struct/StairsBLR");
     
    }
}