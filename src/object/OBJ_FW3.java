package object;



import entity.Entity;
import main.GamePanel;

public class OBJ_FW3 extends Entity{
    static GamePanel gp;
    public OBJ_FW3() {
        super(gp);
        name = "FW3";
        down1 = setup("res/object/Flower3");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = (int)1256/25;
        solidArea.height = (int)1648/25;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
