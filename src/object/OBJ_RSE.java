package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_RSE extends Entity{
    static GamePanel gp;
    public OBJ_RSE() {
        super(gp);
        name = "RSE";
        down1 = setup("res/props/PropsRSE");
        
    }
}