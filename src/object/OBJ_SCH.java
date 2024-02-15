package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_SCH extends Entity{
    static GamePanel gp;
    public OBJ_SCH() {
        super(gp);
        name = "SCH";
        down1 = setup("res/props/PropsSCH");
        
    }
}
