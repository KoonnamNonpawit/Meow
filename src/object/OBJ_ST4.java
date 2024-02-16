package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST4 extends Entity{
    static GamePanel gp;
    public OBJ_ST4() {
        super(gp);
        name = "ST4";
        down1 = setup("res/props/PropsST4");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 24*3;
        solidArea.height = 19*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}