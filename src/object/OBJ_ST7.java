package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST7 extends Entity{
    static GamePanel gp;
    public OBJ_ST7() {
        super(gp);
        name = "ST7";
        down1 = setup("res/props/PropsST7");
        
        solidArea.x = 0;
        solidArea.y = 23*3;
        solidArea.width = 57*3;
        solidArea.height = 19*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}