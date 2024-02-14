package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST4 extends Entity{
    static GamePanel gp;
    public OBJ_ST4() {
        super(gp);
        name = "ST4";
        down1 = setup("res/props/PropsST4");
        
    }
}