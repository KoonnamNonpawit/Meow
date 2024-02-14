package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BRR extends Entity{
    static GamePanel gp;
    public OBJ_BRR() {
        super(gp);
        name = "BRR";
        down1 = setup("res/struct/StairsBRR");
        
    }
}