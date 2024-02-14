package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_T3L extends Entity{
    static GamePanel gp;
    public OBJ_T3L() {
        super(gp);
        name = "T3L";
        down1 = setup("res/plant/PlantT3L");
        
    }
}