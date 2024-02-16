package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PB extends Entity{
    static GamePanel gp;
    public OBJ_PB() {
        super(gp);
        name = "PB";
        down1 = setup("res/props/PropsPB");
        
        solidArea.x = 0;
        solidArea.y = 30*3;
        solidArea.width = 32*3;
        solidArea.height = 27*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}