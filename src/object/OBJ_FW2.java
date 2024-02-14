package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_FW2 extends Entity{
    static GamePanel gp;
    public OBJ_FW2() {
        super(gp);
        name = "FW2";
        down1 = setup("res/object/Flower2");
        } 
    }

