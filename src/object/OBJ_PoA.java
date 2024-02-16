package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PoA extends Entity{
    static GamePanel gp;
    public OBJ_PoA() {
        super(gp);
        name = "PoA";
        down1 = setup("res/props/PropsPoA");
       
        solidArea.x = 0;
        solidArea.y = 24*3;
        solidArea.width = 21*3;
        solidArea.height = 10*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}