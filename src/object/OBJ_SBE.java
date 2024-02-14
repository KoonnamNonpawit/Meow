package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_SBE extends Entity{
    static GamePanel gp;
    public OBJ_SBE() {
        super(gp);
        name = "SBE";
        down1 = setup("res/props/PropsSBE");
        
    }
}