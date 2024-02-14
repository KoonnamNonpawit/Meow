package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_FW1 extends Entity{
    static GamePanel gp;
    public OBJ_FW1() {
        super(gp);
        name = "FW1";
        down1 = setup("res/object/Flower1");
    
    }
}
