package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Chest extends Entity{
    static GamePanel gp;
    public OBJ_Chest() {
        super(gp);
        name = "Chest";
        down1 = setup("res/props/PropsC");
       
    }
}
