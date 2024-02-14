package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Chest extends Entity{
    static GamePanel gp;
    public OBJ_Chest() {
        super(gp);
        name = "Chest";
        down1 = setup("res/props/PropsC");
        down2 = setup("res/props/PropsCO");
       
        solidArea.x = 0;
        solidArea.y = 35*3;
        solidArea.width = 32*3;
        solidArea.height = 14*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
