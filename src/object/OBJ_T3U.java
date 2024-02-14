package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_T3U extends Entity{
    static GamePanel gp;
    public OBJ_T3U() {
        super(gp);
        name = "T3U";
        down1 = setup("res/plant/PlantT3U");
        
    }
}