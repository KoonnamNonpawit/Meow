package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_W extends Entity{
    static GamePanel gp;
    public OBJ_W() {
        super(gp);
        name = "W";
        down1 = setup("res/props/PropsW");
        
    }
}