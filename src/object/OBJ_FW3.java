package object;



import entity.Entity;
import main.GamePanel;

public class OBJ_FW3 extends Entity{
    static GamePanel gp;
    public OBJ_FW3() {
        super(gp);
        name = "FW3";
        down1 = setup("res/object/Flower3");
        
    }
}
