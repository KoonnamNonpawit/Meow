package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BLM extends Entity{
    static GamePanel gp;
    public OBJ_BLM() {
        super(gp);
        name = "BLM";
        down1 = setup("res/struct/StairsBLM");
        
    }
}