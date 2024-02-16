package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_PBT4 extends Entity{
    static GamePanel gp;
    public OBJ_PBT4() {
        super(gp);
        name = "PBT4";
        down1 = setup("res/plant/PlantBT4");
        
        solidArea.x = 14*3;
        solidArea.y = 28*3;
        solidArea.width = 19*3;
        solidArea.height = 9*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}