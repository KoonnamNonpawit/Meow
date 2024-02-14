package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_GT1B extends Entity{
    static GamePanel gp;
    public OBJ_GT1B() {
        super(gp);
        name = "GT1B";
        down1 = setup("res/struct/StructGT1B");
        
    }
}