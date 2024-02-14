package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_RSW extends Entity{
    static GamePanel gp;
    public OBJ_RSW() {
        super(gp);
        name = "RSW";
        down1 = setup("res/props/PropsRSW");
        
    }
}