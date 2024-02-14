package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_GT1T extends Entity{
    static GamePanel gp;
    public OBJ_GT1T() {
        super(gp);
        name = "GT1T";
        down1 = setup("res/struct/StructGT1T");
         
    }
}