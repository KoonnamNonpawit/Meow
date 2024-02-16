package object;



import entity.Entity;
import main.GamePanel;

public class OBJ_BML extends Entity{
    static GamePanel gp;
    public OBJ_BML() {
        super(gp);
        name = "BML";
        down1 = setup("res/struct/StairsBML");
       
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 8*3;
        solidArea.height = 96*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}