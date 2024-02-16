package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_SBS extends Entity{
    static GamePanel gp;
    public OBJ_SBS() {
        super(gp);
        name = "SBS";
        down1 = setup("res/props/PropsSBS");
      
        solidArea.x = 0;
        solidArea.y = 19*3;
        solidArea.width = 55*3;
        solidArea.height = 16*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}