package object;
import entity.Entity;
import main.GamePanel;

public class OBJ_SL extends Entity{
    static GamePanel gp;
    public OBJ_SL() {
        super(gp);
        name = "SL";
        down1 = setup("res/props/PropsSL");
        
    }
}