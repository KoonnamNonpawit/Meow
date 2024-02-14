package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PBT4 extends Entity{
    static GamePanel gp;
    public OBJ_PBT4() {
        super(gp);
        name = "PBT4";
        down1 = setup("res/plant/PlantBT4");
        
    }
}