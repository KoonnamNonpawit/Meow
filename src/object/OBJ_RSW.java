package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_RSW extends Entity{
    static GamePanel gp;
    public OBJ_RSW() {
        super(gp);
        name = "RSW";
        down1 = setup("res/props/PropsRSW");
        
        solidArea.x = 9*3;
        solidArea.y = 15*3;
        solidArea.width = 6*3;
        solidArea.height = 17*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}