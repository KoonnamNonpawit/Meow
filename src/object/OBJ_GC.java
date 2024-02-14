package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_GC extends Entity {
    static GamePanel gp;

    public OBJ_GC() {
        super(gp);
        name = "GC";
        down1 = setup("res/props/PropsGC");
        
    }
}