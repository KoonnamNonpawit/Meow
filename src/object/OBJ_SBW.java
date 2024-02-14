package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_SBW extends Entity{
    static GamePanel gp;
    public OBJ_SBW() {
        super(gp);
        name = "SBW";
        down1 = setup("res/props/PropsSBW");
        
    }
}