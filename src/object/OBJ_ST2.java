package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST2 extends Entity{
    static GamePanel gp;
    public OBJ_ST2() {
        super(gp);
        name = "ST2";
        down1 = setup("res/props/PropsST2");
        
    }
}