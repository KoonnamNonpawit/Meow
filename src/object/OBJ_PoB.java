package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PoB extends Entity{
    static GamePanel gp;
    public OBJ_PoB() {
        super(gp);
        name = "PoB";
        down1 = setup("res/props/PropsPoB");
       
    }
}