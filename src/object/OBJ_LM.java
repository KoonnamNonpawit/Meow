package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_LM extends Entity{
    static GamePanel gp;
    public OBJ_LM() {
        super(gp);
        name = "LM";
        down1 = setup("res/struct/StairsLM");
        
    }
}