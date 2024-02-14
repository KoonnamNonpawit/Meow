package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PB extends Entity{
    static GamePanel gp;
    public OBJ_PB() {
        super(gp);
        name = "PB";
        down1 = setup("res/props/PropsPB");
        
    }
}