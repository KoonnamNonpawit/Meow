package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PoA extends Entity{
    static GamePanel gp;
    public OBJ_PoA() {
        super(gp);
        name = "PoA";
        down1 = setup("res/props/PropsPoA");
       
    }
}