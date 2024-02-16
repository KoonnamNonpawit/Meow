package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PoB extends Entity{
    static GamePanel gp;
    public OBJ_PoB() {
        super(gp);
        name = "PoB";
        down1 = setup("res/props/PropsPoB");
       
        solidArea.x = 1*3;
        solidArea.y = 20*3;
        solidArea.width = 23*3;
        solidArea.height = 7*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}