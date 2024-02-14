package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PoC extends Entity{
    static GamePanel gp;
    public OBJ_PoC() {
        super(gp);
        name = "PoC";
        down1 = setup("res/props/PropsPoC");
       
    }
}