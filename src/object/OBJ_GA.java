package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_GA extends Entity{
    static GamePanel gp;
    public OBJ_GA() {
        super(gp);
        name = "GA";
        down1 = setup("res/props/PropsGA");
         
        solidArea.x = 0;
        solidArea.y = 24*3;
        solidArea.width = 30*3;
        solidArea.height = 17*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}