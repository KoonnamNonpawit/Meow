package object;
import entity.Entity;
import main.GamePanel;

public class OBJ_SL extends Entity{
    static GamePanel gp;
    public OBJ_SL() {
        super(gp);
        name = "SL";
        down1 = setup("res/props/PropsSL");
        
        solidArea.x = 0;
        solidArea.y = 21*3;
        solidArea.width = 22*3;
        solidArea.height = 16*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}