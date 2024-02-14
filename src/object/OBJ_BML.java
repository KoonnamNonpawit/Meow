package object;



import entity.Entity;
import main.GamePanel;

public class OBJ_BML extends Entity{
    static GamePanel gp;
    public OBJ_BML() {
        super(gp);
        name = "BML";
        down1 = setup("res/struct/StairsBML");
       
    }
}