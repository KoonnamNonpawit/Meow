package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_P extends Entity{
    static GamePanel gp;
    public OBJ_P() {
        super(gp);
        name = "P";
        down1 = setup("res/props/PropsP");
         
    }
}