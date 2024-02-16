package object;
import entity.Entity;
import main.GamePanel;

public class OBJ_BLL extends Entity{
    static GamePanel gp;
    public OBJ_BLL() {
        super(gp);
        name = "BLL";
        down1 = setup("res/struct/StairsBLL");
        
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 8*3;
        solidArea.height = 96*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}