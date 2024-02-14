package object;
import entity.Entity;
import main.GamePanel;

public class OBJ_BLL extends Entity{
    static GamePanel gp;
    public OBJ_BLL() {
        super(gp);
        name = "BLL";
        down1 = setup("res/struct/StairsBLL");
        
    }
}