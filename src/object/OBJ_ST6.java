package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST6 extends Entity{
    static GamePanel gp;
    public OBJ_ST6() {
        super(gp);
        name = "ST6";
        down1 = setup("res/props/PropsST6");
        
    }
}